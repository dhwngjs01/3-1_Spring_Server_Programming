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

public class LabmasterDAO3UpdateTest {
	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void modify() throws Exception {
		LabmasterVO vo = new LabmasterVO();
		
		vo.setLabId("201844021");
		vo.setLabName("재밌는 서버프로그래밍 실습실");
		vo.setLabAbleNumber(50);
		vo.setLabLocation("4-503");
		vo.setLabClass("좋은 PC실습");
		vo.setLabManageDept("대컴퓨터정보과");
		dao.updateLabmaster(vo);
	}
}