package com.example.apollodemo.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h1> </h1>
 */
@Configuration
@EnableApolloConfig(value = {"application", "product.response"})
public class AppConfig {
    @Bean
    public ApolloConfigBean javaConfigBean() {
        return new ApolloConfigBean();
    }
}
