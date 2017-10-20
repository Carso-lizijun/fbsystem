package cn.com.fbsystem.ubg.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.ubg.domain.Umasks;
import cn.com.fbsystem.ubg.service.UBGService;
import cn.itcast.commons.CommonUtils;

public class UploadGussingInfo extends HttpServlet {

	private UBGService ubgservice=new UBGService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");//命令Tomcat使用UTF-8码表解码，而不用默认的ISO-8859-1了。
		PrintWriter out = response.getWriter();
		
		//封装表单数据
		Umasks FUmasks=CommonUtils.toBean(request.getParameterMap(), Umasks.class);
		System.out.println(FUmasks.getUsername());
		System.out.println(FUmasks.getSummasks());
		System.out.println(FUmasks.getDgame1());
		System.out.println(FUmasks.getDmask1());
		System.out.println(FUmasks.getDgame2());
		System.out.println(FUmasks.getDmask2());
		System.out.println(FUmasks.getDgame3());
		System.out.println(FUmasks.getDmask3());
		
		ubgservice.insertubg(FUmasks);
		request.setAttribute("msg", "下注成功！");
		RequestDispatcher rd=request.getRequestDispatcher("/jsps/ubgorder.jsp");
		rd.forward(request, response);
		
	}

}
