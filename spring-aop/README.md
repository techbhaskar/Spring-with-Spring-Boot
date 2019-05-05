# How to run Spring Aop example
Clone the project project from git to your local -> Import the spring-aop project as maven project into your workspace -> then run com.training.spring.Test java file.
# Result as shown
![](https://github.com/techbhaskar/Spring-with-Spring-Boot/blob/master/spring-appcontext/spring-aop-res.JPG)

# What we are going to learn from this example
# Spring AOP

Aspect-Oriented Programming entails breaking down program logic into distinct parts called so-called concerns.

There are various common good examples of aspects like logging, auditing, security, caching etc.

Types of Advice

before : Run advice before the a method execution.

after : Run advice after the method execution, regardless of its outcome.

after-returning : Run advice after the a method execution only if method completes successfully.

after-throwing : Run advice after the a method execution only if method exits by throwing an exception.

around : Run advice before and after the advised method is invoked.

