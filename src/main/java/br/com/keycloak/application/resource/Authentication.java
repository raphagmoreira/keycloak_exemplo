package br.com.keycloak.application.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authentication")
public class Authentication {

    @GetMapping
    public String teste() {
        return "Autenticado!";
    }

}
