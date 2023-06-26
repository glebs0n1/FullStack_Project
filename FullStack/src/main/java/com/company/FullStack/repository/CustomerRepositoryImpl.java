package com.company.FullStack.repository;

import com.company.FullStack.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Customer getCustomerById(Long id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customer.getId())) {
                customers.set(i, customer);
                return customer;
            }
        }
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }
}
