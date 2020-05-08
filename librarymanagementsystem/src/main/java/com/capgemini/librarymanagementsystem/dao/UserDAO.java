package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;

public interface UserDAO {
	boolean registerUser(UserBean user);
	UserBean loginUser(String email,String password);
	public RequestBean bookRequest(UserBean user, BookBean book);
	public RequestBean bookReturn(UserBean user, BookBean book);
	List<BookBean> searchBookByTitle(String bookName);
	List<BookBean> searchBookByAuthor(String author);
	List<BookBean> searchBookByCategory(String category);
	List<BookBean> getBooksInfo();
	
}
