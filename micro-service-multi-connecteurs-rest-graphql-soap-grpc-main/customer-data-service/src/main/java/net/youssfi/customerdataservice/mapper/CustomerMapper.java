package net.elhakki.customerdataservice.mapper;

import net.elhakki.customerdataservice.dto.CustomerRequest;
import net.elhakki.customerdataservice.entities.Customer;
import net.elhakki.customerdataservice.stub.CustomerServiceOuterClass;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;
@Component
public class CustomerMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public Customer from(CustomerRequest customerRequest){
        //Customer customer=new Customer();
        //customer.setName(customerRequest.name());
        //customer.setEmail(customerRequest.email());
        return  modelMapper.map(customerRequest, Customer.class);

    }

    public CustomerServiceOuterClass.Customer fromCustomer(Customer customer){
        return modelMapper.map(customer, CustomerServiceOuterClass.Customer.Builder.class).build();
    }
    public Customer fromGrpcCustomerRequest(CustomerServiceOuterClass.CustomerRequest customerRequest){
        return modelMapper.map(customerRequest, Customer.class);
    }
}
