package com.techlabs.controllers;

import java.io.IOException;
import java.util.List;

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

@WebServlet("/EditCustomer")
public class EditCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CardType card;
	private String ID = "";

	public EditCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ID = request.getParameter("id");
		System.out.println("session" + session.getAttribute("username") == null);
		//if (session.getAttribute("username").equals("")) {
			//request.setAttribute("reDirectToUrl", "EditCustomer?id=" + ID);
		//	RequestDispatcher rd = request.getRequestDispatcher("LoginCustomer");
		//	rd.forward(request, response);
		//	return;
		//}
		System.out.println("get" + ID);
		Customer customer = CustomerServices.getInstance().getCustomerById(ID);
		System.out.println(customer.getFirstName());
		request.setAttribute("editCustomer", customer);
		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post" + ID);
		Customer customer = CustomerServices.getInstance().getCustomerById(ID);
		System.out.println("post" + customer.getFirstName());
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		double balance = Double.parseDouble(request.getParameter("balance"));
		String dob = request.getParameter("dob");
		if (request.getParameter("cardtype").equalsIgnoreCase("credit")) {
			card = card.credit;
		} else {
			card = card.debit;
		}
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setBalance(balance);
		customer.setDob(dob);
		customer.setCard(card);
		response.sendRedirect("CustomerController");
		// request.setAttribute("editCustomer", customer);
		// RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		// rd.forward(request, response);

	}

}
