package com.proje.test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositoryImpl;

public class TestUpdate {

	public static void main(String[] args) {
		BookRepository bookRepository = new BookRepositoryImpl();

		Book book = bookRepository.find(101);
		
		book.setTopic("Şiir");
		
		bookRepository.update(book);
	}

}
