package com.bookmokito.BookDetailsMokito;

import java.util.Collections;
import java.util.List;

import com.bookmokito.BookDetailsMokito.Book;
public class BookDao {

	private static BookDao bdao=new BookDao();
	
	public List<Book> getAllBooks()
	{
		return Collections.EMPTY_LIST;
	}
	public Book getBook(String isbn)
	{
		return null;
	}
	public String addBook(Book book)
	{
	return book.getIsbn();	
	}
	public String updateBook(Book book)
	{
		return book.getIsbn();
	}
	public static BookDao getInstance()
	{
		return bdao;
	}
}
