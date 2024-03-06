package com.example.api_teacher.config.modelMapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    
    @Bean
    ModelMapper executeModelMapper() {
        return new ModelMapper();
    }
}
