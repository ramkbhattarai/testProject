package com.revvit.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Session session;
	private static SessionFactory sesFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public static Session getSession() {
		if(session == null) {
			
			session = sesFactory.openSession();
			return session;
		}
		return session;
	}
	
	public static void closeSession() {
		session.close();
		sesFactory.close();
	}
}
