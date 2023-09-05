/*
 * MTT 2023
*/
package com.fabbi.mtt_lms.repository;

import com.fabbi.mtt_lms.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
