/*
 * MTT 2023
*/
package com.fabbi.mtt_lms.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    String password;
}
