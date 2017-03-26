package ch.surech.versionplayground.api.customer.rest;

import ch.surech.versionplayground.api.customer.model.CustomerEntity;
import ch.surech.versionplayground.api.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * REST-Schnittstelle für den Kunden
 */
@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<CustomerEntity> getAll() {
        Iterable<CustomerEntity> customers = customerRepository.findAll();
        List<CustomerEntity> result = new ArrayList<>();
        customers.forEach(result::add);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public CustomerEntity createCustomer(@RequestBody CustomerEntity newCustomer) {
        CustomerEntity savedCustomer = customerRepository.save(newCustomer);
        return savedCustomer;
    }
}
