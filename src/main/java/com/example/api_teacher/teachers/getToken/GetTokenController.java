package com.example.api_teacher.teachers.getToken;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_teacher.entity.User;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/token")
public class GetTokenController {

    private final GetTokenService getTokenService;

    @PostMapping("/get")
    @Operation(summary = "Obter token de acesso")
    public ResponseEntity<String> getToken(@RequestBody User user) {
        return getTokenService.execute(user);
    }
}
