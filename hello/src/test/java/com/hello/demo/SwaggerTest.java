package com.hello.demo;

import com.hello.demo.properties.SwaggerProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SwaggerTest {
    @Autowired SwaggerProperties swaggerProperties;
    @Value("${spring.profiles.active}")  private  String env;

    @Test
    public void properties(){
        System.out.println("swagger enable:" + swaggerProperties.getEnable());
        System.out.println("swagger application name:"+ swaggerProperties.getApplicationName());
        System.out.println("swagger application description:" + swaggerProperties.getApplicationDescription());
        System.out.println("swagger try host:"+ swaggerProperties.getTryHost());
        System.out.println("swagger title:" + swaggerProperties.getTitle());
        System.out.println("swagger email:"+ swaggerProperties.getUserEmail());
    }


    @Test
    void envTest() {
        System.out.println("env:" + env);

    }
}
