package com.proje.repository;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.impl.JpaFactoryImpl;
import com.proje.model.Book;

public interface BookRepository {
	
	JpaFactory jpaFactory = new JpaFactoryImpl();

	void save(Book book);
	
	void delete(Book book);
	
	Book find(int id);
	
	Book update(Book book);
}
