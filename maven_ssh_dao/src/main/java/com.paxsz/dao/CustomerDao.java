package com.paxsz.dao;

import com.paxsz.bean.Customer;

public interface CustomerDao {

    /**
     * 根据ID获取客户信息
     *
     * @param id
     * @return
     */
    Customer findById(Long id);
}
