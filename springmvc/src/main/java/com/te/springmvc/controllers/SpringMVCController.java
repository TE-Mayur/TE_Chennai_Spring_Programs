package com.te.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCController {

	@RequestMapping(path = "/welcome" , method = RequestMethod.GET)
	public ModelAndView getWelcomePage() {
		System.out.println("this is a handler method");
		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("/WEB-INF/views/welcomepage.jsp");
		modelAndView.setViewName("welcomepage");
		return modelAndView;
	}// end of getWelcomePage
	
	@RequestMapping(path = "/hello" , method = RequestMethod.GET)
	public ModelAndView getPage(ModelAndView modelAndView) {
		System.out.println("this is a handler method");
	//	modelAndView.setViewName("/WEB-INF/views/welcomepage.jsp");
		modelAndView.setViewName("welcomepage");
		return modelAndView;
	}// end of getWelcomePage
	
	@GetMapping("/read")
	public String getData(Integer id) {
		System.out.println("Param value = " + id);
		return "welcomepage";
	}
	

}
  