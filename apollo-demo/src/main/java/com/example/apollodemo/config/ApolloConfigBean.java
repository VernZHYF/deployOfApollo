package com.example.apollodemo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * <h1> </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApolloConfigBean {
    @Value("${timeout:100}")
    private int timeout;

    @Value("${batch:200}")
    private String batch;

}
