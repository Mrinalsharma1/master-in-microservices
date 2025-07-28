package com.microex.accounts.service;

import com.microex.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * Creates a new customer account.
     *
     * @param customerDto the data transfer object containing customer details
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
