
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


public class SubjectRecordDAO5DeleteTest {
   @Inject
   private SubjectRecordDAO dao;
   
   
   
   @Test
   public void testDeleteMember() throws Exception{
	   SubjectRecordVO vo = new SubjectRecordVO();
      vo.setHakbun("202344001");
      dao.remove(vo.getHakbun());
   }
   

   
}