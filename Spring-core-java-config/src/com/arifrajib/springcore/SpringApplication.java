package com.arifrajib.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arifrajib.springcore.laundry.LaundryService;

public class SpringApplication {

	public static void main(String[] args) {
		/*
		 * Create Application Context (Ioc)
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		/*
		 * retrive Bean for laundry service
		 */
		LaundryService laundry = context.getBean("laundry", LaundryService.class);
		
		/*
		 * do wash using laundry service
		 */
		System.out.println(laundry.doWashing());
		
		/*
		 * do dry using dryer service
		 */
		System.out.println(laundry.doDrying());
		
		/*
		 * Close the Application Context 
		 */
		context.close();
	}

}
