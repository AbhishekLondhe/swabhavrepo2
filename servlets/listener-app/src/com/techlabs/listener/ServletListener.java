package com.techlabs.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletListener implements ServletContextListener {

    public ServletListener() {
    }
    public void contextDestroyed(ServletContextEvent arg0)  { 
    }
    public void contextInitialized(ServletContextEvent arg0)  { 

    	System.out.println("context is initialized");
    }
	
}
