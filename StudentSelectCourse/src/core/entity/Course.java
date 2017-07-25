package core.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	private int cid;
	private String cname;   //�γ���
	private String address;   //�Ͽε�ַ
	private int point;				//ѧ��
	private String teacher;    //������ʦ
	private PrefessionName pfsName;    //רҵ�꼶
	private int count;  // ��������
	private GradeName grdName;//�꼶
	private Week wk;   //���ڼ�
	private ClassPoint clspnt;  //�ڼ���
		
	@Id
	@GeneratedValue
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Enumerated(EnumType.STRING)
	public GradeName getGrdName() {
		return grdName;
	}

	public void setGrdName(GradeName grdName) {
		this.grdName = grdName;
	}

	@Enumerated(EnumType.STRING)
	public Week getWk() {
		return wk;
	}

	public void setWk(Week wk) {
		this.wk = wk;
	}

	@Enumerated(EnumType.STRING)
	public PrefessionName getPfsName() {
		return pfsName;
	}

	public void setPfsName(PrefessionName pfsName) {
		this.pfsName = pfsName;
	}

	@Enumerated(EnumType.STRING)
	public ClassPoint getClspnt() {
		return clspnt;
	}

	public void setClspnt(ClassPoint clspnt) {
		this.clspnt = clspnt;
	}

}
