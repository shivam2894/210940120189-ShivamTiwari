package com.app.sms;



public class Student {
	
	int id;
	String phone_no;
	String name;
	Subjects subject;
	double marks;
	String email;
	public Student(int id,String name,String phone_no, Subjects subject, double marks, String email) {
		super();
		this.id = id;
		this.phone_no = phone_no;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.email = email;
	}
	
	
	public Student(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Student)
			return this.id==((Student)o).id;
		return false;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", phone_no=" + phone_no + ", name=" + name + ", subject=" + subject + ", marks="
				+ marks + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subjects getSubject() {
		return subject;
	}
	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
