package com.pe.appventas.mspaymentservice.dto;

import lombok.Data;

@Data
public class PaymentRequest {
    private String orderId;
    private String currency;
    private String accountId;
    private double amount;
    PaymentDetailsDto payment;
}
