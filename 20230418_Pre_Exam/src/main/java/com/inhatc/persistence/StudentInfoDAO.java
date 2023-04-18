package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentInfoVO;

public interface StudentInfoDAO {
	public void createStudentInfo(StudentInfoVO vo) throws Exception;
	public StudentInfoVO readStudentInfo(String studentNo) throws Exception;
	public List<StudentInfoVO> readAllStudentInfo() throws Exception;
	public void updateStudentInfo(StudentInfoVO vo) throws Exception;
	public void deleteStudentInfo(String studentNo) throws Exception;
}