package com.deeptech.hibernate.work2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.Hibernateutil;

public class Create {

	public static void main(String[] args) {
		Employee s = new Employee();
        s.setEmpname("purushotham");
        s.setDesigation("BE");
        s.setSalary(1233);
        
        SessionFactory st = Hibernateutil.Connection();
        Session ses = st.openSession();
        ses.beginTransaction();
        ses.save(s);
        System.out.println(" Table insert  record success");
        ses.getTransaction().commit();
        ses.close();
        st.close();
        
	}

}
