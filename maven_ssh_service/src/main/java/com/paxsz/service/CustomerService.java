package com.paxsz.service;

import com.paxsz.bean.Customer;

public interface CustomerService {

    /**
     * 根据ID获取客户信息
     *
     * @param id
     * @return
     */
    Customer findById(Long id);
}
