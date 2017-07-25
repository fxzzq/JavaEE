package core.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import core.entity.Student;
import core.logic.CourseService2;

public class SelectCourseAction extends ActionSupport  implements SessionAware{
	private String cname; // 接收jsp页面所选的课程名
	private String tempTalk; // 定义变量 往jsp页面传值
	private Map<String, Object> session;
	private int cidTp;

	public String selectCousre() {   //查询当前用户的所有课程  如果已经选过  就可以返回input 未选过 则往select_result表里插入该条记录
		Student snameTemp= (Student) session.get("currentStu");  //获取当前用户的信息
		System.out.println("当前用户名可以出来吗"+snameTemp.getSname());
		System.out.println("是不是这个课程名字 真是太好了" + cname);
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

	
	public String quitCourse() {  //退选课程处理
		
		
		System.out.println("课程编号" + cidTp);
		CourseService2 cs2 = new CourseService2();
		cs2.delteCourse(cidTp);
		System.out.println("应该成功了把");

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
