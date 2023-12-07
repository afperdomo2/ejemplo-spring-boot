package com.felipe.Ejemplo_2023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejemplo2023Application {
	@Autowired
	MuseoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo2023Application.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner() {
		return args -> {
			Museo museoDelOro = Museo.crear("Museo del Oro", "Bogotá");
			Museo museoDeArteM = Museo.crear("Museo de arte moderno", "Bogotá");

			repository.save(museoDelOro);
			repository.save(museoDeArteM);
		};
	}
}
