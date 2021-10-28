package com.bookapp.main;

import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

import com.bookapp.service.BookImpl;
import com.bookapp.service.BookInter;
import com.bookapp.bean.Book;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		BookInter bookObj = new BookImpl();


		Book book2 = new Book("The kite runner","Khalil Gibran", "Drama", 13, 299);
		Book book3 = new Book("A song of fire and ice", "R.R.Martin", "Fantasy", 14, 499);
		Book book4 = new Book("Harry potter Chamber of secrets","J.K.Rowling", "Fantasy", 15, 499);




		bookObj.addBook(book2);
		bookObj.addBook(book3);
		bookObj.addBook(book4);

		Scanner userInputs = new Scanner(System.in);
		//Adding books to bookObj
		for (int i=1;i<2;i++){
			System.out.println("Enter Book Title :");
			String title = userInputs.next();

			System.out.println("Enter Author's Name :");
			String author = userInputs.next();

			System.out.println("Enter Category :");
			String category = userInputs.next();

			System.out.println("Enter Book Id :");
			int bookId = userInputs.nextInt();

			System.out.println("Enter Book Price :");
			int price = userInputs.nextInt();

			Book books = new Book(title, author, category, bookId, price);

			bookObj.addBook(books);
		}
//User input to perform methods
		while (true) {
			int input;

			System.out.println("To print all books enter 1");
			System.out.println();

			System.out.println("To get books by author enter 2");
			System.out.println();

			System.out.println("To get books by category enter 3");
			System.out.println();

			System.out.println("To exit the program enter 4");
			System.out.println();

			input = userInputs.nextInt();

			switch (input) {
				case 1: {
					System.out.println(bookObj.getAllBooks());

					break;
				}
				case 2: {
					try {
						System.out.println("Enter an Author's Name");
						String author = userInputs.next();
						System.out.println(bookObj.getBookbyAuthor(author));

					} catch (AuthorNotFoundException e) {
						System.out.println(e);
					}

					break;
				}
				case 3: {
					try {
						System.out.println("Enter a category :");
						String category = userInputs.next();
						System.out.println(bookObj.getBookbycategory(category));

					} catch (CategoryNotFoundException e) {
						System.out.println("Category not found"+e);
					}

					break;
				}
				case 4: {
					System.out.println("Exiting program");
					System.exit(1);
				}
				default:
					System.out.println("Input invalid, enter value between 1-4");

					break;

			}
		}
	}

}
