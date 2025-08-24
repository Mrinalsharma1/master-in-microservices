package com.microex.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record AccounntsContactInfoDto(String message, Map<String, String> contactDetails) {
}
