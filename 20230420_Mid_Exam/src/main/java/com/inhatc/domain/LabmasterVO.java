package com.inhatc.domain;

public class LabmasterVO {
	private String lab_id;
	private String lab_name;
	private int lab_able_number;
	private String lab_location;
	private String lab_class;
	private String lab_manage_dept;
	
	public String getLabId() {
		return lab_id;
	}
	public void setLabId(String lab_id) {
		this.lab_id = lab_id;
	}
	public String getLabName() {
		return lab_name;
	}
	public void setLabName(String lab_name) {
		this.lab_name = lab_name;
	}
	public int getLabAbleNumber() {
		return lab_able_number;
	}
	public void setLabAbleNumber(int lab_able_number) {
		this.lab_able_number = lab_able_number;
	}
	public String getLabLocation() {
		return lab_location;
	}
	public void setLabLocation(String lab_location) {
		this.lab_location = lab_location;
	}
	public String getLabClass() {
		return lab_class;
	}
	public void setLabClass(String lab_class) {
		this.lab_class = lab_class;
	}
	public String getLabManageDept() {
		return lab_manage_dept;
	}
	public void setLabManageDept(String lab_manage_dept) {
		this.lab_manage_dept = lab_manage_dept;
	}
	@Override
	public String toString() {
		return "LabMasterVO [lab_id=" + lab_id + ", lab_name=" + lab_name + ", lab_able_number=" + lab_able_number
				+ ", lab_location=" + lab_location + ", lab_class=" + lab_class + ", lab_manage_dept=" + lab_manage_dept
				+ "]";
	}
	
	
}
