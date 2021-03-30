package com.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * good examples:  https://www.javatpoint.com/spring-aop-example
 * good example on AspectJ https://www.javatpoint.com/spring-aop-aspectj-annotation-example
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Customer.xml");
        CustomerService cust = (CustomerService) appContext.getBean("hijackBeforeMethod");

        System.out.println("***************************************");
        cust.printName();
        System.out.println("***************************************");
        cust.printUrl();
        System.out.println("***************************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }

    }
}
