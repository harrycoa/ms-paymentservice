package com.pe.appventas.mspaymentservice.repositories;

import com.pe.appventas.mspaymentservice.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    public List<Payment> findByOrderId(String orderId);
    public List<Payment> findByTransactionId(String transactionId);
    public List<Payment> findByAccountId(String accountId);
}
