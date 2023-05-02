package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class BoardDAOTest {

  @Inject
  private BoardDAO dao;

  @Test
  public void testCreate() throws Exception {
    BoardVO board = new BoardVO();
    board.setTitle("제목2");
    board.setContent("내용2");
    board.setWriter("user01");
    dao.create(board);
  }

  @Test
  public void testRead() throws Exception {
	  System.out.println(dao.read(1).toString());
  }

  @Test
  public void testUpdate() throws Exception {

    BoardVO board = new BoardVO();
    board.setBno(1);
    board.setTitle("제목 업데이트.");
    board.setContent("내용업데이트");
    dao.update(board);
  }

  @Test
  public void testDelete() throws Exception {
    dao.delete(3);
  }
  
  @Test
  public void testListAll() throws Exception {
	  List<BoardVO> boardList = dao.listAll();
	  
	  for(int i = 0; i < boardList.size(); i++) {
		  System.out.println("-------------------------------------------");
		  System.out.println("글번호 : " + boardList.get(i).getBno());
		  System.out.println("글제목 : " + boardList.get(i).getTitle());
		  System.out.println("글내용 : " + boardList.get(i).getContent());
		  System.out.println("작성자 : " + boardList.get(i).getWriter());
		  System.out.println("작성날짜 : " + boardList.get(i).getRegdate());
		  System.out.println("조회수 : " + boardList.get(i).getViewcnt());
		  System.out.println("-------------------------------------------");
	  }
  }
}
