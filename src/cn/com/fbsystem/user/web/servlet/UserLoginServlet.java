package cn.com.fbsystem.user.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.user.domain.User;
import cn.com.fbsystem.user.service.UserException;
import cn.com.fbsystem.user.service.UserService;
import cn.itcast.commons.CommonUtils;

public class UserLoginServlet extends HttpServlet {

	private UserService userservice=new UserService();
	/*
	 * 1. 封装表单数据到form中
	 *
	 * 2. 调用service完成激活
	 *   > 保存错误信息、form到request，转发到login.jsp
	 * 3. 保存用户信息到session中，然后重定向到index.jsp
	 */
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;cahrset=utf-8");
		PrintWriter out = response.getWriter();
		
		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");//命令Tomcat使用UTF-8码表解码，而不用默认的ISO-8859-1了。
		PrintWriter out = response.getWriter();
		
		//封装用户提交的表单数据
		User form =CommonUtils.toBean(request.getParameterMap(), User.class);
		try{
			
			User user=userservice.login(form);
			request.getSession().setAttribute("session_user", user);
			response.sendRedirect("/fbsystem/jsps/main.jsp");
			
		}catch(UserException e){
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/login.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
