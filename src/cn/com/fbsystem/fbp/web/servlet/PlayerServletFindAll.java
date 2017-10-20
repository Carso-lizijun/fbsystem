package cn.com.fbsystem.fbp.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.fbp.service.PlayerService;

public class PlayerServletFindAll extends HttpServlet {
	
	private PlayerService playerservice=new PlayerService();
	
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

		request.setAttribute("playerlist", playerservice.findAll());
		RequestDispatcher rd=request.getRequestDispatcher("/jsps/AllPlayers.jsp");
		rd.forward(request, response);

		
	}

}
