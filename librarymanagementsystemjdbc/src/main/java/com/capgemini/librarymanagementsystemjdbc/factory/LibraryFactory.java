package com.capgemini.librarymanagementsystemjdbc.factory;

import com.capgemini.librarymanagementsystemjdbc.dao.AdminDAO;
import com.capgemini.librarymanagementsystemjdbc.dao.AdminDAOImplementation;
import com.capgemini.librarymanagementsystemjdbc.dao.StudentDAO;
import com.capgemini.librarymanagementsystemjdbc.dao.StudentDAOImplementation;
import com.capgemini.librarymanagementsystemjdbc.dao.UsersDAO;
import com.capgemini.librarymanagementsystemjdbc.dao.UsersDAOImplementation;
import com.capgemini.librarymanagementsystemjdbc.service.AdminService;
import com.capgemini.librarymanagementsystemjdbc.service.AdminServiceImplement;
import com.capgemini.librarymanagementsystemjdbc.service.StudentService;
import com.capgemini.librarymanagementsystemjdbc.service.StudentServiceImplement;
import com.capgemini.librarymanagementsystemjdbc.service.UsersService;
import com.capgemini.librarymanagementsystemjdbc.service.UsersServiceImplement;

public class LibraryFactory {
	public static UsersDAO getUsersDao() {
		return new UsersDAOImplementation();
	}
	public static UsersService getUsersService() {
		return new UsersServiceImplement();
	}
	
	public static AdminDAO getAdminDao() {
		return new AdminDAOImplementation();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplement();
	}
	
	public static StudentDAO getStudentDao() {
		return new StudentDAOImplementation();
	}
	public static StudentService getStudentService() {
		return new StudentServiceImplement();
	}
}
