package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.SubjectRecordVO;

@Repository
public class SubjectRecordDAOImpl implements SubjectRecordDAO {

	@Inject 
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.SubjectRecordMapper" ;
	
	@Override 
	public String getTime() {
		
		return sqlSession.selectOne(namespace + ".getTime");
	}
	
	@Override
	public void insertSubjectRecord( SubjectRecordVO vo) {
		sqlSession.insert(namespace+".insertSubjectRecord", vo);
	}
	
	
	@Override
	public SubjectRecordVO readSubjectRecord(String hakbun)throws Exception{
		return (SubjectRecordVO)sqlSession.selectOne(namespace+".selectSubjectRecord", hakbun);
	}

	@Override
	public void modify(SubjectRecordVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);
	}
	  
	@Override
	public void remove(String hakbun) throws Exception {
		sqlSession.delete(namespace + ".delete", hakbun);
	}
    @Override
	public List<SubjectRecordVO> listAll() throws Exception {
    	return sqlSession.selectList(namespace + ".listAll");
	}
	
	
}
