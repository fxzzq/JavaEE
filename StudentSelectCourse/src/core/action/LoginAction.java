package core.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import core.entity.Manager;
import core.entity.NowSystemTime;
import core.entity.Student;
import core.logic.LoginLogic;

public class LoginAction extends ActionSupport implements SessionAware {
	private int userId;
	private String userPassword;
	private String userStatus;
	private Map<String, Object> session;
	private Student stu;
	


	public String stuRegedit(){
		LoginLogic lc = new LoginLogic();
		System.out.println(stu.getSname());
		lc.insertStu(stu);
		return SUCCESS;
	}
	public String userValidate() {
		NowSystemTime nst=new NowSystemTime();
		System.out.println(nst.getCurrentTime());
		createSessionTime(nst.getCurrentTime());
		System.out.println(userId);
		System.out.println(userPassword);
		System.out.println(userStatus);
		System.out.println("xzq12399");
		LoginLogic lc = new LoginLogic();
		System.out.println("xzq1239988");
		if (userStatus.equals("student")) {
			System.out.println("xzq1239911");
			Student dbStu = lc.stuLogin(userId);
			System.out.println("xzq123");
			System.out.println("是否拿到了当前用户的名字"+dbStu.getSname());
			System.out.println("xzq123456");
			if (dbStu.getSpassword().equals(userPassword)) {
				createSessionId(userId);
				System.out.println("奇葩"+userId);
				createSessionStatus(userStatus);
				createSessionStu(dbStu);
				createSessionName(dbStu.getSname());
				return "stu_success";
			} else {
				return ERROR;
			}

		} else if (userStatus.equals("manager")) {
			Manager dbMng = lc.mngLogin(userId);
			if (dbMng.getMpassword().equals(userPassword)) {
				createSessionId(userId);
				createSessionStatus(userStatus);
				createSessionMng(dbMng);
				createSessionName(dbMng.getMname());
				return "mng_success";
			} else {
				return ERROR;
			}

		}

		return "";
	}
	
	public void createSessionStatus(String userStatus){
		session.put("currentUserStatus", userStatus);
			
	}
	
	
	public void createSessionId(int id){
		session.put("currentUserId", id);
			
	}
	public void createSessionTime(String currentT){
		session.put("currentTime", currentT);
			
	}
	
	public void createSessionName(String name){
		
		session.put("currentUserName", name);
			
	}
	

	
	public void createSessionStu(Student stu){
		session.put("currentStu", stu);
			
	}
	
	public void createSessionMng(Manager mng){
		session.put("currentMng",mng);
			
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}


	public Student getStu() {
		return stu;
	}


	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	

}
