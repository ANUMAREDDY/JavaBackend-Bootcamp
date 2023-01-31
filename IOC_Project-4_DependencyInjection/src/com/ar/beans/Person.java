package com.ar.beans;

public class Person {
	
	private int pid;
	private String pname;
	private String paddrs;
	private float income;
	
	// alt+shift+s,r
	
/*	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public void setIncome(float income) {
		this.income = income;
	}*/
	
	//ctrl+shift+s,o

	public Person(int pid, String pname, String paddrs, float income) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
		this.income = income;
	}
	
	public Person() {
		System.out.println("0-Param");
	}
	
	// alt+shift+s,s
		@Override
		public String toString() {
			return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", income=" + income + "]";
		}
	

}
