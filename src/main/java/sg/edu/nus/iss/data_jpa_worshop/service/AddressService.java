package sg.edu.nus.iss.data_jpa_worshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.data_jpa_worshop.model.Address;
import sg.edu.nus.iss.data_jpa_worshop.repository.AddressRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public List<Address> findByCountry() {
        return addressRepository.findByCountry("SG");
    }
    
}
