package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionController
 */
@WebServlet("/session")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		Object oldValue=null;
		int newValue=0,oldValueInt=0;
		if(session.getAttribute("count")==null)
		{
		    session.setAttribute("count",0);
		}
		oldValue=session.getAttribute("count");
		oldValueInt= (int) oldValue;
		newValue=oldValueInt+1;
		session.setAttribute("count",newValue);
		out.println("<br>old value"+oldValue);
		out.println("<br>new value"+newValue);
		out.println("<br>session id"+session.getId());
		out.println("<br><a href='summary'>summary</a>");



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
