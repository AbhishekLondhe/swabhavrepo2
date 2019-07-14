package com.techlabs.crud;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Candidate;

public class CandidateCrud {

	public static void main(String args[]) {
		// getCandidate(2);
		// deleteCandidate();
		updateCandidate();

	}

	public static Candidate getCandidate(long id) {
		Candidate c = null;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		c = (Candidate) session.get(Candidate.class, id);

		System.out.println("id:" + c.getId());
		System.out.println("name:" + c.getName());
		System.out.println("cgpa:" + c.getCgpa());
		return c;
	}

	public static void deleteCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("delete from Candidate where id=1");
		query.executeUpdate();
	}

	public static void updateCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("update Candidate set name= :Name1 where id=1");
		query.setParameter("Name1", "deepak");
		query.executeUpdate();
	}
}
