package com.paxsz.dao.impl;

import com.paxsz.bean.Customer;
import com.paxsz.dao.CustomerDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public Customer findById(Long id) {
        Customer customer = getHibernateTemplate().get(Customer.class, id);
        return customer;
    }
}
