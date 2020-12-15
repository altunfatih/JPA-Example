package com.proje.test;

import java.util.Calendar;
import java.util.Date;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositoryImpl;

public class TestPersist {

	public static void main(String[] args) {
		
		BookRepository bookRepository = new BookRepositoryImpl();
		
		Book book1 = new Book(100, "1984", 350, "Türkiye", "Owrnell", createCustomDate(25, 06, 1984));
		Book book2 = new Book(101, "Nazım Hikmet'in Şiirleri", 150, "Türkiye", "Nazım Hikmet", createCustomDate(11, 01, 1999));
		
		bookRepository.save(book1);
		bookRepository.save(book2);
		
		
	}
	
	public static Date createCustomDate(int day, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		
		return calendar.getTime();
	}

}
