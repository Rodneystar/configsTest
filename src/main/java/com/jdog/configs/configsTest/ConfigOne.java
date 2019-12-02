package com.jdog.configs.configsTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.annotation.Priority;

@Configuration
public class ConfigOne {

    @Bean
    @Primary
    public String dadsName() {
        return "jonny";
    }

    @Bean
    public MyOptions getOptions() {
        return new MyOptions( "lark", true);
    }


}
