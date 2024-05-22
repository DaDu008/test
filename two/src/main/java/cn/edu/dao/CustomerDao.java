package cn.edu.dao;

import cn.edu.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface CustomerDao
{
    int addCustomer(Customer customer);
}
