package com.company.FullStack.service;

import com.company.FullStack.dto.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private List<CustomerDTO> customers = new ArrayList<>();

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customers;
    }

    @Override
    public CustomerDTO getCustomerById(Long id) {
        for (CustomerDTO customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        customers.add(customerDTO);
        return customerDTO;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customerDTO.getId())) {
                customers.set(i, customerDTO);
                return customerDTO;
            }
        }
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }
}
