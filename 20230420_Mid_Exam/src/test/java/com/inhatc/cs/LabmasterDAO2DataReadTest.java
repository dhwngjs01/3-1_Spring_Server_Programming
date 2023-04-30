package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.LabmasterVO;
import com.inhatc.persistence.LabmasterDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class LabmasterDAO2DataReadTest {
	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void read() throws Exception {
		String labId = "201844021";
		
		LabmasterVO vo = dao.readLabmaster(labId);
		
		System.out.println("-------------- Labmaster Info --------------");
		System.out.println("실습실ID : " + vo.getLabId());
		System.out.println("실습실명 : " + vo.getLabName());
		System.out.println("가용인원 : " + vo.getLabAbleNumber());
		System.out.println("위치 : " + vo.getLabLocation());
		System.out.println("실습분류 : " + vo.getLabClass());
		System.out.println("책임관리학과 : " + vo.getLabManageDept());
		System.out.println("------------------------------------------");
	}

}
