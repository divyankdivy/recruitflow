package com.jobportal.recruitflow.dto;

import jakarta.validation.constraints.NotBlank;

public class RegisterRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String role;

    public RegisterRequest() {}

    public RegisterRequest(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {return this.username;}
    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return this.password;}
    public void setPassword(String password) {this.password = password;}

    public String getRole() {return this.role;}
    public void setRole(String role) {this.role = role;}
}
