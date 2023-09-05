/*
 * MTT 2023
*/
package com.fabbi.mtt_lms.dto;

import com.fabbi.mtt_lms.enums.Role;
import lombok.Data;

@Data
public class RegisterRequest {

    private String name;
    private String email;
    private String password;
    private Role role;
}
