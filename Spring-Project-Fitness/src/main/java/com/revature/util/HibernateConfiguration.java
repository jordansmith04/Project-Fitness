package com.revature.util;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

	// Interface of Hibernate responsible for providing sessions with
	// the properties specified in our XML config file.
	private static SessionFactory sessionFactory;

	
	public static Session getSession() {
		try {
			if (sessionFactory == null) {
				sessionFactory = new Configuration().configure()
						.setProperty("hibernate.connection.url", System.getenv("url"))
						.setProperty("hibernate.connection.username", System.getenv("username"))
						.setProperty("hibernate.connection.password", System.getenv("password")).buildSessionFactory();
			}
			return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return null;
	}

}
