package core.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import core.entity.Course;
import core.entity.GradeName;
import core.entity.PrefessionName;
import core.entity.SexType;
import core.entity.Student;
import core.logic.MngService;

public class ManagementAction extends ActionSupport {
	private Student stu;
	private Course cr;
	private List<Course> crList;
	private int cidTp; //接收show_some.jsp页面里的  删除连接属性
	private List<Student> stuList;
	private int sidTp;
	private int sid;
	private String sname;
	private String spassword;
	private PrefessionName pfsName;
	private SexType sxtp;
	private String saddress;
	private int tel;
	private GradeName grdName;
	
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public PrefessionName getPfsName() {
		return pfsName;
	}

	public void setPfsName(PrefessionName pfsName) {
		this.pfsName = pfsName;
	}

	public SexType getSxtp() {
		return sxtp;
	}

	public void setSxtp(SexType sxtp) {
		this.sxtp = sxtp;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public GradeName getGrdName() {
		return grdName;
	}

	public void setGrdName(GradeName grdName) {
		this.grdName = grdName;
	}

	public String oneStudent() {
		Student  stu1=new  Student();
		stu1.setGrdName(grdName);
		stu1.setPfsName(pfsName);
		stu1.setSaddress(saddress);
		stu1.setSid(sid);
		stu1.setSname(sname);
		stu1.setSpassword(spassword);
		stu1.setSxtp(sxtp);
		stu1.setTel(tel);
		MngService ms= new MngService();
		ms.addOneStu(stu1);
		System.out.println("shhuchu "+sname);

		return SUCCESS;
	}
	
	public String oneCorse() {
		System.out.println("123456789xzq");
		System.out.println(cr.getCname());
		MngService ms=new MngService();
		ms.addOneCourse(cr);

		return SUCCESS;
	}

	public String selectCourse() {
		MngService ms=new MngService();
		if(cr.getGrdName().equals(GradeName.请选择)&&cr.getPfsName().equals(PrefessionName.请选择)){
			return "input";
		}else{
			setCrList(ms.InquiryCourse(cr.getGrdName(),cr.getPfsName()));
		
			return SUCCESS;
		}
		
		
	}
	
	public String deleteCourse(){
		System.out.println("是否传过来值了 "+cidTp);
		MngService ms=new MngService();
		ms.delteCourse(cidTp);
		return SUCCESS;
	}
	/*查询学生*/
	public String selectStu(){
		MngService ms=new MngService();
	
		if(cr.getGrdName().equals(GradeName.请选择)||cr.getPfsName().equals(PrefessionName.请选择)){
			
		System.out.println(cr.getAddress());
			return "input";
		}else{
			setStuList(ms.InquiryStu(cr.getGrdName(),cr.getPfsName()));
		
			return SUCCESS;
		}
		
	}
	/*删除学生*/
	public String deletStu(){
		System.out.println("是否传过来值了 "+sidTp);
		MngService ms=new MngService();
		ms.delteStu(sidTp);
		return SUCCESS;
	
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public Course getCr() {
		return cr;
	}

	public void setCr(Course cr) {
		this.cr = cr;
	}

	public List<Course> getCrList() {
		return crList;
	}

	public void setCrList(List<Course> crList) {
		this.crList = crList;
	}

	public int getCidTp() {
		return cidTp;
	}

	public void setCidTp(int cidTp) {
		this.cidTp = cidTp;
	}

	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	public int getSidTp() {
		return sidTp;
	}

	public void setSidTp(int sidTp) {
		this.sidTp = sidTp;
	}
	
	
	
	
	
	
	


}
