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

@WebFilter("/filterdemo")
public class IdFilter implements Filter {

    public IdFilter() {
    }

	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest) request;
		System.out.println("inside ID filter");
		int id=Integer.parseInt((request.getParameter("id")));
		if(id>=1)
			chain.doFilter(request, response);
		else
			out.println("invalid ID");
			
	}

	public void init(FilterConfig fConfig) throws ServletException {
		}

}
