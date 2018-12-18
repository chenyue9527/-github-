package com.shop.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTools {
    public static SessionFactory sessionfactory = null;
    
    static {
    	Configuration conf = new Configuration().configure();
    	sessionfactory = conf.buildSessionFactory();
    	
    }
    
    public static Session getSession() {
    	Session session = sessionfactory.openSession();
    	
    	return session ;
    }
}
