package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
@RequestMapping("check")	
public ModelAndView show(){
	System.out.println("controller ");
	ModelAndView mv=new ModelAndView();
	mv.setViewName("success.jsp");
	return mv;
}
}
