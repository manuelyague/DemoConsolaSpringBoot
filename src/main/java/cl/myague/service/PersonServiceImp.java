package cl.myague.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.myague.repository.PersonRepo;

/*Estereotipo de logica de negocios*/
@Service
public class PersonServiceImp implements PersonService{

	/*Con @Autowired va a buscar una instancia definida por algun estereotipo*/
	@Autowired
	@Qualifier("person")
	private PersonRepo personRepo;
	
	@Override
	public void registrar(String name) {
		personRepo.register(name);
	}

	
}
