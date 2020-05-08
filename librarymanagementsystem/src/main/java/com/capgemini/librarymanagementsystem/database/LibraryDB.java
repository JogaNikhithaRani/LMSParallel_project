package com.capgemini.librarymanagementsystem.database;

import java.util.LinkedList;

import com.capgemini.librarymanagementsystem.dto.AdminBean;
import com.capgemini.librarymanagementsystem.dto.BookBean;
import com.capgemini.librarymanagementsystem.dto.RequestBean;
import com.capgemini.librarymanagementsystem.dto.UserBean;

public class LibraryDB {
	public static final LinkedList<BookBean> BOOKS = new LinkedList<BookBean>(); 
	public static final LinkedList<AdminBean> ADMIN = new LinkedList<AdminBean>();
	public static final LinkedList<UserBean> USER = new LinkedList<UserBean>();
	public static final LinkedList<RequestBean> REQUEST = new LinkedList<RequestBean>();

	public static void addToDB() {

		ADMIN.add(new AdminBean(111111,"Amulya","Ammu@123","ammu@gmail.com",785963147));

		//USER.add(new User(111111,"ramya","ramya@gmail.com","Ramya@123","cse",7788997788,07/08/2020,02/02/2020);
		
		BOOKS.add(new BookBean(101010,"java","james","gosling","coding"));
		BOOKS.add(new BookBean(101011,"history","tom","henry feild","world"));
		BOOKS.add(new BookBean(101012,"angular","misko","adam","js"));
		BOOKS.add(new BookBean(101013,"computers","charles","aborns","programing"));

	}


}


