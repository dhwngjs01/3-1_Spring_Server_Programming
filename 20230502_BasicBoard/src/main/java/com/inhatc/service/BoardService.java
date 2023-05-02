package com.inhatc.service;

import java.util.List;

import javax.inject.Inject;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

public interface BoardService {	
	public void regist(BoardVO board) throws Exception;
	public BoardVO read(int bno) throws Exception;
	public void modify(BoardVO board) throws Exception;
	public void remove(int bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
}
