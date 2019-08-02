Spring MVC Web Request Data
=====================

Spring MVC Web Request Data Validation  


### Steps

- Create Controller with @Controller annotation
- Request mapping with @RequestMapping annotation
- Create jsp page with input form 
- Inject HttpServletRequest and Model 
- Retrive the request parameter value
- Add Model attribute
- Render the model data to jsp page



#### Create Controller with @Controller annotation

```
@Controller
public class RequestController {

}
```


#### Request mapping with @RequestMapping annotation


```
@RequestMapping("/readingFormData")
public String readingFormData() {
	return "reading-form-data";
}

```


#### Inject HttpServletRequest and Model 


```
@RequestMapping("submitReadingFormData")
public String readingSubmittedFromData(HttpServletRequest request, Model model) {

}

```


#### Retrive the request parameter value and add to Model attribute


```
		model.addAttribute("firstName", request.getParameter("firstName"));
```

#### Render Model data in jsp

```
	<p>First Name: ${firstName}</p>
	<p>Last Name: ${lastName}</p>	
```