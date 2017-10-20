package cn.com.fbsystem.fbnews.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.fbnews.domain.News;
import cn.com.fbsystem.fbnews.service.NewsService;

public class ShowAllGameNews extends HttpServlet {

	private NewsService newsservice=new NewsService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		request.setAttribute("gamenewslist", newsservice.findAllNews());
		System.out.println(newsservice.findAllNews().getTime1());
		System.out.println();
	
		RequestDispatcher rd=request.getRequestDispatcher("/jsps/footballnews.jsp");
		rd.forward(request, response);
		
	}

}
