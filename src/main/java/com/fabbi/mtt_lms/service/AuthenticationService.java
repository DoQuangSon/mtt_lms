/*
 * MTT 2023
*/
package com.fabbi.mtt_lms.service;

import com.fabbi.mtt_lms.dto.AuthenticationRequest;
import com.fabbi.mtt_lms.dto.AuthenticationResponse;
import com.fabbi.mtt_lms.dto.RegisterRequest;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);

    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
