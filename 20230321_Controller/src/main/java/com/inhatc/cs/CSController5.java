package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController5 {
	@RequestMapping("doJSON")
	public @ResponseBody  ProductVO doJSON() {
		System.out.println("doJSON Called~~~~~~~~~~~");
		
		ProductVO vo = new ProductVO("Inhatc1", 100);		
		
		return vo;
	}
}