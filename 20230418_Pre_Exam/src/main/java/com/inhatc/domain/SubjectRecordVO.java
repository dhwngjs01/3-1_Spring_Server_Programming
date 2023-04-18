package com.inhatc.domain;

public class SubjectRecordVO {
	private int student_no;
	private int korean;
	private int english;
	private int math;
	
	public int getStudentNo() {
		return student_no;
	}
	public void setStudentNo(int studentNo) {
		this.student_no = studentNo;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "SubjectRecordVO [studentNo=" + student_no + ", korean=" + korean + ", english=" + english + ", math="
				+ math + "]";
	}
	
	
}
