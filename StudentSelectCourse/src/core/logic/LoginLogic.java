package core.logic;


import org.hibernate.Session;

import java.util.*;
import core.entity.GradeName;
import core.entity.Manager;
import core.entity.PrefessionName;
import core.entity.SexType;
import core.entity.Student;
import core.util.HibernateSessionFactory;

public class LoginLogic {
	
	
	public void insertStu( Student stu) {


		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(stu);
		
		session.getTransaction().commit();

	}


	public Student stuLogin(int id) {
		
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		System.out.println(" xzq");
		System.out.println(id);
		Student stu = (Student) session.get(Student.class, id);
		System.out.println(" xzq0");
		System.out.println(stu.getSpassword()+"-----"+stu.getGrdName()+"=="+stu.getPfsName()+"==");
		System.out.println(" xzq2");
		
		session.getTransaction().commit();
		return stu;

		
	}
	

	public Manager mngLogin(int id) {
		
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Manager mng=(Manager)session.get(Manager.class,id);
		System.out.println(mng.getMpassword()+"-----"+mng.getMname());
		
		session.getTransaction().commit();
		return mng;


	}
}
