package com.microex.accounts.dto;

import lombok.Data;

@Data
public class CustomerDetailsDto {
    private String name;

    private String email;

    private long accountNumber;

    private String branchAddress;
}
