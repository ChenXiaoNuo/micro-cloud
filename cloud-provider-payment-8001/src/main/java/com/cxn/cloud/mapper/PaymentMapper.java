package com.cxn.cloud.mapper;

import com.cxn.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author cxn
 * @create 2020-03-16-16:55
 **/
@Mapper
public interface PaymentMapper {

    int create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);

}
