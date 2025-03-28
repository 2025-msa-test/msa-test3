package com.example.msatest3.customer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
}


//spring.application.name=msa-test3
//
//        spring.datasource.url=jdbc:mysql://paper-data-crawling.cl64kkugmebl.ap-northeast-2.rds.amazonaws.com:3306/paper1?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC
//        spring.datasource.username=paper
//        spring.datasource.password=paper)paper123
//        spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//
//        spring.jpa.hibernate.ddl-auto=update
//        spring.jpa.show-sql=true
//        spring.jpa.properties.hibernate.format_sql=true
//        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
//
//        management.endpoints.web.exposure.include=health
//
