package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    public MyConfig() {
        System.out.println("test");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // /images/**是静态映射， file:/root/images/是文件在服务器的路径
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:D:\\jrebel\\IdeaProjects\\SSM\\target\\SSM-1.0-SNAPSHOT\\upload/");
    }
}