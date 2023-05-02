
package com.inhatc.cs;

import java.util.List;

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


public class SubjectRecordDAO6ReadAllTest {
   @Inject
   private SubjectRecordDAO dao;
   
   
   @Test
   public void readAllMember() throws Exception{
	     
	  List<SubjectRecordVO> listSubjectRecord = dao.listAll();
	  int nCount = listSubjectRecord.size();
	  System.out.println("Data Count:" + nCount );
	  System.out.println("########################################");
	  for( int i=0 ; i<listSubjectRecord.size(); i++ ) {
		  System.out.println("User Index:" + i );
		  System.out.println("User Index Value:" + listSubjectRecord.get(i));
		  System.out.println("User Hakbun:" + listSubjectRecord.get(i).getHakbun());
		  System.out.println( "User Korea:" + listSubjectRecord.get(i).getKor());
		  System.out.println( "User Math:" + listSubjectRecord.get(i).getMath());
		  System.out.println( "User English:" + listSubjectRecord.get(i).getEng());
		  System.out.println("------------------------------------------------");
	  }
      //System.out.println( "User ID:" + vo.getUserid());
   }
  
   
}