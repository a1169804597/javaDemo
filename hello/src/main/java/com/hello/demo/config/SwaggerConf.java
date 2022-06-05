package com.hello.demo.config;

import com.hello.demo.properties.SwaggerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@EnableOpenApi
@Configuration
public class SwaggerConf{
    @Autowired SwaggerProperties swaggerProperties;
    //http://127.0.0.1:8080/swagger-ui/index.html
    @Bean
    public Docket getUserDocket(){
        ApiInfo apiInfo= new ApiInfoBuilder()
                .title(swaggerProperties.getTitle())
                .description(swaggerProperties.getApplicationDescription())
                .version(swaggerProperties.getApplicationVersion())
                .contact(new Contact(swaggerProperties.getApplicationName(), swaggerProperties.getTryHost(), swaggerProperties.getUserEmail()))
                .build();

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo).select()
                .apis(RequestHandlerSelectors.basePackage("com.hello.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
