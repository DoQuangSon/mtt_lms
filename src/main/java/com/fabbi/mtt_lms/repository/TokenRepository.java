/*
								* (C) 2023 - $today.date - $today.month - $today
								*/
package com.fabbi.mtt_lms.repository;

import com.fabbi.mtt_lms.model.Token;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TokenRepository extends JpaRepository<Token, Long> {

    @Query(
            value =
                    "select t from Token t inner join User u "
                            + " on t.user.id = u.id "
                            + " where u.id = :id and (t.expired = false or t.revoked = false)")
    List<Token> findAllValidTokenByUser(Long id);

    Optional<Token> findByToken(String token);
}
