package com.pe.appventas.mspaymentservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentConfirmation {
    private String authCode;
    private String status;
}
