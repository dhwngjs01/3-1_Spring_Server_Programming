package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.LabmasterVO;

@Repository
public class Labmaster201844021DAOImpl implements LabmasterDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.Labmaster201844021Mapper";

	@Override
	public void createLabmaster(LabmasterVO vo) {
		sqlSession.insert(namespace + ".insertLabmaster", vo);
	}

	@Override
	public LabmasterVO readLabmaster(String lab_id) {
		return sqlSession.selectOne(namespace + ".selectLabmaster", lab_id);
	}

	@Override
	public List<LabmasterVO> readAllLabmaster() {
		return sqlSession.selectList(namespace + ".selectAllLabmaster");
	}

	@Override
	public void updateLabmaster(LabmasterVO vo) {
		sqlSession.update(namespace + ".updateLabmaster", vo);
	}

	@Override
	public void deleteLabmaster(String lab_id) {
		sqlSession.delete(namespace + ".deleteLabmaster", lab_id);
		
	}
	
	
}
