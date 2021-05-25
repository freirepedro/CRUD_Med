package net.backend.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import net.backend.crud.controller.ControllerMed;

@SpringBootApplication
@ComponentScan({"net.backend.crud.controller", "net.backend.crud.model", "net.backend.crud.repo"})//basePackageClasses = ControllerMed.class)
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
