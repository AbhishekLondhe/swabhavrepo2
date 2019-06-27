package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCustomer
 */
@WebServlet("/LoginCustomer")
public class LoginCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String url;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		url = (String) request.getAttribute("reDirectToUrl");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");		
		if (userName.equals("admin") && password.equals("admin")) {
			session.setAttribute("username", userName);
			System.out.println("url" + url);
			response.sendRedirect(url);
			//RequestDispatcher rd = request.getRequestDispatcher(url);
			//rd.forward(request, response);
		} else {
			out.println("invalid credentials");
		}
	}

}
