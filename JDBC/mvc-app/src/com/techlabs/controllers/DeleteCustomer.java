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

import com.techlabs.services.CustomerServices;

/**
 * Servlet implementation class DeleteCustomer
 */
@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String ID;
	private String url;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ID = request.getParameter("id");		
		//if (session.getAttribute("username").equals("")) {
		//	request.setAttribute("reDirectToUrl","DeleteCustomer?id="+ID);
		//	System.out.println("set "+request.getAttribute("reDirectToUrl"));
		//	RequestDispatcher rd = request.getRequestDispatcher("LoginCustomer");
		//	rd.forward(request, response);
		//	return;
		//}
		PrintWriter out = response.getWriter();
		System.out.println(ID);
		CustomerServices.getInstance().removeCustomerById(ID);
		out.println("customer delete");
		response.sendRedirect("CustomerController");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
