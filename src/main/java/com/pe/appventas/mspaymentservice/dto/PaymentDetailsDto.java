package com.pe.appventas.mspaymentservice.dto;

import lombok.Data;

@Data
public class PaymentDetailsDto {
    private String cardNumber;
    private String cardCode;
    private String expirationMonth;
    private String expirationYear;
    private String method;
}
