
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
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class SubjectRecordDAO2InsertTest {
   @Inject
   private SubjectRecordDAO dao;
   
   
   
   @Test
   public void testInsertSubjectRecord() throws Exception{
      SubjectRecordVO vo = new SubjectRecordVO();
      vo.setHakbun("202344009");
      vo.setKor(97);
      vo.setMath(100); 
      vo.setEng(99);
      dao.insertSubjectRecord(vo);
   }
   
   
}