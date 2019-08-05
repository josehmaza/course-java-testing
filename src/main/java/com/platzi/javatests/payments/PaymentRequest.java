package com.platzi.javatests.payments;

public class PaymentRequest {
    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    private double amount;

    public double getAmount() {
        return amount;
    }
}
