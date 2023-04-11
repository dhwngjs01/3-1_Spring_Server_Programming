package com.inhatc.cs;

import java.util.List;

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
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)


public class MembersDAO6ReadAllTest {
	@Inject
	public MembersDAO dao;
	
	@Test
	public void readAllMembers() throws Exception {
		List<MembersVO> list = dao.membersList();
		int listCount = list.size();
		
		
		
		System.out.println("Members List Count : " + listCount);
		
		
		System.out.println("--------------------------- Members List ---------------------------");
		
		
		for(int i = 0; i < listCount; i ++) {
			System.out.println("Members Index : " + i);
			System.out.println("User ID : " + list.get(i).getUserid());
			System.out.println("User PW : " + list.get(i).getUserpw());
			System.out.println("User Name : " + list.get(i).getUsername());
			System.out.println("User Email : " + list.get(i).getEmail());
			
			if(i+1 != listCount)
				System.out.println("============================================");
		}
		
		System.out.println("-------------------------------------------------------------------");
	}
}
