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

	public void addOneStu(Student stu) { // 插入一条学生记录

		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		session.save(stu);
		session.getTransaction().commit();
		System.out.println("增加成功！");

	}

	public void addOneCourse(Course cr) { // 写入课程的一条记录

		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		session.save(cr);
		session.getTransaction().commit();
		System.out.println("增加成功！");

	}

	public List<Course> InquiryCourse(GradeName gradName, PrefessionName pfsName) { // 查询出来和当前用户的专业与年级相等的所有课程

		List<Course> crList = new ArrayList<Course>();
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();

		if (gradName.equals(GradeName.请选择)) {
			Criteria c = session.createCriteria(Course.class);
			c.add(Restrictions.eq("pfsName", pfsName));
			crList = c.list();
		} else if (pfsName.equals(PrefessionName.请选择)) {
			Criteria c = session.createCriteria(Course.class);
			c.add(Restrictions.eq("grdName", gradName));
			crList = c.list();
		} else {

			Criteria c = session.createCriteria(Course.class); // 条件查询
																// 把和当前用户的专业和
																// 年级相同的课程拿出来
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

	public void delteStu(int id) { // 各个表未设置级联关系 此删除 为删除和 该记录有关的数据表的信息
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();
		Student stu = (Student) session.get(Student.class, id);
		session.delete(stu);
		session.getTransaction().commit();

	}

	public List<Student> InquiryStu(GradeName gradName, PrefessionName pfsName) { // 查询出来和当前用户的专业与年级相等的所有课程

		List<Student> crList = new ArrayList<Student>();
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		session.beginTransaction();

		if (gradName.equals(GradeName.请选择)) {
			Criteria c = session.createCriteria(Student.class);
			c.add(Restrictions.eq("pfsName", pfsName));
			crList = c.list();
		} else if (pfsName.equals(PrefessionName.请选择)) {
			Criteria c = session.createCriteria(Student.class);
			c.add(Restrictions.eq("grdName", gradName));
			crList = c.list();
		} else {

			Criteria c = session.createCriteria(Student.class); // 条件查询
																// 把和当前用户的专业和
																// 年级相同的课程拿出来
			c.add(Restrictions.eq("grdName", gradName));
			c.add(Restrictions.eq("pfsName", pfsName));
			crList = c.list();
		}

		return crList;
	}

}
