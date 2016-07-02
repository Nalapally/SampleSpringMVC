package com.test.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.test.dao.PersonDao;
import com.test.domain.Person;
import com.test.util.*;

@Repository
public class PersonDaoImpl implements PersonDao {

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<Person> list = null;
		try{
			list = session.createCriteria(Person.class).list();
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}
		return list;
	}

	@Override
	public void saveOrUpdate(Person person) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		try{
			session.saveOrUpdate(person);
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		try{
			session.delete(person);;
			tran.commit();
		}catch(Exception e){
			e.printStackTrace();
			tran.rollback();
		}
	}
}
