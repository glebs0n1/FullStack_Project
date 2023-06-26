package com.company.FullStack.service;

import com.company.FullStack.model.Customer;
import com.company.FullStack.repository.CustomerRepository;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.createCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomer(id);
    }
}
