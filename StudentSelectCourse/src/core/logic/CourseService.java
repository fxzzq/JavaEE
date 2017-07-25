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
		//�Ȱѵ�ǰ�û���ѡ�Ŀγ�����list���չ���
		
		Iterator<String> itr = courseList.iterator();    
		//�� ��list����
		while (itr.hasNext()) {
		    String courseName=(String) itr.next();
		    System.out.println("�ǵ����˷�"+courseName);
		   Course objCouse= detailOfCourse(courseName); 
		   //��ÿ�ſε���ϸ��Ϣ������
		   csList.add(objCouse);			
		   //�ŵ�list����
		   
		}
		

		return csList;
		
	}
	
	//��ѯSelectResult ��һ���û�����ѡ�����пγ̲�ѯ����  ����ӵ�list����
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
				System.out.println(sr.getCname()+"����һ��");
				clist.add(sr.getCname());
			}
		} finally {
			if (session != null)
				session.close();
		}

		return clist;
	}

	//����һ���γ���  ���ؿγ���Course��һ������
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
				cs.setCid(sr.getCid());  //������©����仰 �������ѧ����ѡ������Ҫ����id ��ʱû�л�ȡ  �����ûӴd ���¶�ѡ���ܲ���ʹ
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
