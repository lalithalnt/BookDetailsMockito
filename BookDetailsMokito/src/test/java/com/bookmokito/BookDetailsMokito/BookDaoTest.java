package com.bookmokito.BookDetailsMokito;

import java.util.List;
import java.util.Arrays;
import com.bookmokito.BookDetailsMokito.BookDao;
import com.bookmokito.BookDetailsMokito.Book;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDaoTest {

	private static BookDao mockedbdao;
	private static Book b1;
	private static Book b2;
	
	@BeforeClass
	public static void setUp()
	{
		mockedbdao=mock(BookDao.class);
		b1=new Book("5011","Java Basics",Arrays.asList("A.kaethi","B.Ravi","C.Karthik"),500);
		b2=new Book("5012","Spring MVC",Arrays.asList("S.Alfred","B.Monika","V.Nirupam"),1000);
		when(mockedbdao.getAllBooks()).thenReturn(Arrays.asList(b1,b2));
		when(mockedbdao.getBook("5011")).thenReturn(b1);
		when(mockedbdao.addBook(b1)).thenReturn(b1.getIsbn());
		when(mockedbdao.updateBook(b1)).thenReturn(b1.getIsbn());
	}
	
	@Test
	public void testGetAllBooks() throws Exception
	{
		List<Book> allBooks=mockedbdao.getAllBooks();
		assertEquals(2,allBooks.size());
		Book book=allBooks.get(0);
		assertEquals("5011",book.getIsbn());
		assertEquals("Java Basics",book.getName());
		assertEquals(3,book.getAuthors().size());
		assertEquals((Integer)500,book.getNop());
	}
	
	@Test
	public void testGetBook() throws Exception
	{
		String isbn="5011";
		Book book=mockedbdao.getBook(isbn);
		assertEquals(isbn,book.getIsbn());
		assertEquals("Java Basics",book.getName());
		assertEquals(3,book.getAuthors().size());
		assertEquals((Integer) 500,book.getNop());
	}
	
	@Test
	public void testAddBook() throws Exception
	{
		String isbn=mockedbdao.addBook(b1);
		assertEquals(b1.getIsbn(),isbn);
	}
	
	@Test
	public void testUpdateBook() throws Exception
	{
		String isbn=mockedbdao.updateBook(b1);
		assertEquals(b1.getIsbn(),isbn);
	}
}
