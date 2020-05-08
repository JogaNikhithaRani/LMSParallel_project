package com.capgemini.librarymanagementsystem;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem.dao.AdminDAO;
import com.capgemini.librarymanagementsystem.dao.AdminDAOImplementation;
import com.capgemini.librarymanagementsystem.dto.AdminBean;
import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;

public class AdminDAOTest {

	private AdminDAO dao=new AdminDAOImplementation();
	
	@Test
	public void testAddBookValid() {
		BookBean info = new BookBean();
		info.setId(12345);
		info.setBookName("javacolle");
		info.setAuthor("jamesgosling");
		info.setCategory("java");
		info.setBookName("sunmicrosystems");
		boolean status=dao.addBook(info);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testAddBookInvalid() {
		BookBean info = new BookBean();
		info.setId(12345);
		info.setBookName("javacolle");
		info.setAuthor("jamesgosling");
		info.setCategory("java");
		info.setBookName("sunmicrosystems");
		boolean status=dao.addBook(info);
		Assertions.assertFalse(status);
	}
	@Test
	public void testRegisterAdminValid() {
		AdminBean adn=new AdminBean();
		adn.setId(123445);
		adn.setName("amulya");
		adn.setMobile(994920634);
		adn.setEmail("amulya@gmail.com");
		adn.setPassword("Amulya@123");
		boolean status=dao.registerAdmin(adn);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testRegisterAdminInvalid() {
		AdminBean adn=new AdminBean();
		adn.setId(123445);
		adn.setName("amulya");
		adn.setMobile(994920634);
		adn.setEmail("amulya@gmail.com");
		adn.setPassword("Amulya@123");
		boolean status=dao.registerAdmin(adn);
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testLoginAdminValid() {
		AdminBean info = dao.loginAdmin("amulya@gmail.com", "Amulya@123");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testLoginAdminInvalid() {
		AdminBean info = dao.loginAdmin("amulya@gmail.com", "Amulya123");
		Assertions.assertNull(info);
	}
	
	@Test
	public void testRemoveBookValid() {
		boolean status=dao.removeBook(12345);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testRemoveBookInvalid() {
		boolean status=dao.removeBook(12345);
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testSearchBookByTitleValid() {
		List<BookBean> info = dao.searchBookByTitle("javajdbc");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testSearchBookByTitleInvalid() {
		List<BookBean> info = dao.searchBookByTitle("RkNarayan");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testSearchBookByAuthorValid() {
		List<BookBean> info = dao.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testSearchBookByAuthorInvalid() {
		List<BookBean> info = dao.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testSearchBookByCategoryValid() {
		List<BookBean> info = dao.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testSearchBookByCategoryInvalid() {
		List<BookBean> info = dao.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testGetBookInfoValid() {
		List<BookBean> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testGetBookInfoInvalid() {
		List<BookBean> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testShowUsersValid() {
		List<UserBean> info = dao.showUsers();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testShowUsersInvalid() {
		List<UserBean> info = dao.showUsers();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testShowRequestsValid() {
		List<RequestBean> info = dao.showRequests();
		Assertions.assertNotNull(info);
	}
	

	@Test
	public void testShowRequests1() {
		List<RequestBean> info = dao.showRequests();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testBookIssueValid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = dao.bookIssue(user, book);
		Assertions.assertTrue(check);
		
	}

	@Test
	public void testBookIssueInvalid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = dao.bookIssue(user, book);
		Assertions.assertFalse(check);
		
	}
	
	@Test
	public void isBookReceivedValid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = dao.isBookReceived(user, book);
		Assertions.assertTrue(check);
		
	}
	
	@Test
	public void isBookReceivedInvalid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = dao.isBookReceived(user, book);
		Assertions.assertFalse(check);
		
	}
}
	
