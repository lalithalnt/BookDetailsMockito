package com.bookmokito.BookDetailsMokito;

import java.util.List;

public class Book {
	
	private String isbn;
	private String name;
	private List<String> authors;
	private int nop;
	
	public Book(String isbn,String name,List<String> authors,int nop)
	{
		this.isbn=isbn;
		this.name=name;
		this.authors=authors;
		this.nop=nop;
	}

	public String getIsbn()
	{
		return isbn;
	}
	public String getName()
	{
		return name;
	}
	public List<String>  getAuthors()
	{
		return authors;
	}
	public int getNop()
	{
		return nop;
	}
}
