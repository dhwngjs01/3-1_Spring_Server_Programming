package com.inhatc.cs;


import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.SubjectRecordDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class SubjectRecordDAO3UpdateTest {
	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void modify() throws Exception {
		SubjectRecordVO vo = new SubjectRecordVO();
		
		vo.setStudentNo(201844021);
		vo.setKorean(95);
		vo.setEnglish(90);
		vo.setMath(60);
		
		dao.updateSubjectRecord(vo);
	}
}