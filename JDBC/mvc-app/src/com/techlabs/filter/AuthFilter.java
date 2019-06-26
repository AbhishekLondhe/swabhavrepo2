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
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter({ "/AddCustomer", "/EditCustomer", "/DeleteCustomer" })
public class AuthFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public AuthFilter() {
		// TODO Auto-generated constructor stub
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
		HttpServletRequest req=(HttpServletRequest) request;
		String url="";
		String reqUrl=req.getRequestURI();
		String[] urlArray=reqUrl.split("/");
		url=url+urlArray[2];
		if(req.getParameter("id")!=null) {
			System.out.println("id"+req.getParameter("id"));
			url=url+"?id="+req.getParameter("id");
		}
		HttpSession session=req.getSession();
		if(session.getAttribute("username").equals("")) {
			request.setAttribute("reDirectToUrl", url);
			RequestDispatcher rd=request.getRequestDispatcher("LoginCustomer");
			rd.forward(request, response);
			return;
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
