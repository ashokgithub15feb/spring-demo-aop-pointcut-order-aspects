package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	//this is where we add all of our related to advices for logging
	
	//let's start with the @Before advice
	
	//applied pointcut declration yo advices
	@Before("com.luv2code.aopdemo.aspect.util.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=======>>>>> Execution Logging Aspect on method");
	}
	
}





















