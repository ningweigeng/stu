package cn.por;

// Generated 2016-12-26 16:24:18 by Hibernate Tools 3.4.0.CR1

/**
 * Person generated by hbm2java
 */
public class Person implements java.io.Serializable {

	private Integer pid;
	private String pname;

	public Person() {
	}

	public Person(Integer pid) {
		this.pid = pid;
	}

	public Person(Integer pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}