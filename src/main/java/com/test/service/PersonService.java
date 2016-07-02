package com.test.service;

import java.util.List;

import com.test.domain.Person;

public interface PersonService {

	public List<Person> findAll();
	public void saveOrUpdate(Person person);
}
