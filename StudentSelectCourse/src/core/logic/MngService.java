package core.logic;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import core.entity.Course;
import core.entity.GradeName;
import core.entity.PrefessionName;
import core.entity.Student;
import core.util.HibernateSessionFactory;

public class MngService {

	public void addOneStu(Student stu) { // ����һ��ѧ����¼

		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		session.save(stu);
		session.getTransaction().commit();
		System.out.println("���ӳɹ���");

	}

	public void addOneCourse(Course cr) { // д��γ̵�һ����¼

		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		session.save(cr);
		session.getTransaction().commit();
		System.out.println("���ӳɹ���");

	}

	public List<Course> InquiryCourse(GradeName gradName, PrefessionName pfsName) { // ��ѯ�����͵�ǰ�û���רҵ���꼶��ȵ����пγ�

		List<Course> crList = new ArrayList<Course>();
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();

		if (gradName.equals(GradeName.��ѡ��)) {
			Criteria c = session.createCriteria(Course.class);
			c.add(Restrictions.eq("pfsName", pfsName));
			crList = c.list();
		} else if (pfsName.equals(PrefessionName.��ѡ��)) {
			Criteria c = session.createCriteria(Course.class);
			c.add(Restrictions.eq("grdName", gradName));
			crList = c.list();
		} else {

			Criteria c = session.createCriteria(Course.class); // ������ѯ
																// �Ѻ͵�ǰ�û���רҵ��
																// �꼶��ͬ�Ŀγ��ó���
			c.add(Restrictions.eq("grdName", gradName));
			c.add(Restrictions.eq("pfsName", pfsName));
			crList = c.list();
		}

		return crList;
	}

	public void delteCourse(int id) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		Course cr = (Course) session.get(Course.class, id);
		session.delete(cr);
		session.getTransaction().commit();

	}

	public void delteStu(int id) { // ������δ���ü�����ϵ ��ɾ�� Ϊɾ���� �ü�¼�йص����ݱ����Ϣ
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		Student stu = (Student) session.get(Student.class, id);
		session.delete(stu);
		session.getTransaction().commit();

	}

	public List<Student> InquiryStu(GradeName gradName, PrefessionName pfsName) { // ��ѯ�����͵�ǰ�û���רҵ���꼶��ȵ����пγ�

		List<Student> crList = new ArrayList<Student>();
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();

		if (gradName.equals(GradeName.��ѡ��)) {
			Criteria c = session.createCriteria(Student.class);
			c.add(Restrictions.eq("pfsName", pfsName));
			crList = c.list();
		} else if (pfsName.equals(PrefessionName.��ѡ��)) {
			Criteria c = session.createCriteria(Student.class);
			c.add(Restrictions.eq("grdName", gradName));
			crList = c.list();
		} else {

			Criteria c = session.createCriteria(Student.class); // ������ѯ
																// �Ѻ͵�ǰ�û���רҵ��
																// �꼶��ͬ�Ŀγ��ó���
			c.add(Restrictions.eq("grdName", gradName));
			c.add(Restrictions.eq("pfsName", pfsName));
			crList = c.list();
		}

		return crList;
	}

}
