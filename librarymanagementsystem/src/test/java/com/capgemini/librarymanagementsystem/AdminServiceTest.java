package com.capgemini.librarymanagementsystem;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem.dto.AdminBean;
import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;
import com.capgemini.librarymanagementsystem.service.AdminService;
import com.capgemini.librarymanagementsystem.service.AdminServiceImplementation;

public class AdminServiceTest {
	private AdminService service=new AdminServiceImplementation();

	@Test
	public void testAddBookValid() {
		BookBean info = new BookBean();
		info.setId(12345);
		info.setBookName("javacolle");
		info.setAuthor("jamesgosling");
		info.setCategory("java");
		info.setBookName("sunmicrosystems");
		boolean status=service.addBook(info);
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
		boolean status=service.addBook(info);
		Assertions.assertFalse(status);
	}
	@Test
	public void testRegisterAdminValid() {
		AdminBean adn=new AdminBean();
		adn.setId(123445);
		adn.setName("nikhitha");
		adn.setMobile(984816573);
		adn.setEmail("joganikhitha@gmail.com");
		adn.setPassword("Arunaprasad@11");
		boolean status=service.registerAdmin(adn);
		Assertions.assertTrue(status);
	}

	@Test
	public void testRegisterAdminInvalid() {
		AdminBean adn=new AdminBean();
		adn.setId(123445);
		adn.setName("nikhitha");
		adn.setMobile(994920634);
		adn.setEmail("joganikhitha@gmail.com");
		adn.setPassword("Arunaprasad@11");
		boolean status=service.registerAdmin(adn);
		Assertions.assertFalse(status);
	}

	@Test
	public void testLoginAdminValid() {
		AdminBean info = service.loginAdmin("joganikhitha@gmail.com", "Arunaprasad@11");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testLoginAdminInvalid() {
		AdminBean info = service.loginAdmin("aruna@gmail.com", "Arunaprasad11");
		Assertions.assertNull(info);
	}

	@Test
	public void testRemoveBookValid() {
		boolean status=service.removeBook(12345);
		Assertions.assertTrue(status);
	}

	@Test
	public void testRemoveBookInvalid() {
		boolean status=service.removeBook(12345);
		Assertions.assertFalse(status);
	}

	@Test
	public void testSearchBookByTitleValid() {
		List<BookBean> info = service.searchBookByTitle("javajdbc");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByTitleInvalid() {
		List<BookBean> info = service.searchBookByTitle("RkNarayan");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testSearchBookByAuthorValid() {
		List<BookBean> info = service.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByAuthorInvalid() {
		List<BookBean> info = service.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByCategoryValid() {
		List<BookBean> info = service.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchByCategory1() {
		List<BookBean> info = service.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testGetBookInfoValid() {
		List<BookBean> info = service.getBooksInfo();
		Assertions.assertNotNull(info);
	}

	@Test
	public void testGetBookInfo1() {
		List<BookBean> info = service.getBooksInfo();
		Assertions.assertNotNull(info);
	}

	@Test
	public void testShowUsersValid() {
		List<UserBean> info = service.showUsers();
		Assertions.assertNotNull(info);
	}

	@Test
	public void testShowUsersInvalid() {
		List<UserBean> info = service.showUsers();
		Assertions.assertNotNull(info);
	}

	@Test
	public void testShowRequestsValid() {
		List<RequestBean> info = service.showRequests();
		Assertions.assertNotNull(info);
	}


	@Test
	public void testShowRequests1() {
		List<RequestBean> info = service.showRequests();
		Assertions.assertNotNull(info);
	}

	@Test
	public void testBookIssueValid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = service.bookIssue(user, book);
		Assertions.assertTrue(check);

	}

	@Test
	public void testBookIssueInvalid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = service.bookIssue(user, book);
		Assertions.assertFalse(check);

	}

	@Test
	public void isBookReceivedValid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = service.isBookReceived(user, book);
		Assertions.assertTrue(check);

	}

	@Test
	public void isBookReceivedInvalid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		boolean check = service.isBookReceived(user, book);
		Assertions.assertFalse(check);

	}


}
