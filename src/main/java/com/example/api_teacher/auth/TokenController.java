package com.example.api_teacher.auth;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.api_teacher.entity.User;

@RestController
@RequestMapping("/token")
public class TokenController {
    
    @PostMapping("/")
    public ResponseEntity<String> getToken(@RequestBody User user) {

        String url = "http://localhost:8080/realms/gradeHoraria/protocol/openid-connect/token";

        HttpHeaders headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();

        formData.add("client_id", user.getClientId());
        formData.add("username", user.getUsername());
        formData.add("password", user.getPassword());
        formData.add("grant_type", user.getGrantType());

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(formData, headers);

        var result = restTemplate.postForEntity(url, request, String.class);
        return result;
    }
}
