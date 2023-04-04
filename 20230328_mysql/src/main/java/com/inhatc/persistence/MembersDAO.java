package com.inhatc.persistence;

import com.inhatc.domain.MembersVO;

public interface MembersDAO {
	public String getTime();
	public void insertMembers(MembersVO vo);
}