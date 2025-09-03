package br.com.bjjevolution.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/me")
    public Map<String, Object> getLoggedUser(@AuthenticationPrincipal OAuth2User principal) {
        return Map.of(
            "name", principal.getAttribute("name"),
            "email", principal.getAttribute("email"),
            "picture", principal.getAttribute("picture")
        );
    }

   @GetMapping("/login")
    public Map<String, Object> usuario(@AuthenticationPrincipal OAuth2User principal) {
        Map<String, Object> dados = new HashMap<>();
        dados.put("nome", principal.getAttribute("name"));
        dados.put("email", principal.getAttribute("email"));
        return dados;
    }
    

    @GetMapping("/public/ping")
    public Map<String, String> ping() {
        return Map.of("message", "API is alive");
    }
}
