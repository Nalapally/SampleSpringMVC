package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.PersonDao;
import com.test.domain.Person;
import com.test.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personDao.findAll();
	}

	@Override
	public void saveOrUpdate(Person person) {
		// TODO Auto-generated method stub
		personDao.saveOrUpdate(person);
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub
		personDao.delete(person);
		
	}


	
}
