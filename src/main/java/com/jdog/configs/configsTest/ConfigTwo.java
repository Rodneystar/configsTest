package com.jdog.configs.configsTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTwo {

    @Bean
    public String mumsName() {
        return "emma";
    }


}
