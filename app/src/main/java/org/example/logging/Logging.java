package org.example.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging
{
    @Before("execution(public void org.example.service.UserService.logIn())")
    public void loggingAdvice1(){
        System.out.println("Before running login advice is executed");
    }

    @After("execution(public void org.example.service.UserService.logIn())")
    public void loggingAdvice2(){
        System.out.println("After login advice2 is executed ");
    }
}
