package com.inhatc.cs;

import java.util.List;

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

public class SubjectRecordDAO1ReadTest {
	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void readSubjectRecord() throws Exception {
		int studentNo = 201844021;
		
		SubjectRecordVO vo = dao.readSubjectRecord(studentNo);
		
		System.out.println("---------- Student Subject Record ----------");
		System.out.println("학번 : " + vo.getStudentNo());
		System.out.println("국어 점수 : " + vo.getKorean());
		System.out.println("영어 점수 : " + vo.getEnglish());
		System.out.println("수학 점수 : " + vo.getMath());
		System.out.println("--------------------------------------------");
	}
	
	@Test
	public void readAllSubjectRecorod() throws Exception {
		List<SubjectRecordVO> list = dao.readAllSubjectRecord();
		
		
		System.out.println("---------- All Student Subject Record ----------");
		for(int i = 0; i < list.size(); i++) {
			int studentNo = list.get(i).getStudentNo();
			int korean = list.get(i).getKorean();
			int english = list.get(i).getEnglish();
			int math = list.get(i).getMath();
			
			System.out.println("학번 : " + studentNo);
			System.out.println("국어 점수 : " + korean);
			System.out.println("영어 점수 : " + english);
			System.out.println("수학 점수 : " + math);
			
			if(i + 1 < list.size()) {
				System.out.println("================");
			}
		}
		System.out.println("--------------------------------------------");
	}
}