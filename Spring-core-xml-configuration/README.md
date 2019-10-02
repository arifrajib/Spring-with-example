Spring Core with XML Configuration
=====================

Spring Core, Bean configuration and dependency injection with XML 


## Topics Cover

- Inversion of control (IoC)
- Initialization Callbacks
- Destruction Callbacks
- Dependency Injection (DI)
  - Constructor Injection
  - Setter Injection
  - Field Injection
- Injecting values from Property file


### Steps

- Define the Service interface
  - Implement Service class
- Defile another Service interface (dependent)
  - Implement dependent Service class
- Inject the Dependency
- Configure Spring Bean with dependency injection
- Create Application context with configuration xml


#### Define the Service interface

* Create WasherService interface
* Create DryerService interface 


##### Implement Service class

* implement WasherService interface with AbcWasherService
* implement DryerService interface with MnoDryerService


#### Defile another Service interface

* Define the LaundryService


##### Implement dependent Service class

* Implement LaundryService with AbcLaundryService class

AbcLaundryService class have dependency with AbcWasherService and MnoDryerService 




#### Inject the Dependency

```
	public AbcLaundryService(WasherService service) {
		washer = service;
	}
```


#### Configure Spring Bean with dependency injection

```
	<!-- laundry service with Dependency Injection -->
	<bean id="laundry"
			class="com.arifrajib.springcorexml.laundry.AbcLaundryService"
			init-method="welcomeMessage"
			destroy-method="thanksMessage">
			
			<!-- Constructor Injection -->
			<constructor-arg ref="washService" />
			
			<!-- Setter Injection -->
			<property name="drayerService" ref="dryerService" />
	</bean>
```

#### Create Application context with configuration xml

Create application context

```
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanconfig.xml");
```

##### Call the Bean

```
	System.out.println(laundry.doWashing());
```
