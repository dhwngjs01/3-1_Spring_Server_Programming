package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectRecordVO;

public interface SubjectRecordDAO {
	public void createSubjectRecord(SubjectRecordVO vo) throws Exception;
	public SubjectRecordVO readSubjectRecord(int studentNo) throws Exception;
	public List<SubjectRecordVO> readAllSubjectRecord() throws Exception;
	public void updateSubjectRecord(SubjectRecordVO vo) throws Exception;
	public void deleteSubjectReocrd(int studentNo) throws Exception;
}