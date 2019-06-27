package com.techlabs.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.techlabs.services.CustomerServices;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter("/LoginCustomer")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out=response.getWriter();
		if(req.getParameterNames().hasMoreElements()) {
			String userName=request.getParameter("username");
			String password=request.getParameter("password");
			
			String uname=CustomerServices.getInstance().getUname().toLowerCase();
			String pwd=CustomerServices.getInstance().getpwd().toLowerCase();
			System.out.println("u:"+userName+"pwd"+password);
			if(userName.equals(uname) && password.equals(pwd)) {
				chain.doFilter(request, response);
			}
			else {
				out.println("invalid credentials");
			}
		}
		else
			chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
