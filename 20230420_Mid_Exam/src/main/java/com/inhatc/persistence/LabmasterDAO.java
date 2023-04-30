package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.LabmasterVO;

public interface LabmasterDAO {
	public void createLabmaster(LabmasterVO vo) throws Exception;
	public LabmasterVO readLabmaster(String lab_id) throws Exception;
	public List<LabmasterVO> readAllLabmaster() throws Exception;
	public void updateLabmaster(LabmasterVO vo) throws Exception;
	public void deleteLabmaster(String lab_id) throws Exception;
}