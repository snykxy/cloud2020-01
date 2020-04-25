package com.yanchong.springcloud.dao;

import com.yanchong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getById(int id);
}
