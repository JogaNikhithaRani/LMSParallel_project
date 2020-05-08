package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.dao.UserDAO;
import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;
import com.capgemini.librarymanagementsystem.factory.LibraryFactory;

public class UserServiceImplementation implements UserService{
	private UserDAO dao = LibraryFactory.getUserDao();

	@Override
	public boolean registerUser(UserBean user) {
		return dao.registerUser(user);
	}

	@Override
	public UserBean loginUser(String email, String password) {
		return dao.loginUser(email, password);
	}

	@Override
	public RequestBean bookRequest(UserBean user, BookBean book) {
		return dao.bookRequest(user, book);
	}

	@Override
	public RequestBean bookReturn(UserBean user, BookBean book) {
		return dao.bookReturn(user, book);
	}

	@Override
	public List<BookBean> searchBookByTitle(String bookName) {
		return dao.searchBookByTitle(bookName);
	}

	@Override
	public List<BookBean> searchBookByAuthor(String author) {
		return dao.searchBookByAuthor(author);
	}

	@Override
	public List<BookBean> searchBookByCategory(String category) {
		return dao.searchBookByCategory(category);
	}

	@Override
	public List<BookBean> getBooksInfo() {
		return dao.getBooksInfo();
	}	
}
