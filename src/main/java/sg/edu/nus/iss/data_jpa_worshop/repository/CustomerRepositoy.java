package sg.edu.nus.iss.data_jpa_worshop.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.iss.data_jpa_worshop.model.Customer;


public interface CustomerRepositoy extends JpaRepository <Customer, Integer> {
    @Query("SELECT c FROM Customer c JOIN c.addresses a WHERE a.country = :country")
    List<Customer> findCustomerByCountry(@Param("country") String country);
}
