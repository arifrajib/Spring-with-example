package com.arifrajib.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arifrajib.springmvc.model.ContactInformation;

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
	 * Render the contact form
	 * @return
	 */
	@RequestMapping("/readingFormData")
	public String readingFormData() {
		return "reading-form-data";
	}
	
	/**
	 * Read the request data and render the data
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("submitReadingFormData")
	public String readingSubmittedFromData(HttpServletRequest request, Model model) {
		
		/*
		 * reading the request data
		 */
		model.addAttribute("messageHeader", "Reading Request Data");
		model.addAttribute("firstName", request.getParameter("firstName"));
		model.addAttribute("lastName", request.getParameter("lastName"));
		
		return "render-reading-form-data";
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("bindingFormData")
	public String bindingFormData() {
		return "binding-form-data";
	}
	
	/**
	 * Bind the Request Parameter
	 * @param firstName
	 * @param lastName
	 * @param model
	 * @return
	 */
	@RequestMapping("submitBindingFormData")
	public String submitBindingFormData(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, Model model) {
		
		/*
		 * Add model data
		 */
		model.addAttribute("messageHeader", "Reading Request Data");
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		
		return "render-reading-form-data";
	}
	
	/**
	 * Model Data Binding
	 * @return
	 */
	@RequestMapping("modelDataBinding")
	public String modelDataBinding(Model model) {
		model.addAttribute("contactInformation", new ContactInformation());
		return "model-attribute-data-binding";
	}
	
	
	@RequestMapping("submitModelDataBinding")
	public String submitModelDataBinding(@ModelAttribute("contactInformation") ContactInformation information, Model model) {
		
		System.out.println(information.getFirstName()+" --> "+information.getLastName());
		model.addAttribute("message", "Model Attribute and request data binding");
		return "render-model-attribute";
	}
}
