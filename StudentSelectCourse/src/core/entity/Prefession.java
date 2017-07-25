package core.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prefession {

	private int pid; // ×¨Òµid
	private PrefessionName pfsName;
	private String level; // Ñ§¼®
	private String remarks;

	@Id
	@GeneratedValue
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Enumerated(EnumType.STRING)
	public PrefessionName getPfsName() {
		return pfsName;
	}

	public void setPfsName(PrefessionName pfsName) {
		this.pfsName = pfsName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
