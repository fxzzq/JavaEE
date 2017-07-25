package core.logic;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import core.entity.Course;
import core.entity.SelectResult;
import core.entity.Student;
import core.util.HibernateSessionFactory;

public class CourseService2 {

	public List<Course> conditionInquiry(Student stu) {  
		//查询出来和当前学生的专业与年级相等的所有课程 
		
		List<Course> crList=new ArrayList<Course>();
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//Criteria是一种比hql更面向对象的查询方式
		try {
			Criteria c = session.createCriteria(Course.class);       
			//条件查询  把和当前用户的专业和 年级相同的课程拿出来
			c.add(Restrictions.eq("grdName", stu.getGrdName()));
			c.add(Restrictions.eq("pfsName", stu.getPfsName()));
			
			crList=c.list();

		} finally {
			if (session != null)
				session.close();
		}


		return crList;
	}
	
	
	public String compareExist(String sname,String cname){ 
		//判断一下选择的课程是否已经选过
																							//把当前的用户名和用户要选的课程名传过来
		CourseService cs=new CourseService();
		List<String> cnameList=cs.OneStuCourse(sname);  
		//先把当前用户所选的课程名用list接收过来
		
		for(int i=0;i<cnameList.size();i++){
			while(cnameList.get(i).equals(cname)){
				System.out.println("来这里几次了");
				return "exist";
			}
		}
		insertNoExist(sname,cname);
		return	"noExist";
		
	}
	
	
	public void insertNoExist(String sname,String cname){ 
		//将所选的课程插入到select_relust
		SelectResult sr=new SelectResult();
		sr.setSname(sname);
		sr.setCname(cname);
		
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(sr);
		session.getTransaction().commit();
		
	}
	
	public void delteCourse(int id){  
		//各个表未设置级联关系  此删除 为删除和 该记录有关的数据表的信息
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
       Course cr = (Course) session.get(Course.class, id);  
        session.delete(cr);
        session.getTransaction().commit();
		
	}
	

	



}
