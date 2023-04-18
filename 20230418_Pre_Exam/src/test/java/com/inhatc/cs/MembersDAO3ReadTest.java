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
	locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class MembersDAO3ReadTest {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void readMembers() throws Exception {
		MembersVO vo = dao.readMembers("user2");
		
		System.out.println("---------------readMembers()------------------");
		System.out.println("userid : " + vo.getUserid());
		System.out.println("userpw : " + vo.getUserpw());
		System.out.println("username : " + vo.getUsername());
		System.out.println("email : " + vo.getEmail());
		System.out.println("regdate : " + vo.getRegdate());
		System.out.println("updatedate : " + vo.getUpdatedate());
		System.out.println("----------------------------------------------");
	}

	@Test
	public void readWithPW() throws Exception {
		MembersVO vo = dao.readWithPW("user2", "pw2");
		
		System.out.println("-------------readWithPW()----------------");
		System.out.println("userid : " + vo.getUserid());
		System.out.println("userpw : " + vo.getUserpw());
		System.out.println("username : " + vo.getUsername());
		System.out.println("email : " + vo.getEmail());
		System.out.println("regdate : " + vo.getRegdate());
		System.out.println("updatedate : " + vo.getUpdatedate());
		System.out.println("-----------------------------------------");
	}
}