package com.cxn.cloud.service;

import com.cxn.cloud.entity.Payment;

/**
 * @author cxn
 * @create 2020-03-16-17:09
 **/
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
