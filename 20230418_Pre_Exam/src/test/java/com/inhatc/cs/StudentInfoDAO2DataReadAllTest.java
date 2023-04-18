package com.inhatc.cs;


import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentInfoVO;
import com.inhatc.persistence.StudentInfoDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class StudentInfoDAO2DataReadAllTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void readAll() throws Exception {
		List<StudentInfoVO> StudentInfoList = dao.readAllStudentInfo();
		
		
		System.out.println("------- All Student Info -------");
		for(int i = 0; i < StudentInfoList.size(); i++) {
			String studentNo = StudentInfoList.get(i).getStudentNo();
			String studentName = StudentInfoList.get(i).getStudentName();
			int studentDept = StudentInfoList.get(i).getStudentDept();
			String studentAddress = StudentInfoList.get(i).getStudentAddress();
			String studentPhone = StudentInfoList.get(i).getStudentPhone();
			String studentEmail = StudentInfoList.get(i).getStudentEmail();
			
			
			System.out.println("학번 : " + studentNo);
			System.out.println("이름 : " + studentName);
			System.out.println("학과 코드 : " + studentDept);
			System.out.println("주소 : " + studentAddress);
			System.out.println("핸드폰 : " + studentPhone);
			System.out.println("Email : " + studentEmail);
			
			if(i + 1 < StudentInfoList.size()) {
				System.out.println("================");
			}
		}
		System.out.println("------------------------------------------");
	}
}