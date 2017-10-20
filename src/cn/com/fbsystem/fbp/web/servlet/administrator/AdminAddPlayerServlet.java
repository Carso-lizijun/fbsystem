package cn.com.fbsystem.fbp.web.servlet.administrator;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.com.fbsystem.fbp.domain.Player;
import cn.com.fbsystem.fbp.service.PlayerService;
import cn.itcast.commons.CommonUtils;


public class AdminAddPlayerServlet extends HttpServlet{
	
	/**
	 * 添加图书
	 * */
	private PlayerService playerservice=new PlayerService();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * 1. 把表单数据封装到Book对象中
		 *   * 上传三步
		 */
		// 创建工厂,  采用参数指定临界值和系统临时文件夹构造文件项工厂对象。
		DiskFileItemFactory factory = new DiskFileItemFactory(15 * 1024, new File("F:/f/temp"));
		// 得到解析器
		ServletFileUpload sfu = new ServletFileUpload(factory);
		// 设置单个文件大小为15KB
		sfu.setFileSizeMax(30 * 1024);
		// 使用解析器去解析request对象，得到List<FileItem>
		
		try {
			List<FileItem> fileItemList = sfu.parseRequest(request);
			/*
			 * * 把fileItemList中的数据封装到Book对象中
			 *   > 把所有的普通表单字段数据先封装到Map中
			 *   > 再把map中的数据封装到Book对象中
			 */
			Map<String,String> map = new HashMap<String,String>();
			for(FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()) {
					map.put(fileItem.getFieldName(), fileItem.getString("UTF-8"));
				}
			}
			
		Player player=CommonUtils.toBean(map, Player.class);
		
		/*
		 * 2. 保存上传的文件
		 *   * 保存的目录
		 *   * 保存的文件名称
		 */
		// 得到保存的目录
		String savepath = this.getServletContext().getRealPath("/pimages");
		// 得到文件名称：给原来文件名称添加uuid前缀！避免文件名冲突
					String filename = CommonUtils.uuid() + "_" + fileItemList.get(1).getName();
		
		/*
		 * 校验文件的扩展名
		 */
		if(!filename.toLowerCase().endsWith("jpg")) {
			request.setAttribute("msg", "您上传的图片不是JPG扩展名！");
			request.getRequestDispatcher("/adminjsps/addplayer.jsp")
					.forward(request, response);
			return;
		}
		
		// 使用目录和文件名称创建目标文件
		File destFile = new File(savepath, filename);
		// 保存上传文件到目标文件位置
		fileItemList.get(1).write(destFile);
		/*
		 * 3. 设置Player对象的pimage，即把图片的路径设置给Player的pimage
		 */		
		player.setPimage("book_img/"+filename);
		/*
		 * 4. 使用PlayerService完成保存
		 */
		
		playerservice.addPlayer(player);
		
		/*
		 * 校验图片的尺寸
		 */
		Image image = new ImageIcon(destFile.getAbsolutePath()).getImage();
		if(image.getWidth(null) > 800 || image.getHeight(null) > 900) {
			destFile.delete();//删除这个文件！
			request.setAttribute("msg", "您上传的图片尺寸超出了800 * 900！");
			request.getRequestDispatcher("/adminjsps/addplayer.jsp")
					.forward(request, response);
			return;
		}
		/*
		 * 5. 返回到球员列表
		 */
		request.getRequestDispatcher("")
				.forward(request, response);
	}catch (Exception e) { 
			if(e instanceof FileUploadBase.FileSizeLimitExceededException) {
				request.setAttribute("msg", "您上传的文件超出了15KB");
				request.getRequestDispatcher("/adminjsps/addplayer.jsp")
						.forward(request, response);
			}
		}
		
	}
}