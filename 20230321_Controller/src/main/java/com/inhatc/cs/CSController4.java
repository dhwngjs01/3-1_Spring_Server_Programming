package com.inhatc.cs;

import org.springframework.web.bind.annotation.RequestMapping;

public class CSController4 {
	@RequestMapping("doF")
	public String doF() {
		System.out.println("doF Called~~~~~~~~~~~");
		
		return "doF";
	}
}