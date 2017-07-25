package core.logic;

import org.hibernate.Query;
import org.hibernate.Session;
import core.entity.Student;
import core.util.HibernateSessionFactory;

public class StudentUpdate {

	public void sUpdate(int id, Student ts) {
		// 用户修改的信息为不确定的多个选项 所以更新的全部信息

		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, id);
		s.setSname(ts.getSname());
		s.setSpassword(ts.getSpassword());
		s.setSxtp(ts.getSxtp());
		s.setSaddress(ts.getSaddress());
		s.setPfsName(ts.getPfsName());
		s.setGrdName(ts.getGrdName());
		session.update(s);
		session.getTransaction().commit();
		System.out.println("修改成功");

	}

}
