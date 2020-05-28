package com.emd.clientui.configuration;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class feignConfig {

    @Bean
    public BasicAuthRequestInterceptor mBasicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("user", "mdp2");
    }


}
