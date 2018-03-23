package com.paxsz.dao.impl;

import com.paxsz.bean.Customer;
import com.paxsz.dao.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerDaoImplTest {

    //	@Test
//	public void test() {
//		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
//		CustomerDao customerDao = (CustomerDao) app.getBean("customerDao");
//		Customer customer = customerDao.findById(23L);
//		System.out.println("********************"+customer.getCustName());
//	}

    @Autowired
    private CustomerDao customerDao;

    @Test
    public void test() {
        Customer customer = customerDao.findById(1L);
        System.out.println(customer.toString());
    }

}