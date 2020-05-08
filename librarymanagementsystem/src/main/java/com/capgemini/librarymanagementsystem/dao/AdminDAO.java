package com.capgemini.librarymanagementsystem.dao;

import java.util.List;
import java.util.List;

import com.capgemini.librarymanagementsystem.dto.AdminBean;
import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;

public interface AdminDAO {
	boolean registerAdmin(AdminBean admin);
	AdminBean loginAdmin(String email,String password);
	boolean addBook(BookBean book);
	boolean removeBook(int id);
	List<BookBean> searchBookByTitle(String bookName);
	List<BookBean> searchBookByAuthor(String author);
	List<BookBean> searchBookByCategory(String category);
	List<BookBean> getBooksInfo();

	List<UserBean> showUsers();
	List<RequestBean> showRequests();
	boolean bookIssue(UserBean user,BookBean book);
	boolean isBookReceived(UserBean user,BookBean book);
}
