package com.bookapp.service;

import java.util.*;
import java.util.stream.Collectors;

import com.bookapp.bean.Book;

import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookImpl implements BookInter{

	List<Book> booksList = new ArrayList<>();

	@Override
	public void addBook(Book book) {

		booksList.add(book);
	}

	@Override
	public List<Book> getAllBooks() {
		booksList.sort(Comparator.comparing(Book::getTitle));
		return booksList;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {

		List<Book> filteredList;

		filteredList = booksList.stream()
				.filter(book -> Objects.equals(book.getAuthor(), author))
				.collect(Collectors.toList());

		if (filteredList.isEmpty()) {
			throw new AuthorNotFoundException();
		}

		return filteredList;
	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {

		List<Book> filteredList;

		filteredList = booksList.stream()
				.filter(book -> Objects.equals(book.getCategory(), category))
				.collect(Collectors.toList());

		if (filteredList.isEmpty()) {
			throw new CategoryNotFoundException();
		}

		return filteredList;
	}
	}
	
	

	


