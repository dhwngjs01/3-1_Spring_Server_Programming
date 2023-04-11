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
	
	private static final String namespace = "com.inhatc.mapper.SubjectRecordMapper";

	@Override
	public void createSubjectRecord(SubjectRecordVO vo) {
		sqlSession.insert(namespace + ".insertSubjectRecord", vo);
	}

	@Override
	public SubjectRecordVO readSubjectRecord(int studentNo) {
		return sqlSession.selectOne(namespace + ".selectSubjectRecord", studentNo);
	}

	@Override
	public List<SubjectRecordVO> readAllSubjectRecord() {
		return sqlSession.selectList(namespace + ".selectAllSubjectRecord");
	}

	@Override
	public void updateSubjectRecord(SubjectRecordVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubjectReocrd(int studentNo) {
		// TODO Auto-generated method stub
		
	}
	
	
}
