package com.huseynov.security.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class LoginResponse {
    private String token;
    private String username;
    private List<String> roles;

    public LoginResponse(String username, String token, List<String> roles) {
        this.roles = roles;
        this.token = token;
        this.username = username;
    }
}