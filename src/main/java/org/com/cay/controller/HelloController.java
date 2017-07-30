package org.com.cay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/index0")
	public String hello0(){
		return "index";
	}
	
	@RequestMapping("/index1")
	public ModelAndView hello1(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		
		mv.addObject("name", "Cay");
		return mv;
	}
}
