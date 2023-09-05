/*
 * MTT 2023
*/
package com.fabbi.mtt_lms.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponse {
    private String accessToken;
    private String refreshToken;
}
