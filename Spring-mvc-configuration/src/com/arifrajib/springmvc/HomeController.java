package com.arifrajib.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Define Controller
 */
@Controller
public class HomeController {

	/**
	 * Home/index request mapping
	 * @return
	 */
	@RequestMapping("/")
	public String indenPage() {
		return "index";
	}
	/**
	 * About Us request mapping
	 * @return
	 */
	@RequestMapping("/about")
	public String aboutUsPage(Model model) {
		model.addAttribute("message", "Custom message for about us page");
		return "about";
	}
	
	/**
	 * Contact Us request mapping
	 * @return
	 */
	@RequestMapping("/contact")
	public String contactUs(Model model) {
		model.addAttribute("message", "Custom message for contact us page");
		return "contact";
	}
}
