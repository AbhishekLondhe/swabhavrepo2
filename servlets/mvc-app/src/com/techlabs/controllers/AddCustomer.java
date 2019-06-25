package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.services.CustomerServices;

/**
 * Servlet implementation class addCustomer
 */
@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CardType card;
	private List<Customer> newCustomer = new ArrayList<Customer>();

	public AddCustomer() {
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
		//if (session.getAttribute("username").equals("")) {
			//request.setAttribute("reDirectToUrl", "AddCustomer");
		//	RequestDispatcher rd = request.getRequestDispatcher("LoginCustomer");
		//	rd.forward(request, response);
		//	return;
		//}
		RequestDispatcher view = request.getRequestDispatcher("addCustomer.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id") ;
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		double balance = Double.parseDouble(request.getParameter("balance"));
		String dob = request.getParameter("dob");
		if (request.getParameter("cardtype").equalsIgnoreCase("credit")) {
			card = card.credit;
		} else {
			card = card.debit;
		}
		newCustomer = CustomerServices.getInstance().getCustomer();
		//if (CustomerServices.getInstance().getCustomerById(id) != null) {
			//Customer customer = CustomerServices.getInstance().getCustomerById(id);
		//	customer.setFirstName(firstName);
			//customer.setLastName(lastName);
		//	return;
		//}

		//if (CustomerServices.getInstance().getCustomerById(id) == null) {
			CustomerServices.getInstance().addCustomer(new Customer(firstName, lastName, dob, balance, card));
			request.setAttribute("customer", newCustomer);
			RequestDispatcher view = request.getRequestDispatcher("customer.jsp");
			view.forward(request, response);
			//return;
		//}

	}

}
