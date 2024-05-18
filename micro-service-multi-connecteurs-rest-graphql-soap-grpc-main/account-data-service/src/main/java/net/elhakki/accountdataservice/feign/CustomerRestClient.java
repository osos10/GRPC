package net.elhakki.accountdataservice.feign;

import net.elhakki.accountdataservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082", value = "customer-rest-client")
public interface CustomerRestClient {
    @GetMapping("/customers")
    List<Customer> getCustomers();
    @GetMapping("/customers/{id}")
    Customer getCustomerById( @PathVariable(name = "id") Long id);

}
