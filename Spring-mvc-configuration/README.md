Spring MVC Configuration
=====================

Spring MVC configuration  


### Steps

- Dispatcher Servlet Configuration
  - Configure Spring MVC Dispatcher Servlet
  - Configure URL mapping for Spring MVC Dispatcher Servlet
- Spring MVC Bean Config
  - Add Component scanning on Bean Config
  - Add support for conversion, formatting and validation support
  - Define Spring MVC view resolver
- Create Controller Class
  - Mapping Request parameter
- Return View Templete


#### Dispatcher Servlet Configuration

on web.xml file define Spring dispatcher servlet 

```
<servlet>
	<servlet-name>dispatcher</servlet-name>
	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	<init-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>/WEB-INF/spring-mvc-servlet.xml</param-value>
	</init-param>
	<load-on-startup>1</load-on-startup>
</servlet>

```

and map all web request to the Spring *dispatcher* servlet 

```
	<servlet-mapping>
		<servlet-name>dispatcher</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
```



#### Spring MVC Bean Config

Add component auto scanning and mvc annotation to the Bean configuration

```
<context:component-scan base-package="com.arifrajib.springmvc" />

<mvc:annotation-driven/>

```

add the view resolver
```
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	<property name="prefix" value="/WEB-INF/view/" />
	<property name="suffix" value=".jsp" />
</bean>
```



#### Create Controller

Create Controller with Configuration and RequestMapping annotation 

```
@Controller
public class HomeController {
	@RequestMapping("/")
	public String indenPage() {
		return "index";
	}
}

```


#### Render the view Templete

Return view from controller and render the view templete


