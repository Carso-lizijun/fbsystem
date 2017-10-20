package cn.com.fbsystem.fbp.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.fbsystem.fbp.service.PlayerNotFountException;
import cn.com.fbsystem.fbp.service.PlayerService;

public class FindByCountryServlet extends HttpServlet {

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
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String pcountry=(String)request.getParameter("pcountry");
		System.out.println(pcountry);
		try {
			request.setAttribute("playerlist", playerservice.findByCountry(pcountry));
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/CPlayer.jsp");
			rd.forward(request, response);
		} catch (PlayerNotFountException e) {
			request.setAttribute("msg", e.getMessage());
			RequestDispatcher rd=request.getRequestDispatcher("/jsps/PlayerFindByCondition.jsp");
			rd.forward(request, response);
		}
		
	}

}
