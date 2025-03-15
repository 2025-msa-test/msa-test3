package com.example.msatest3.customer.service;
import com.example.msatest3.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}