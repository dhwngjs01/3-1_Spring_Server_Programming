package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentInfoVO;

@Repository
public class StudentInfoDAOImpl implements StudentInfoDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.StudentInfoMapper";

	@Override
	public void createStudentInfo(StudentInfoVO vo) {
		sqlSession.insert(namespace + ".insertStudentInfo", vo);
	}

	@Override
	public StudentInfoVO readStudentInfo(String studentNo) {
		System.out.println(sqlSession.selectOne(namespace + ".selectStudentInfo", studentNo));
		return sqlSession.selectOne(namespace + ".selectStudentInfo", studentNo);
	}

	@Override
	public List<StudentInfoVO> readAllStudentInfo() {
		return sqlSession.selectList(namespace + ".selectAllStudentInfo");
	}

	@Override
	public void updateStudentInfo(StudentInfoVO vo) {
		sqlSession.update(namespace + ".updateStudentInfo", vo);
	}

	@Override
	public void deleteStudentInfo(String studentNo) {
		sqlSession.delete(namespace + ".deleteStudentInfo", studentNo);
		
	}
	
	
}
