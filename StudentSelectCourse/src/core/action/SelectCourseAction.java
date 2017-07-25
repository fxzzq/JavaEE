package core.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import core.entity.Student;
import core.logic.CourseService2;

public class SelectCourseAction extends ActionSupport  implements SessionAware{
	private String cname; // ����jspҳ����ѡ�Ŀγ���
	private String tempTalk; // ������� ��jspҳ�洫ֵ
	private Map<String, Object> session;
	private int cidTp;

	public String selectCousre() {   //��ѯ��ǰ�û������пγ�  ����Ѿ�ѡ��  �Ϳ��Է���input δѡ�� ����select_result������������¼
		Student snameTemp= (Student) session.get("currentStu");  //��ȡ��ǰ�û�����Ϣ
		System.out.println("��ǰ�û������Գ�����"+snameTemp.getSname());
		System.out.println("�ǲ�������γ����� ����̫����" + cname);
		CourseService2 cs2 = new CourseService2();
		
		String existTemp=cs2.compareExist(snameTemp.getSname(), cname);
		if(existTemp.equals("noExist")){
			return SUCCESS;
			
		}else if(existTemp.equals("exist")){
			return "input";
		}else{
			return "error";
		}
		
	}

	
	public String quitCourse() {  //��ѡ�γ̴���
		
		
		System.out.println("�γ̱��" + cidTp);
		CourseService2 cs2 = new CourseService2();
		cs2.delteCourse(cidTp);
		System.out.println("Ӧ�óɹ��˰�");

		return SUCCESS;
	}


	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getTempTalk() {
		return tempTalk;
	}

	public void setTempTalk(String tempTalk) {
		this.tempTalk = tempTalk;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	public int getCidTp() {
		return cidTp;
	}
	public void setCidTp(int cidTp) {
		this.cidTp = cidTp;
	}
	
	

}
