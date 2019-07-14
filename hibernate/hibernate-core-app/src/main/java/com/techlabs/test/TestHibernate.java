package com.techlabs.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Candidate;

public class TestHibernate {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		try {
			Candidate c1=new Candidate("abhishek","7.71");		
			session.save(c1);
			
			tr.commit();
		}catch(Exception e){
			tr.rollback();
		}
		finally {
			session.close();
		}
	}
		
}
