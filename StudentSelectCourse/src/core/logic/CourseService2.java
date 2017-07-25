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
		//��ѯ�����͵�ǰѧ����רҵ���꼶��ȵ����пγ� 
		
		List<Course> crList=new ArrayList<Course>();
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//Criteria��һ�ֱ�hql���������Ĳ�ѯ��ʽ
		try {
			Criteria c = session.createCriteria(Course.class);       
			//������ѯ  �Ѻ͵�ǰ�û���רҵ�� �꼶��ͬ�Ŀγ��ó���
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
		//�ж�һ��ѡ��Ŀγ��Ƿ��Ѿ�ѡ��
																							//�ѵ�ǰ���û������û�Ҫѡ�Ŀγ���������
		CourseService cs=new CourseService();
		List<String> cnameList=cs.OneStuCourse(sname);  
		//�Ȱѵ�ǰ�û���ѡ�Ŀγ�����list���չ���
		
		for(int i=0;i<cnameList.size();i++){
			while(cnameList.get(i).equals(cname)){
				System.out.println("�����Ｘ����");
				return "exist";
			}
		}
		insertNoExist(sname,cname);
		return	"noExist";
		
	}
	
	
	public void insertNoExist(String sname,String cname){ 
		//����ѡ�Ŀγ̲��뵽select_relust
		SelectResult sr=new SelectResult();
		sr.setSname(sname);
		sr.setCname(cname);
		
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(sr);
		session.getTransaction().commit();
		
	}
	
	public void delteCourse(int id){  
		//������δ���ü�����ϵ  ��ɾ�� Ϊɾ���� �ü�¼�йص����ݱ����Ϣ
		Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
       Course cr = (Course) session.get(Course.class, id);  
        session.delete(cr);
        session.getTransaction().commit();
		
	}
	

	



}
