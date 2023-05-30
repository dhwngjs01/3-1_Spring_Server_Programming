package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.domain.PageMaker;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*") // localhost:port/board/~~~~
public class BoardController {
	@Inject
	private BoardService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(BoardVO board, Model model) throws Exception {
		System.out.println("Register (GET) Called");

		return "board/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(BoardVO board, RedirectAttributes rttr) throws Exception {
		System.out.println("Register (POST) Called");

		System.out.println("제목 : " + board.getTitle());
		System.out.println("내용 : " + board.getContent());
		System.out.println("글쓴이 : " + board.getWriter());

		service.regist(board);

		return "redirect:/board/listAll";
	}

	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public String listAll(Model model) throws Exception {
		System.out.println("Called listAll page (GET)");

		model.addAttribute("list", service.listAll());

		return "board/listAll";
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("Called read page (GET)");

		model.addAttribute(service.read(bno));

		return "board/read";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("Called modify page (GET)");

		model.addAttribute(service.read(bno));

		return "board/modify";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPost(BoardVO vo, RedirectAttributes rttr) throws Exception {
		System.out.println("Called Modify Page (POST)");

		System.out.println("bno : " + vo.getBno());
		System.out.println("title : " + vo.getTitle());
		System.out.println("content : " + vo.getContent());
		System.out.println("writer : " + vo.getWriter());

		service.modify(vo);

		return "redirect:/board/read?bno=" + vo.getBno();
	}

	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {
		System.out.println("Called Board Remove (GET)");

		service.remove(bno);

		return "redirect:/board/listAll";
	}

	
//	 @RequestMapping(value="/listPage", method=RequestMethod.GET) public String
//	 listAll(@RequestParam(value="page", required=false, defaultValue="1") int page, Model model) throws Exception {
//		 System.out.println("Called listPage page (GET)");
//		 model.addAttribute("list", service.listPage(page));
//		 return "board/listAll";
//	 }
	 

	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public String listAll(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		System.out.println("Called listCriteria page (GET)");
		System.out.println("Total Data Count : " + service.totalDataCount());

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.totalDataCount());

		model.addAttribute("list", service.listPage(cri));
		model.addAttribute("pageMaker", pageMaker);

		return "board/listPage";
	}

	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public String readPage(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model)
			throws Exception {
		System.out.println("Called read page (GET)");

		model.addAttribute(service.read(bno));
		model.addAttribute(cri.getPage());
		model.addAttribute(cri.getPerPageNum());

		return "board/readPage";
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public String modifyPage(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		System.out.println("Called modify page (GET)");

		model.addAttribute(service.read(bno));
		model.addAttribute("page", cri.getPage());
		model.addAttribute("perPageNum", cri.getPerPageNum());

		return "board/modifyPage";
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagePost(BoardVO vo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr)
			throws Exception {
		System.out.println("Called Modify Page (POST)");

		System.out.println("bno : " + vo.getBno());
		System.out.println("title : " + vo.getTitle());
		System.out.println("content : " + vo.getContent());
		System.out.println("writer : " + vo.getWriter());

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());

		service.modify(vo);

		return "redirect:/board/readPage?bno=" + vo.getBno();
	}

	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String removePage(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr)
			throws Exception {
		System.out.println("Called Board Remove (GET)");

		service.remove(bno);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());

		return "redirect:/board/listPage";
	}
}
