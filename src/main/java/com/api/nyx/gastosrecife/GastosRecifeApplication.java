package com.api.nyx.gastosrecife;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GastosRecifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GastosRecifeApplication.class, args);
	}


	@GetMapping("/")
	@Operation(summary = "Verifica se a API está funcionando")
	public String hello() {
		return "I'm working!";
	}
}
