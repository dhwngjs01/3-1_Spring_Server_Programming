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
public class LabmasterDAO1DataInsertTest {
	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void create() throws Exception {
		LabmasterVO vo = new LabmasterVO();
		
		vo.setLabId("201844021");
		vo.setLabName("서버프로그래밍 실습실");
		vo.setLabAbleNumber(30);
		vo.setLabLocation("4-403");
		vo.setLabClass("PC실습");
		vo.setLabManageDept("컴퓨터정보과");
		dao.createLabmaster(vo);
		
		vo.setLabId("201944888");
		vo.setLabName("블라블라 머신 실습실");
		vo.setLabAbleNumber(70);
		vo.setLabLocation("5-203");
		vo.setLabClass("기계실습");
		vo.setLabManageDept("기계과");
		dao.createLabmaster(vo);
		
		vo.setLabId("202013243");
		vo.setLabName("어쩌구저쩌구 건축 실습실");
		vo.setLabAbleNumber(50);
		vo.setLabLocation("3-203");
		vo.setLabClass("건축실습");
		vo.setLabManageDept("실내건축과");
		dao.createLabmaster(vo);
	}

}
