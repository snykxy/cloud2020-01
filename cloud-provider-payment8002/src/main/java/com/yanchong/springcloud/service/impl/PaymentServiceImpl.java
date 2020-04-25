package com.yanchong.springcloud.service.impl;

import com.yanchong.springcloud.dao.PaymentDao;
import com.yanchong.springcloud.entities.Payment;
import com.yanchong.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getById(int id) {
        return paymentDao.getById(id);
    }
}
