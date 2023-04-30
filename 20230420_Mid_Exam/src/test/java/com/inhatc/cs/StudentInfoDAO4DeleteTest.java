package com.inhatc.cs;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.persistence.StudentInfoDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class StudentInfoDAO4DeleteTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void delete() throws Exception {
		String studentNo = "201844021";
		dao.deleteStudentInfo(studentNo);
	}
}