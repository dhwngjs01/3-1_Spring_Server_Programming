package com.inhatc.cs;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.persistence.LabmasterDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class LabmasterDAO4DeleteTest {
	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void delete() throws Exception {
		String labId = "201844021";
		dao.deleteLabmaster(labId);
	}
}