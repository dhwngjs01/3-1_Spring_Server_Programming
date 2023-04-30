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
public class StudentInfoDAO1DataInsertTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void create() throws Exception {
		StudentInfoVO vo = new StudentInfoVO();
		
		vo.setStudentNo("201021");
		vo.setStudentName("오주헌");
		vo.setStudentDept(44);
		vo.setStudentAddress("인천광역시 인하로 100");
		vo.setStudentPhone("010-1234-5678");
		vo.setStudentEmail("201844021@itc.ac.kr");
		dao.createStudentInfo(vo);		
		
		vo.setStudentNo("2014789");
		vo.setStudentName("김민수");
		vo.setStudentDept(44);
		vo.setStudentAddress("인천광역시 인하로 100");
		vo.setStudentPhone("010-4567-4562");
		vo.setStudentEmail("201844789@itc.ac.kr");
		dao.createStudentInfo(vo);
		
		vo.setStudentNo("201123");
		vo.setStudentName("김또깡");
		vo.setStudentDept(44);
		vo.setStudentAddress("인천광역시 인하로 100");
		vo.setStudentPhone("010-7777-8888");
		vo.setStudentEmail("201844123@itc.ac.kr");
		dao.createStudentInfo(vo);
	}

}
