package com.sgl.msscbrewery.web.mappers;

import com.sgl.msscbrewery.domain.Customer;
import com.sgl.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);

}
