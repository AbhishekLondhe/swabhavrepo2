package com.techlabs.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FormFilter
 */
@WebFilter("/AddCustomer")
public class FormFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public FormFilter() {

	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("inside Form filter");
		if (req.getParameterNames().hasMoreElements()) {
			if (req.getParameter("firstname").equals("") || req.getParameter("lastname").equals("")
					|| req.getParameter("balance").equals("") || req.getParameter("dob").equals("")
					|| req.getParameter("cardtype").equals("")) {
				RequestDispatcher view = request.getRequestDispatcher("addCustomer.jsp");
				view.forward(request, response);
				return;
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
