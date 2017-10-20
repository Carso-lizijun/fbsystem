package cn.com.fbsystem.fbnews.web.servlet.adminnews;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.fbnews.domain.News;
import cn.com.fbsystem.fbnews.service.NewsService;
import cn.itcast.commons.CommonUtils;

public class AdminNews extends HttpServlet {

	private NewsService newsservice =new NewsService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		//封装表单数据
		News formnews=CommonUtils.toBean(request.getParameterMap(), News.class);
		System.out.println(formnews.getTime1());
		System.out.println(formnews.getTime2());
		System.out.println(formnews.getTime3());
		System.out.println(formnews.getTime4());
		
		
		/*
		 * 用Map来封装错误信息
		 * */
		Map<String,String> errors=new HashMap<String,String>();
		
		newsservice.AdminNews(formnews);
		RequestDispatcher rd=request.getRequestDispatcher("/adminjsps/adminnews.jsp");
		rd.forward(request, response);
		return;
	}

}
