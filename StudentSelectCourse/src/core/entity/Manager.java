package core.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	private int mid;
	private String mname;
	private String mpassword;

	
	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	@Id
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}
	
	

}
