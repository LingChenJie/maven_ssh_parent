package com.paxsz.service.impl;

import com.paxsz.bean.Customer;
import com.paxsz.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//@ContextConfiguration(locations={"classpath*:applicationContext-*.xml"})
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml", "classpath:applicationContext-service.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void test() {
        Customer customer = customerService.findById(1L);
        System.out.println(customer.toString());
    }
}