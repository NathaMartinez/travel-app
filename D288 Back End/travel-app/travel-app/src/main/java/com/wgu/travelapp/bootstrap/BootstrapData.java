package com.wgu.travelapp.bootstrap;

import com.wgu.travelapp.dao.CartRepository;
import com.wgu.travelapp.dao.CustomerRepository;
import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData  implements CommandLineRunner {

    private final CustomerRepository customerRepository;


    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }


    @Override
    public void run(String... args) throws Exception {
        Customer john = new Customer("John","Jackson","123 Hill ave","12345", "(800)112-2630");
        customerRepository.save(john);
        Customer tony = new Customer("Tony","Smith","422 Coast rd","14222", "(555)642-2040");
        customerRepository.save(tony);
        Customer barbara = new Customer("Barbara","Jackson","144 Hill ave","12345", "(800)143-2040");
        customerRepository.save(barbara);
        Customer susan = new Customer("Susan","Walters","133 Green blvd","54321", "(555)142-2034");
        customerRepository.save(susan);
        Customer jose = new Customer("Jose","Doe","124 Pine st","54432", "(800)142-2140");
        customerRepository.save(jose);
    }
}
