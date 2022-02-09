package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/aop/config.xml");
    	   //context object here represents the object of the spring container
    	PaymentService paymentObject=context.getBean("payment", PaymentService.class);
    paymentObject.makePayment(199);//in AOP this is the Join point , i.e. the code that is executing
    
    
    
    }
}
