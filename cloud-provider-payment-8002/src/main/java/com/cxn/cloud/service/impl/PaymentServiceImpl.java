package com.cxn.cloud.service.impl;

import com.cxn.cloud.entity.Payment;
import com.cxn.cloud.mapper.PaymentMapper;
import com.cxn.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cxn
 * @create 2020-03-16-17:10
 **/
@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentMapper.getPaymentById(id);
        return payment;
    }
}
