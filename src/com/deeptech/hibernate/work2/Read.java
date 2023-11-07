package com.deeptech.hibernate.work2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.mapping.List;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.Hibernateutil;

//import antlr.collections.List;

public class Read {

	public static void main(String[] args) {
		SessionFactory st = Hibernateutil.Connection();
		Session ses = st.openSession();
		ses.beginTransaction();//perform DML operation(insert,update,delete,read)
		//collection
        Query q = ses.createQuery("from Employee");
        List<Employee> stt = q.list();
        for(Employee s:stt)
        {
        	System.out.println(s.getEmpname()+"\t"+s.getEmpname()+"\t"+s.getDesigation()+"\t"+s.getSalary()+"\t"+s.getSalary());
        }
        ses.getTransaction().commit();
       
        
        
	}

}
