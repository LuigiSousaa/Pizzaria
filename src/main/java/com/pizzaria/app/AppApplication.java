package com.pizzaria.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pizzaria.app.Repository.VerificaCadastroFuncionarioRepository;

@SpringBootApplication
public class AppApplication {
	@Autowired
    VerificaCadastroFuncionarioRepository vcfr;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

	}

}
