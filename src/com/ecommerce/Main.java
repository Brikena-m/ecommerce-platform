package com.ecommerce;

import com.ecommerce.payment.CreditCardPayment;
import com.ecommerce.service.OrderService;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.setPaymentStrategy(new CreditCardPayment());
        orderService.processOrder(150.0);
    }
}
