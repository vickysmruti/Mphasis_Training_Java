package com.mphasis.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mphasis.entity.EProduct;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	public static SessionFactory buildSessionFactory(){
		if(sessionFactory==null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(EProduct.class);
			
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
