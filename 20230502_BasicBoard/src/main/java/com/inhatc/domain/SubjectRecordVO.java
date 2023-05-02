package com.inhatc.domain;

public class SubjectRecordVO {
	private String hakbun;
	private int kor;
	private int math;
	private int eng;
	@Override
	public String toString() {
		return "SubjectRecordVO [hakbun=" + hakbun + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
}
