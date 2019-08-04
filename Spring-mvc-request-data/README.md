Spring MVC Web Request Data
=====================

Spring MVC Web Request Data Processing  


### Speps

- Reading Request Data
- Binding Request Parameter




#### Reading Request Data

```
@RequestMapping("submitReadingFormData")
public String readingSubmittedFromData(HttpServletRequest request, Model model) {

	/* 
	* Read the Request parameter
	*/		
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
}
```


#### Binding Request Parameter


```
@RequestMapping("submitBindingFormData")
public String submitBindingFormData(
		@RequestParam("firstName") String firstName, 
		@RequestParam("lastName") String lastName, 
		Model model) {

}

```


