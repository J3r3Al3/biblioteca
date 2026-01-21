package com.biblioteca.biblioteca.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI bibliotecaOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("📚 API Biblioteca")
                        .description("Sistema de gestión de libros - Proyecto Final POO")
                        .version("1.0.0"))
                .servers(List.of(
                        new Server().url("https://biblioteca-production-1c6d.up.railway.app")
                ));
    }
}
