package cn.com.fbsystem.user.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.user.domain.User;
import cn.com.fbsystem.user.service.UserException;
import cn.com.fbsystem.user.service.UserService;
import cn.itcast.commons.CommonUtils;

public class UserRegistServlet extends HttpServlet {
	private UserService userservice=new UserService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		/**
		 * 注册验证：1，是否为空，2，是否符合规范，3，是否已经存在于数据库
		 * */
		// 封装表单数据
		User form = CommonUtils.toBean(request.getParameterMap(), User.class);
		/*
		 * 用Map来封装错误信息
		 * */
		Map<String,String> errors=new HashMap<String,String>();
		/*
		 * 2. 获取form中的username、password、email进行校验
		 */
		String username = form.getUsername();
		if(username == null || username.trim().isEmpty()) {
			errors.put("username", "用户名不能为空！");
		} else if(username.length() < 3 || username.length() > 10) {
			errors.put("username", "用户名长度必须在3~10之间！");
		}
		
		String password = form.getPassw();
		if(password == null || password.trim().isEmpty()) {
			errors.put("password", "密码不能为空！");
		} else if(password.length() < 3 || password.length() > 10) {
			errors.put("password", "密码长度必须在3~10之间！");
		}
		
		String email = form.getEmail();
		if(email == null || email.trim().isEmpty()) {
			errors.put("email", "Email不能为空！");
		} else if(!email.matches("\\w+@\\w+\\.\\w+")) {
			errors.put("email", "Email格式错误！");
		}
		/*
		 * 3. 判断是否存在错误信息
		 */
		if(errors.size() > 0) {
			// 1. 保存错误信息
			// 2. 保存表单数据
			// 3. 转发到regist.jsp
			request.setAttribute("errors", errors);
			request.setAttribute("form", form);
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/regist.jsp");
			rd.forward(request, response);
		}
		
		/*
		 * 调用service的regist()方法
		 */
		try {
			userservice.regist(form);
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/login.jsp");
			rd.forward(request, response);
			return;
		} catch (UserException e) {
			/*
			 * 1. 保存异常信息
			 * 2. 保存form
			 * 3. 转发到regist.jsp
			 */
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/regist.jsp");
			rd.forward(request, response);
		}
		return;
	}
	
}
