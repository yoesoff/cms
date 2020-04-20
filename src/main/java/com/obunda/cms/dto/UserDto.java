package com.obunda.cms.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    @NotNull
    @NotEmpty
    private String username;
     
    @NotNull
    @NotEmpty
    private String firstname;
    
    @NotNull
    @NotEmpty
    private String lastname;
     
    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;
     
    @NotNull
    @NotEmpty
    private String email;
}
