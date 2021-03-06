package com.capgemini.librarymanagementsystem.dao;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.librarymanagementsystem.database.LibraryDB;
import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;
import com.capgemini.librarymanagementsystem.exception.LMSException;

public class UserDAOImplementation implements UserDAO{

	@Override
	public boolean registerUser(UserBean user) {
		for(UserBean u : LibraryDB.USER) {
			if(u.getEmail().equals(user.getEmail())) {
				return false;
			}
		}
		LibraryDB.USER.add(user);
		return true;
	}

	@Override
	public UserBean loginUser(String email, String password){
		for(UserBean user : LibraryDB.USER) {
			if(user.getEmail().equals(email) ) {
				if(user.getPassword().equals(password)) {
					return user;
				}else {
					throw new LMSException("Password is invalid");
				}

			}else {
				throw new LMSException("Email doesn't Exist");
			}
		}
		throw new LMSException("Invalid credentials");
	}


	@Override
	public List<BookBean> searchBookByTitle(String bookName) {
		List<BookBean> searchList=new LinkedList<BookBean>();
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookBean retrievedBook=LibraryDB.BOOKS.get(i);
			String retrievedBookName=retrievedBook.getBookName();
			if(bookName.equals(retrievedBookName))
			{
				searchList.add(retrievedBook);	
				return searchList;
			}
		}
		if(searchList.size()==0)
		{
			throw new LMSException ("Book is not found");
		}
		else
		{
			return searchList;
		}

	}

	@Override
	public List<BookBean> searchBookByAuthor(String author) {
		List<BookBean> searchList=new LinkedList<BookBean>();
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookBean retrievedBook=LibraryDB.BOOKS.get(i);
			String retrievedBookAuthor=retrievedBook.getAuthor();
			if(author.equals(retrievedBookAuthor))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new LMSException ("Book is not found");
		}
		else
		{
			return searchList;
		}	
	}

	@Override
	public List<BookBean> searchBookByCategory(String category) {
		List<BookBean> searchList=new LinkedList<BookBean>();
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookBean retrievedBook=LibraryDB.BOOKS.get(i);
			String retrievedCategory=retrievedBook.getCategory();
			if(category.equals(retrievedCategory))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new LMSException("Book not found");
		}
		else
		{
			return searchList;
		}	

	}

	@Override
	public List<BookBean> getBooksInfo() {
		return LibraryDB.BOOKS;
	}

	@Override
	public RequestBean bookRequest(UserBean user, BookBean book) {
		boolean flag = false; 
		boolean	isRequestExists = false;
		RequestBean requestInfo = new RequestBean();
		UserBean userInfo2 = new UserBean();
		BookBean bookInfo2 = new BookBean();

		for (RequestBean requestInfo2 : LibraryDB.REQUEST) {
			if (book.getId() == requestInfo2.getBookInfo().getId()) {
				isRequestExists = true;

			}
		}

		if (!isRequestExists) {
			for (UserBean userBean : LibraryDB.USER) {
				if (user.getId() == userBean.getId()) {
					for (BookBean book1 : LibraryDB.BOOKS) {
						if (book1.getId() == book1.getId()) {
							userInfo2 = userBean;
							bookInfo2 = book1;
							flag = true;
						}
					}
				}
			}
			if (flag == true) {
				requestInfo.setBookInfo(bookInfo2);
				requestInfo.setUserInfo(userInfo2);;
				LibraryDB.REQUEST.add(requestInfo);
				return requestInfo;
			}

		}

		throw new LMSException("Invalid request or you cannot request that book");

	}

	@Override
	public RequestBean bookReturn(UserBean user, BookBean book) {
		for (RequestBean requestInfo : LibraryDB.REQUEST) {

			if (requestInfo.getBookInfo().getId() == book.getId() &&
					requestInfo.getUserInfo().getId() == user.getId() &&
					requestInfo.isIssued() == true) {


				System.out.println("Returning Issued book only");
				requestInfo.setReturned(true);


				return requestInfo;
			}

		}

		throw new  LMSException("Invalid return ");
	}

}

