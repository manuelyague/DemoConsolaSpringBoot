package cl.myague;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.myague.service.PersonService;

/* En la inyección de dependencias, el mismo framework crea la instancia.
 * Las instancias son menajadas en ambito singleton.
 * Para generar una instancia en memoria, Spring crea los esterotipos, 
 * por ejmplo: @Repository o @Service
 * Los estereotipos indican que van a crear un bean en el contenedor de Spring*/

@SpringBootApplication
public class DemoConsoleSpringBootApp implements CommandLineRunner {
	
	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsoleSpringBootApp.class, args);

	}

	/*run(String... args) es una interface de org.springframework.boot.CommandLineRunner*/
	@Override
	public void run(String... args) throws Exception {
		personService.registrar(" Manuel");
	}
	
	

	
}
