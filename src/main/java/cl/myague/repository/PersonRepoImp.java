package cl.myague.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/* @Repository es un estereotipo que indica acceso a una fuente de datos.
 * @Qualifier cuando 2 clases implementan la misma interfaces se genera un error en runtime, 
 *            con Qualifier, es posible solvertar el problema dando un ID a cada implementación*/
@Repository
@Qualifier("person")
public class PersonRepoImp implements PersonRepo {
	
	@Override
	public void register(String name) {
		System.out.println("Your name:"+name);
	}

}
