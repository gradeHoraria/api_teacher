package com.example.api_teacher.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
