package com.forohub;

import javax.validation.constraints.NotBlank;

public class UserLoginDTO {

    @NotBlank
    private String username;

    @NotBlank
    private String password;


    public UserLoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



