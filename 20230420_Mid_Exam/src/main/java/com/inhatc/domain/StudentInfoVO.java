package com.inhatc.domain;

public class StudentInfoVO {
	private String student_no;
	private String student_name;
	private int student_dept;
	private String student_address;
	private String student_phone;
	private String student_email;
	
	public String getStudentNo() {
		return student_no;
	}
	public void setStudentNo(String student_no) {
		this.student_no = student_no;
	}
	public String getStudentName() {
		return student_name;
	}
	public void setStudentName(String student_name) {
		this.student_name = student_name;
	}
	public int getStudentDept() {
		return student_dept;
	}
	public void setStudentDept(int student_dept) {
		this.student_dept = student_dept;
	}
	public String getStudentAddress() {
		return student_address;
	}
	public void setStudentAddress(String student_address) {
		this.student_address = student_address;
	}
	public String getStudentPhone() {
		return student_phone;
	}
	public void setStudentPhone(String student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudentEmail() {
		return student_email;
	}
	public void setStudentEmail(String student_email) {
		this.student_email = student_email;
	}
	@Override
	public String toString() {
		return "StudentInfoVO [student_no=" + student_no + ", student_name=" + student_name + ", student_dept="
				+ student_dept + ", student_address=" + student_address + ", student_phone=" + student_phone
				+ ", student_email=" + student_email + "]";
	}
	
	
}