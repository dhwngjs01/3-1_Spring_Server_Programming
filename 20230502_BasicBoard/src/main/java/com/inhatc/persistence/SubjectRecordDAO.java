package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectRecordVO;

public interface SubjectRecordDAO {

	public String getTime();
	public void insertSubjectRecord( SubjectRecordVO vo);
	
	public SubjectRecordVO readSubjectRecord(String hakbun)throws Exception;
	  
	public void modify(SubjectRecordVO vo) throws Exception;

  	public void remove(String hakbun) throws Exception;

  	public List<SubjectRecordVO> listAll() throws Exception;

}
