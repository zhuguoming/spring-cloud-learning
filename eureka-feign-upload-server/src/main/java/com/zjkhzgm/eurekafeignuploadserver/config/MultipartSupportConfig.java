package com.zjkhzgm.eurekafeignuploadserver.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgm
 * Date: 2020/01/15 15:25
 */
@Configuration
public class MultipartSupportConfig {

    @Bean
    public Encoder feignFormEncoder () {
        return new SpringFormEncoder();
    }
}
