package com.example.api_teacher.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

    private final SwaggerService swaggerService;

    @Bean
    OpenAPI executeOpenAi(){
        return new OpenAPI().info(swaggerService.execute());
    }
}
