package core.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import core.entity.Course;
import core.entity.SelectResult;

import core.util.HibernateSessionFactory;

public class CourseService {
	
	public List<Course> handle(String name){
		List<Course> csList=new ArrayList<Course>();
		List<String> courseList=OneStuCourse(name); 
		//先把当前用户所选的课程名用list接收过来
		
		Iterator<String> itr = courseList.iterator();    
		//对 该list遍历
		while (itr.hasNext()) {
		    String courseName=(String) itr.next();
		    System.out.println("是到这了否"+courseName);
		   Course objCouse= detailOfCourse(courseName); 
		   //把每门课的详细信息读出来
		   csList.add(objCouse);			
		   //放到list里面
		   
		}
		

		return csList;
		
	}
	
	//查询SelectResult 把一个用户的所选的所有课程查询出来  有添加到list里面
	public List<String> OneStuCourse(String name) {
		List<String> clist = new ArrayList<String>();
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {

			String hql = "from SelectResult as srt where srt.sname=:studentName";
			Query query = session.createQuery(hql);
			query.setString("studentName", name);

			
			List<SelectResult> list = query.list();
			for (SelectResult sr : list) {
				System.out.println(sr.getCname()+"测试一下");
				clist.add(sr.getCname());
			}
		} finally {
			if (session != null)
				session.close();
		}

		return clist;
	}

	//接收一个课程名  返回课程类Course的一个对象
	public Course detailOfCourse(String name) {
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Course  cs=new Course();
		
		try {

			String hql = "from Course as cs where cs.cname=:courseName";
			Query query = session.createQuery(hql);
			query.setString("courseName", name);

			List<Course> list = query.list();

			for (Course sr : list) {
				cs.setCid(sr.getCid());  //不可以漏掉这句话 否则后面学生退选功能需要传递id 此时没有获取  后面就没哟d 导致对选功能不好使
				cs.setCname(sr.getCname());
				cs.setGrdName(sr.getGrdName());
				cs.setPfsName(sr.getPfsName());
				cs.setPoint(sr.getPoint());
				cs.setWk(sr.getWk());
				cs.setClspnt(sr.getClspnt());
				cs.setTeacher(sr.getTeacher());
//			System.out.println(sr.getCname()+"---"+sr.getCount()+"---"+sr.getGrdName()+"---"+sr.getPoint()+"---"+sr.getTeacher());
			}
			
		} finally {
			if (session != null)
				session.close();
		}
		System.out.println(cs.getCname()+""+cs.getTeacher());
		return cs;

	}

}
