package com.api.nyx.gastosrecife.doc;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
@Configuration
public class SpringDocConfiguration {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Despesas do Recife API")
                        .version("v1")
                        .description("Projeto de uma API de cosnulta dos gastos do Recife por ano.")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")
                        )
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Link para o GitHub do Projeto")
                        .url("https://github.com/Allanfd12/gastos-recife-back")
                );
    }
}
