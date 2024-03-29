package ru.itcube46.rest.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Настройка CORS (совместного использования ресурсов между разными источниками)
        registry.addMapping("/**").allowedMethods("*");
    }
}
