package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*") //localhost:port/board/~~~~
public class BoardController {
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(BoardVO board, Model model) throws Exception {
		System.out.println("Register (GET) Called");
		
		return "board/register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPost(BoardVO board, RedirectAttributes rttr) throws Exception {
		System.out.println("Register (POST) Called");
		
		System.out.println("제목 : " + board.getTitle());
		System.out.println("내용 : " + board.getContent());
		System.out.println("글쓴이 : " + board.getWriter());
		
		service.regist(board);
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public String listAll(Model model) throws Exception {
		System.out.println("Called listAll page (GET)");
		
		model.addAttribute("list", service.listAll());
		
		return "board/listAll2";
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public String read(@RequestParam("bno") int bno, Model model) throws Exception{
		System.out.println("Called read page (GET)");

		model.addAttribute(service.read(bno));
		
		return "board/read2";
	}
}
