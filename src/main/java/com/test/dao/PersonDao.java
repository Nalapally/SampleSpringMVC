package com.test.dao;

import java.util.List;

import com.test.domain.Person;

public interface PersonDao {

	public List<Person> findAll();
	
	public void saveOrUpdate(Person person);
	
	public void delete(Person person);
}
