package sg.edu.nus.iss.data_jpa_worshop.repository;

import sg.edu.nus.iss.data_jpa_worshop.model.Address;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
  List<Address> findByCountry(String country);
}
