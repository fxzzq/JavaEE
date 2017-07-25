package core.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	private int sid;
	private String sname;
	private String spassword;
	private PrefessionName pfsName;
	private SexType sxtp;
	private String saddress;
	private int tel;
	private GradeName grdName;

	@Id
	@GeneratedValue
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

	@Enumerated(EnumType.STRING)
	public PrefessionName getPfsName() {
		return pfsName;
	}

	public void setPfsName(PrefessionName pfsName) {
		this.pfsName = pfsName;
	}


	@Enumerated(EnumType.STRING)
	public GradeName getGrdName() {
		return grdName;
	}

	public void setGrdName(GradeName grdName) {
		this.grdName = grdName;
	}

	@Enumerated(EnumType.STRING)
	public SexType getSxtp() {
		return sxtp;
	}

	public void setSxtp(SexType sxtp) {
		this.sxtp = sxtp;
	}
	
	


	

}
