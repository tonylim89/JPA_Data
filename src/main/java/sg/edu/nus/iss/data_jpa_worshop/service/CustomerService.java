package sg.edu.nus.iss.data_jpa_worshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.data_jpa_worshop.model.Customer;
import sg.edu.nus.iss.data_jpa_worshop.repository.CustomerRepositoy;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepositoy CustomerRepository;

    public Customer save(Customer customer) {
        return CustomerRepository.save(customer);
    }

    public List<Customer> getAllCustomer () {
        return CustomerRepository.findAll();
    }

    public List<Customer> getSGCustomer () {
        return CustomerRepository.findCustomerByCountry("SG");
    }
}
