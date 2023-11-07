package com.deeptech.hibernate.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.Hibernateutil;

public class Delete {

	public static void main(String[] args) {
		SessionFactory st = Hibernateutil.Connection();
		Session ses = st.openSession();
		ses.beginTransaction();
		Employee s = ses.load(Employee.class, 1);
		ses.delete(s);
		ses.getTransaction().commit();
		ses.close();
		st.close();
		System.out.println("delete success");
		

	}

}
