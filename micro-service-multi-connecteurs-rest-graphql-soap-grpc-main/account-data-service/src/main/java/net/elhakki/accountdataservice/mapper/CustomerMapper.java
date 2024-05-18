package net.elhakki.accountdataservice.mapper;

import net.elhakki.accountdataservice.model.Customer;
import net.elhakki.customerdataservice.stub.CustomerServiceGrpc;
import net.elhakki.customerdataservice.stub.CustomerServiceOuterClass;
import net.elhakki.customerdataservice.web.CustomerById;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public Customer fromSoapCustomer(net.elhakki.customerdataservice.web.Customer soapCustomer){
        return modelMapper.map(soapCustomer,Customer.class);
    }
    public Customer fromGrpcCustomer(CustomerServiceOuterClass.Customer grpcCustomer){
        return modelMapper.map(grpcCustomer, Customer.class);
    }
}
