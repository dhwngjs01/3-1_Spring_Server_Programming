package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.MembersDAO;
import com.inhatc.persistence.SubjectRecordDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class SubjectRecordDAO1CreateTest {
	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void create() throws Exception {
		SubjectRecordVO vo = new SubjectRecordVO();
		
		vo.setStudentNo(201844021);
		vo.setKorean(80);
		vo.setEnglish(60);
		vo.setMath(30);
		
		dao.createSubjectRecord(vo);
	}
}