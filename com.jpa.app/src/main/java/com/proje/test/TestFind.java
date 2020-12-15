package com.proje.test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositoryImpl;

public class TestFind {

	public static void main(String[] args) {
		BookRepository bookRepository = new BookRepositoryImpl();
		
		Book book = bookRepository.find(100);
		
		if (book != null)
			System.out.println(book);
		else
			System.out.println("Ürün bulunamadı");
		
	}

}
