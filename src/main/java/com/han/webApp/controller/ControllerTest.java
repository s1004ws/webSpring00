package com.han.webApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller //컨트롤러라는 어노테이션
public class ControllerTest {
	//폼으로 접속, post로 접속
	
	@RequestMapping("/formData") //맵핑값과 주소가 일치하면 아래 메소드 실행
	public String formData(@RequestParam("name") String name,
							@RequestParam("num") int num,
							@RequestParam("tel") String tel, Model model){
		//String name = req.getParameter("name");
		//String num = req.getParameter("num");
		//String tel = req.getParameter("tel");
		
		model.addAttribute("name",name);
		model.addAttribute("num",num);
		model.addAttribute("tel",tel);
		
		return "formView";
	}
	
/*	@RequestMapping("/formData") //맵핑값과 주소가 일치하면 아래 메소드 실행
	public String formData(HttpServletRequest req, Model model){
		String name = req.getParameter("name");
		String num = req.getParameter("num");
		String tel = req.getParameter("tel");
		
		model.addAttribute("name",name);
		model.addAttribute("num",num);
		model.addAttribute("tel",tel);
		
		return "formView";
	}*/
	//a태그로 접속
	@RequestMapping(value="/aLink", method=RequestMethod.GET) // /aLink로 접속하면
	public String aLinkTest(HttpServletRequest req, Model model){
		//클라이언트 측에서 보낸 데이타
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		
		//뷰로 데이타 보내기
		model.addAttribute("num",num);
		model.addAttribute("name",name);
		return "aLink";
	}
	
	@RequestMapping("/view1") //주소표시줄에 view1으로 접속했을때
	public String viewTest(Model model){
		
		//이름, 연락처
		model.addAttribute("name","홍길동");
		model.addAttribute("tel","010-1234-5678");
		return "view1";
	}
}
