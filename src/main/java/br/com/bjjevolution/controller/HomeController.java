package br.com.bjjevolution.controller;


import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("message", "API pública, não precisa de login");
    }

    @GetMapping("/usuario")
    public Map<String, Object> usuario(@AuthenticationPrincipal OAuth2User principal) {
        return Map.of(
            "nome", principal.getAttribute("name"),
            "email", principal.getAttribute("email"),
            "foto", principal.getAttribute("picture")
        );
    }
       

}
