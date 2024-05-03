package com.psds.rest.webservices.restfulwebservices.user;

import java.util.List;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 0;
	
	
	static {
		
		users.add(new User(++usersCount,"psds", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"psds20", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount,"psees", LocalDate.now().minusYears(22)));
	
}

	public User save(User user) {
		
		user.setId(++usersCount);
		users.add(user);
		return user;
		
	}	
	
	

public List<User> FindAll(){
	
	return users;
}
public User FindbyID(int id){
	
	Predicate<? super User> predicate = user -> user.getId().equals(id);
	return users.stream().filter(predicate).findFirst().orElse(null);
}



	
}