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
public class NameFilter implements Filter {
    public NameFilter() {
        // TODO Auto-generated constructor stub
    }
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest) request;
		System.out.println("inside NAME filter");
		String name=request.getParameter("name");
		if(name.length()>1)
			chain.doFilter(request, response);
		else
			out.println("invalid Name");
		}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
