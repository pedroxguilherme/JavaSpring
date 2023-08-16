package com.in28minutes.learnspringframework.exemples.business;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("Mysql")
public class MySQLDataService implements DataService {

	
	@Override
	public int[] retrieveData() {
	
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
