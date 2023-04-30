package com.inhatc.cs;


import java.util.List;

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

public class LabmasterDAO2DataReadAllTest {
	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void readAll() throws Exception {
		List<LabmasterVO> LabmasterList = dao.readAllLabmaster();
		
		
		System.out.println("------- All Labmaster Info -------");
		for(int i = 0; i < LabmasterList.size(); i++) {
			System.out.println("실습실ID : " + LabmasterList.get(i).getLabId());
			System.out.println("실습실명 : " + LabmasterList.get(i).getLabName());
			System.out.println("가용인원 : " + LabmasterList.get(i).getLabAbleNumber());
			System.out.println("위치 : " + LabmasterList.get(i).getLabLocation());
			System.out.println("실습분류 : " + LabmasterList.get(i).getLabClass());
			System.out.println("책임관리학과 : " + LabmasterList.get(i).getLabManageDept());
			
			if(i + 1 < LabmasterList.size()) {
				System.out.println("===================================");
			}
		}
		System.out.println("------------------------------------------");
	}
}