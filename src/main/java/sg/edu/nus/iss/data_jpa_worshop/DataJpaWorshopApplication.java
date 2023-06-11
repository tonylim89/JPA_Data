package sg.edu.nus.iss.data_jpa_worshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.nus.iss.data_jpa_worshop.model.Address;
import sg.edu.nus.iss.data_jpa_worshop.model.Customer;
import sg.edu.nus.iss.data_jpa_worshop.service.AddressService;
import sg.edu.nus.iss.data_jpa_worshop.service.CustomerService;

@SpringBootApplication
public class DataJpaWorshopApplication {

	@Autowired
    private AddressService addressService;

    @Autowired
    private CustomerService customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(DataJpaWorshopApplication.class, args);
		
	}
	@Bean
	public CommandLineRunner commandLineRun () {
		return args -> {
			// Creating customers
			Customer customer1 = new Customer();
			customer1.setName("Emma");
			customer1.setEmail("emma@example.com");

			// Creating addresses
			Address address1 = new Address();
			address1.setStreet("21 Lower Kent Ridge Rd");
			address1.setCity("Singapore");
			address1.setCountry("SG");

			Address address2 = new Address();
			address2.setStreet("50 Nanyang Ave");
			address2.setCity("Singapore");
			address2.setCountry("SG");

			//Add addresses to a customer
			customer1.addAddress(address1);
			customer1.addAddress(address2);

			// Save customer which will also save the addresses due to cascade setting
			customerService.save(customer1);
		};
	}
}
