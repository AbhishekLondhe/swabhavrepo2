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

import com.techlabs.model.Customer;
import com.techlabs.services.CustomerServices;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Customer> customers;

	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		customers = CustomerServices.getInstance().getCustomer();
		request.setAttribute("customer", customers);
		RequestDispatcher view = request.getRequestDispatcher("customer.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
