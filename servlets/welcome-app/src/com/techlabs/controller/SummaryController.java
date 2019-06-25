package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SummaryController
 */
@WebServlet("/summary")
public class SummaryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SummaryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = getServletContext();
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		out.println("<h3>session </h3>");
		out.println("<br><h3>old value:" + session.getAttribute("count") + "</h3>");
		out.println("<br><h3>session.id:" + session.getId() + "</h3>");
		out.println("<br><h3>application</h3>");
		out.println("<br><h3>old value:" + application.getAttribute("count") + "</h3>");
		out.println("<br><h3>session.id:" + session.getId() + "</h3>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
