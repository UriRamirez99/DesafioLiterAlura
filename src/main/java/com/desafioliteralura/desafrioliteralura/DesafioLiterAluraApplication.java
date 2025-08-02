package com.desafioliteralura.desafrioliteralura;

import com.desafioliteralura.desafrioliteralura.principal.MenuPrincipal;
import com.desafioliteralura.desafrioliteralura.repository.iAutorRepository;
import com.desafioliteralura.desafrioliteralura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioLiterAluraApplication implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;


	public static void main(String[] args) {
		SpringApplication.run(DesafioLiterAluraApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {

		MenuPrincipal menuPrincipal = new MenuPrincipal(libroRepository, autorRepository);
		menuPrincipal.start();

	}

}
