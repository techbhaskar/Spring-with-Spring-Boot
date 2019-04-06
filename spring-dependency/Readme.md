# How to run Spring Depency example
Clone the project project from git to your local -> Import the spring-dependency project as maven project into your workspace -> then run com.training.spring.Test java file.
# Result as shown
![](https://github.com/techbhaskar/Spring-with-Spring-Boot/blob/master/spring-dependency/spring-dependency-res.JPG)

# What we are going to learn from this example


Bean scopes

singleton : single instance per IoC container (default).

prototype : single bean definition to have any number of object instances.

request : bean definition to an HTTP request

session : bean definition to an HTTP session

global-session : This scopes a bean definition to a global HTTP session.

Bean life depend upon it's scope defined in the applicationcontext xml.

Available bean life cycle methods are init() and destroy()
    	
	<bean id = "springBean" class = "com.training.spring.ExplainSpringBean"
	      init-method = "init" destroy-method = "destroy">
	      <property name = "name" value = "Hello world, Boss Here!"/>
	</bean>
	public void init() {
      	 // do something
        }
	
	public void destroy() {
      	 // do something
   	}

Depency Injection (DI)
Its a design pattern to remove the de-couple the object creation with the application flow. To achieve this we have to give the required information in configuration xml file.

In 2 ways we can acheive DI
1) By Setter injection
2) By Contructor injection
