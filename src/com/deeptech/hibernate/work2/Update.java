package com.deeptech.hibernate.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.Hibernateutil;

public class Update {

	public static void main(String[] args) {
		SessionFactory st = Hibernateutil.Connection();
		Session ses = st.openSession();
		ses.beginTransaction();//perform DML operation(insert,update,delete,read)
		//collection
		 
		Employee s = ses.get(Employee.class, 1);
		s.setEmpname("Praveen");
		ses.getTransaction().commit();
		ses.close();
		st.close();
		System.out.println("Update success");
		

	}

}

