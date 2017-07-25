package core.logic;

import org.hibernate.Query;
import org.hibernate.Session;
import core.entity.Student;
import core.util.HibernateSessionFactory;

public class StudentUpdate {

	public void sUpdate(int id, Student ts) {
		// �û��޸ĵ���ϢΪ��ȷ���Ķ��ѡ�� ���Ը��µ�ȫ����Ϣ

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
		System.out.println("�޸ĳɹ�");

	}

}
