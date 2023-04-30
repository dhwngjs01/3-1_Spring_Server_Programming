package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MembersVO;

@Repository
public class MembersDAOImpl implements MembersDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMembers(MembersVO vo) {
		sqlSession.insert(namespace + ".insertMembers", vo);
	}
	
	@Override
	public MembersVO readMembers(String userid) {
		return sqlSession.selectOne(namespace + ".selectMembers", userid);
	}
	
	@Override
	public MembersVO readWithPW(String userid, String userpw) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace + ".selectWithPW", paramMap);
	}
	
	@Override
	public void modify(MembersVO vo) {
		sqlSession.update(namespace + ".update", vo);
	}
	
	@Override
	public void delete(String userid) {
		sqlSession.delete(namespace + ".delete", userid);
	}
	
	@Override
	public List<MembersVO> membersList(){
		return sqlSession.selectList(namespace + ".selectMembersList");
	}
}
