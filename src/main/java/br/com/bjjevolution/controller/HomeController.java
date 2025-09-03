package br.com.bjjevolution.controller;


import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    
    @GetMapping("/home")
    public Map<String, Object> usuario(@AuthenticationPrincipal OAuth2User principal) {
        return Map.of(
            "nome", principal.getAttribute("name"),
            "email", principal.getAttribute("email"),
            "foto", principal.getAttribute("picture")
        );
    }     

}
