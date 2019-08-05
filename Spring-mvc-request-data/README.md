Spring MVC Web Request Data
=====================

Spring MVC Web Request Data Processing  


### Speps

- Reading Request Data
- Binding Request Parameter
- Model Attribute request data binding




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


#### Model Attribute request data binding

Binding the Model

```
@RequestMapping("modelDataBinding")
public String modelDataBinding(Model model) {
	model.addAttribute("contactInformation", new ContactInformation());
	return "model-attribute-data-binding";
}
```

Inject the Request Data binding with Model

```
@RequestMapping("submitModelDataBinding")
public String submitModelDataBinding(@ModelAttribute("contactInformation") ContactInformation information) {

}		
```

