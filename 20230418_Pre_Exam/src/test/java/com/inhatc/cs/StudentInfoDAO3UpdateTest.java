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

public class StudentInfoDAO3UpdateTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void modify() throws Exception {
		StudentInfoVO vo = new StudentInfoVO();
		
		vo.setStudentNo("201844021");
		vo.setStudentName("오또깡");
		vo.setStudentDept(45);
		vo.setStudentAddress("인천광역시 용현동 33-22");
		vo.setStudentPhone("010-7777-8888");
		vo.setStudentEmail("ohDdoo@itc.ac.kr");
		dao.updateStudentInfo(vo);		
	}
}