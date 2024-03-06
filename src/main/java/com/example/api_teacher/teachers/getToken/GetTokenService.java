package com.example.api_teacher.teachers.getToken;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.api_teacher.entity.User;

@Service
public class GetTokenService {
    
    public ResponseEntity<String> execute(User user) {

        String url = "http://keycloak:8080/realms/gradeHoraria/protocol/openid-connect/token";

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
