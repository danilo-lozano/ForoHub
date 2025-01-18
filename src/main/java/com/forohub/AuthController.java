package com.forohub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@Validated
public class AuthController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserService userService;  // Inyectamos UserService

    @PostMapping("/login")
    public String login(@RequestBody @Valid UserLoginDTO loginDTO) {
        if (userService.authenticate(loginDTO.getUsername(), loginDTO.getPassword())) {
            return tokenService.generateToken(loginDTO.getUsername());
        } else {
            throw new UnauthorizedException("Credenciales inválidas");
        }
    }
}



