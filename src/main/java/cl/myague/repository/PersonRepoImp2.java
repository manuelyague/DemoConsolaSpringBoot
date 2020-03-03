package cl.myague.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("person2")
public class PersonRepoImp2 implements PersonRepo {
	
	@Override
	public void register(String name) {
		System.out.println("Your name person 2:"+name);
	}

}
