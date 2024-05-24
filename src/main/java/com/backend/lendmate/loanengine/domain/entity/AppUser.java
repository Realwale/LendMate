package com.backend.lendmate.loanengine.domain.entity;

import com.backend.lendmate.loanengine.domain.enums.Occupation;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "users")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean isVerified;

    @Enumerated(EnumType.STRING)
    private Occupation occupation;
}
