package com.arifrajib.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {

	/**
	 * Home Request Mapping
	 * @return
	 */
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/readingFormData")
	public String readingFormData() {
		return "reading-form-data";
	}
	
	@RequestMapping("submitReadingFormData")
	public String readingSubmittedFromData(HttpServletRequest request, Model model) {
		
		/*
		 * reading the request data
		 */
		model.addAttribute("firstName", request.getParameter("firstName"));
		model.addAttribute("lastName", request.getParameter("lastName"));
		
		return "render-reading-form-data";
	}
}
