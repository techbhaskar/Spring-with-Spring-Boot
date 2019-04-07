# Spring ApplicationContext Container
# ApplicationContext 
ApplicationContext is a container similarly like BeanFactory, which loads Beans etc.. in addition to that it provide the functionalities like MessageSource, Access to URLs and Loading of multiple (hierarchical) contexts.

The available ApplicationContext implementations are −

ClassPathXmlApplicationContext − no need to provide the full path of the XML file but you need to set CLASSPATH properly because this container will look like bean configuration XML file in CLASSPATH.

	AbstractApplicationContext context = new ClassPathXmlApplicationContext("trainingbeans.xml");
  
FileSystemXmlApplicationContext − you need to provide the full path of the XML bean configuration file to the constructor.

  	ApplicationContext context = new FileSystemXmlApplicationContext
	         ("C:/Workspace/training/spring-appcontext/src/main/java/trainingbeans.xml");

WebXmlApplicationContext − This container loads the XML file with definitions of all beans from within a web application.

    XmlWebApplicationContext web_context = new XmlWebApplicationContext();
		web_context.setConfigLocation("/WEB-INF/trainingbeans.xml");
		web_context.setServletContext(request.getServletContext());
    
# Note: we will discuss more about WebXmlApplicationContext in the Web module.

