package com.aop.service;

public class PaymentServiceImpl implements PaymentService{
	public void makePayment(int amount) {
		System.out.println("Amount debited");
		
		
		System.out.println("Payment credited");
	}
}
