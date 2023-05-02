
package com.inhatc.cs;

import javax.inject.Inject;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;



@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class MemberDAO2InsertTest {
   @Inject
   private MembersDAO dao;
   
   
   
   @Test
   public void testInsertMember() throws Exception{
      MembersVO vo = new MembersVO();
      vo.setUserid("user4");
      vo.setUserpw("user2 pw");
      vo.setUsername("user2 name");
      vo.setEmail("abca@inhatc.ac.kr");
      dao.insertMembers(vo);
   }
   
   
}