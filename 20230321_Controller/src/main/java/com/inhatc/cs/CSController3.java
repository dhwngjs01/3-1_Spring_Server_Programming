package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.ProductVO;

@Controller
public class CSController3 {
	@RequestMapping("doD")
	public String doB(Model model) {
		System.out.println("doD Called~~~~~~");
		
		ProductVO product = new ProductVO("inhatc Product", 1000);		

		model.addAttribute(product);
		
		return "productDetail"; // -> productDetail.jsp
	}
	
	@RequestMapping("doE")
	public String doE(Model model) {
		System.out.println("doE Called~~~~~~");
		
		MemberVO member = new MemberVO("OH JUHEON");
		
		model.addAttribute(member);
		
		return "doE";
	}
}