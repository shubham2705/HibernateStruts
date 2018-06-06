package com.bean;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class RegisterDao {
	public static int saveUser(User u)
	{
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		int i=(Integer)session.save(u);
		tx.commit();
		session.close();
		return i;
	}
	
	

}
