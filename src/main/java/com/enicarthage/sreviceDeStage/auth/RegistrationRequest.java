package com.enicarthage.sreviceDeStage.auth;

import lombok.*;
import com.enicarthage.sreviceDeStage.user.Role;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegistrationRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
}
