package com.inhatc.cs;

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

public class StudentInfoDAO2DataReadTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void read() throws Exception {
		String studentNo = "201844021";
		
		StudentInfoVO vo = dao.readStudentInfo(studentNo);
		
		System.out.println("-------------- Student Info --------------");
		System.out.println("학번 : " + vo.getStudentNo());
		System.out.println("이름 : " + vo.getStudentName());
		System.out.println("학과 코드 : " + vo.getStudentDept());
		System.out.println("주소 : " + vo.getStudentAddress());
		System.out.println("핸드폰 : " + vo.getStudentPhone());
		System.out.println("Email : " + vo.getStudentEmail());
		System.out.println("------------------------------------------");
	}

}
