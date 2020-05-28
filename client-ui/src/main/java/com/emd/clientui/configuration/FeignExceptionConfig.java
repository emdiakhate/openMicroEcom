package com.emd.clientui.configuration;

import com.emd.clientui.exceptions.CustomErrorDecoder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {
    public CustomErrorDecoder customErrorDecoder(){
        return customErrorDecoder();
    }


}

