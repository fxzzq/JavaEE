package core.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import core.entity.Student;
import core.logic.StudentUpdate;

public class InquiryAction extends ActionSupport implements SessionAware {
	
	private Student stu;
	private Map<String, Object> session;

	public String pesnalInfor() {  //����jspҳ��  �����ǰ�û���һЩ��Ϣ

		Student stuTemp=(Student) session.get("currentStu");
		System.out.println(stuTemp.getSid()+stuTemp.getSname()+"///"+stuTemp.getSpassword()+"////"+stuTemp.getGrdName()+"///"+stuTemp.getPfsName());
	

		setStu(stuTemp);
	
	
		return SUCCESS;
	}

	public String updateInfor() {
		System.out.println("fxzq");
		int id = (Integer) session.get("currentUserId");
		System.out.println("fxzq1");
		System.out.println(id);
		System.out.println("��ȡ��ǰ�û�id"+id);
		StudentUpdate su = new StudentUpdate();
		su.sUpdate(id, stu);
		System.out.println("here! ���³ɹ���");
		return SUCCESS;
	}


	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
