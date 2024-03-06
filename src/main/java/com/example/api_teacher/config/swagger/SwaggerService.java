package com.example.api_teacher.config.swagger;

import org.springframework.stereotype.Component;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Component
public class SwaggerService {
    
    Info execute(){
        return new Info()
            .title("API de professores")
            .version("v1")
            .description("Documentação da api de professores do sistema de grade horária")
            .termsOfService("")
            .license(
                new License()
                    .name("Apache 2.0")
                    .url("")
            );
    }
}
