package com.ecommerce.service;

import com.ecommerce.payment.PaymentStrategy;

public class OrderService {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
