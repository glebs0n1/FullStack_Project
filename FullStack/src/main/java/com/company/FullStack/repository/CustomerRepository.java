package com.company.FullStack.repository;

import com.company.FullStack.model.Customer;
import java.util.List;

public interface CustomerRepository {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long id);
}
