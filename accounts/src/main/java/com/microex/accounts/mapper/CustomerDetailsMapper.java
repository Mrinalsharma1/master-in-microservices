//package com.microex.accounts.mapper;
//
//import com.microex.accounts.dto.CustomerDetailsDto;
//import com.microex.accounts.entity.Accounts;
//import com.microex.accounts.entity.Customer;
//
//public class CustomerDetailsMapper {
//    //give the data from customer and accounts entity to customerDetailsDto
//    public static CustomerDetailsDto mapToCustomerDetailsDto(Customer customer, Accounts accounts) {
//        if (customer != null && accounts != null) {
//            CustomerDetailsDto customerDetailsDto = new CustomerDetailsDto();
//            customerDetailsDto.setName(customer.getName());
//            customerDetailsDto.setEmail(customer.getEmail());
//            customerDetailsDto.setAccountNumber(accounts.getCustomerId());
//            customerDetailsDto.setBranchAddress(accounts.getBranchAddress());
//            return customerDetailsDto;
//        }
//        return null;
//    }
//
//}
