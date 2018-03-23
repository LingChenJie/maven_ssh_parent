package com.paxsz.service.impl;

import com.paxsz.bean.Customer;
import com.paxsz.dao.CustomerDao;
import com.paxsz.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    @Override
    public Customer findById(Long id) {
        return customerDao.findById(id);
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
