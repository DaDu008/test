package cn.edu.services;

import cn.edu.Customer;
import cn.edu.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public int addCustomer(Customer customer)
    {
        return customerDao.addCustomer(customer);
    }
}
