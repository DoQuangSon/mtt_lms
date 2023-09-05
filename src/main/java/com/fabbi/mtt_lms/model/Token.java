/*
 * MTT 2023
*/
package com.fabbi.mtt_lms.model;

import javax.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Token {
    @Id @GeneratedValue public Integer id;

    @Column(unique = true)
    public String token;

    public boolean revoked;

    public boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User user;
}
