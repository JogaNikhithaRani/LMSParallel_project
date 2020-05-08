package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;

public interface UserService {
	boolean registerUser(UserBean user);
	UserBean loginUser(String email,String password);
	public RequestBean bookRequest(UserBean user, BookBean book);
	public RequestBean bookReturn(UserBean student, BookBean book);
	List<BookBean> searchBookByTitle(String bookName);
	List<BookBean> searchBookByAuthor(String author);
	List<BookBean> searchBookByCategory(String category);
	List<BookBean> getBooksInfo();
	
}
