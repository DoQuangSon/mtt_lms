/*
								* (C) 2023 - $today.date - $today.month - $today
								*/
package com.fabbi.mtt_lms.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    String password;
}
