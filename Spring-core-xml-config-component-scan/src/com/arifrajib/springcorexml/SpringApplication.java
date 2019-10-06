package com.arifrajib.springcorexml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arifrajib.springcorexml.laundry.LaundryService;

public class SpringApplication {

	public static void main(String[] args) {
		/*
		 * Create Application Context (Ioc)
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanconfig.xml");

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
