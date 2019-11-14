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
	
}
