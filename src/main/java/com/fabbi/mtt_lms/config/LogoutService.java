/*
 * MTT 2023
*/
package com.fabbi.mtt_lms.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogoutService implements LogoutHandler {
    @Override
    public void logout(
            HttpServletRequest request,
            HttpServletResponse response,
            Authentication authentication) {
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return;
        }
        // TODO
        jwt = authHeader.substring(7);
        //        var storedToken = tokenRepository.findByToken(jwt)
        //                .orElse(null);
        ////        if (storedToken != null) {
        //            storedToken.setExpired(true);
        //            storedToken.setRevoked(true);
        //            tokenRepository.save(storedToken);
        //            SecurityContextHolder.clearContext();
        //        }
    }
}
