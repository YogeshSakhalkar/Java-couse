package hibernateExample;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(1,"samin");
		Configuration kgf= new Configuration();
		kgf.configure("cfg.xml");
		SessionFactory factory=kgf.buildSessionFactory();
		Session ses= factory.openSession();
		org.hibernate.Transaction tr=ses.beginTransaction();
		ses.save(s);
		tr.commit();
		ses.close();
	}

}
