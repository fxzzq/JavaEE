package core.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import core.entity.Course;
import core.entity.Student;
import core.logic.CourseService;
import core.logic.CourseService2;

public class CourseInquiryAction extends ActionSupport implements SessionAware {
	
	private List<Course> csList;
	private Map<String, Object> session;

	public String inquiryExist() {
		Student stu = (Student) session.get("currentStu"); 
		//�ѵ�ǰ�û�����Ϣ���������Ի�ȡ����
		CourseService cs = new CourseService();
		System.out.println("�Ƿ��ȡ�˵�ǰ���û�������"+stu.getSname());
		setCsList(cs.handle(stu.getSname()));
		
		
		return SUCCESS;
	}
	/*��ѯ��ѡ�γ�*/
	public String inquiryOptional(){
		CourseService2 cs2 = new CourseService2();
		Student stuTemp= (Student) session.get("currentStu");
		setCsList(cs2.conditionInquiry(stuTemp));
	
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public List<Course> getCsList() {
		return csList;
	}

	public void setCsList(List<Course> csList) {
		this.csList = csList;
	}


	

}
