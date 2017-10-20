package cn.com.fbsystem.fbp.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.fbp.service.PlayerNotFountException;
import cn.com.fbsystem.fbp.service.PlayerService;

public class FindByClubServlet extends HttpServlet {

	private PlayerService playerservice=new PlayerService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		
		String pclub=(String)request.getParameter("pclub");
		System.out.println(pclub);
		try {
			request.setAttribute("playerlist", playerservice.findByClub(pclub));
			
			List list =new ArrayList();
			list.addAll((Collection) request.getAttribute("playerlist"));
			Iterator it=list.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/showplayerbyclub.jsp");
			rd.forward(request, response);
		} catch (PlayerNotFountException e) {
			request.setAttribute("msg", e.getMessage());
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/showplayerbyclub.jsp");
			rd.forward(request, response);
		}
		
		
	}
	
	
}
