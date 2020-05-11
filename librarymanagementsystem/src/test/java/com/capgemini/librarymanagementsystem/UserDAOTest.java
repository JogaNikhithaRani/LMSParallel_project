package com.capgemini.librarymanagementsystem;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem.dao.UserDAO;
import com.capgemini.librarymanagementsystem.dao.UserDAOImplementation;
import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;

public class UserDAOTest {

	private UserDAO dao=new UserDAOImplementation();
	

	@Test
	public void testRegisterStudentValid() {
		UserBean info=new UserBean();
		info.setId(78965);
		info.setName("chikky");
		info.setEmail("jogachikky@gmail.com");
		info.setPassword("Arunaprasad@11");
		info.setDepartment("CSC");
		info.setPhone(987582645);
		boolean status=dao.registerUser(info);
		Assertions.assertTrue(status);
	}

	@Test
	public void testRegisterStudentInvalid() {
		UserBean info=new UserBean();
		info.setId(78965);
		info.setName("chikky");
		info.setEmail("jogachikky@gmail.com");
		info.setPassword("Arunaprasad@11");
		info.setDepartment("CSC");
		info.setPhone(987582645);
		boolean status=dao.registerUser(info);
		Assertions.assertFalse(status);
	}
	@Test
	public void testLoginUserValid() {
		UserBean status = dao.loginUser("jogachikky@gmail.com", "Arunaprasad@11");
		Assertions.assertNotNull(status);
	}

	@Test
	public void testLoginUserInvalid() {
		UserBean status = dao.loginUser("jogachikky@gmail.com", "Arunaprasad11");
		Assertions.assertNull(status);
	}

	@Test
	public void testRequestBookValid() {

		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		RequestBean info = dao.bookRequest(user, book);
		Assertions.assertNotNull(info);

	}

	@Test
	public void testRequestBookInvalid() {

		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		RequestBean info = dao.bookRequest(user, book);
		Assertions.assertNull(info);

	}

	@Test
	public void testBookReturnValid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		RequestBean info = dao.bookReturn(user, book);
		Assertions.assertNotNull(info);

	}

	@Test
	public void testBookReturnInvalid() {
		UserBean user = new UserBean();
		user.setId(222222);
		BookBean book = new BookBean();
		book.setId(100002);
		RequestBean info = dao.bookReturn(user, book);
		Assertions.assertNull(info);

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
}
