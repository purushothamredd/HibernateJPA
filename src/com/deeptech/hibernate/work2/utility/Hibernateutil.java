package com.deeptech.hibernate.work2.utility;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {

		private static SessionFactory sessionfactory;
		static 
		{
			sessionfactory = new Configuration().configure().buildSessionFactory();
			//sessionfactory is used to call hibernate configuration file
		}
		
		public static SessionFactory Connection() 
		{
			return sessionfactory;
		}
		
	}
		

