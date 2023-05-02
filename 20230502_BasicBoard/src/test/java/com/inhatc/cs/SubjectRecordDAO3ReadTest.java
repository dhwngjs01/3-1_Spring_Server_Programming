
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
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class SubjectRecordDAO3ReadTest {
   @Inject
   private SubjectRecordDAO dao;
   
   
   @Test
   public void readMember() throws Exception{
	     
	  SubjectRecordVO vo = dao.readSubjectRecord("202344001");
      System.out.println( "User Hakbun:" + vo.getHakbun());
      System.out.println( "User Korean:" + vo.getKor());
      System.out.println( "User Math:" + vo.getMath());
      System.out.println( "User English:" + vo.getEng());
   }
   

   
}