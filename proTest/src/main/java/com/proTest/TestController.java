package com.proTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/songyeonsu.do")
	public String hello(Model model) {
		System.out.println("�ȳ��ϼ���");
		model.addAttribute("message","hello.jsp�Դϴ�.");
		return "hello";
	}
}