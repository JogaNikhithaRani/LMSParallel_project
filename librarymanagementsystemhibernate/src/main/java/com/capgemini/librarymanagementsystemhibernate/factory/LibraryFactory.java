package com.capgemini.librarymanagementsystemhibernate.factory;

import com.capgemini.librarymanagementsystemhibernate.dao.AdminDAO;
import com.capgemini.librarymanagementsystemhibernate.dao.AdminDAOImplementation;
import com.capgemini.librarymanagementsystemhibernate.dao.StudentDAO;
import com.capgemini.librarymanagementsystemhibernate.dao.StudentDAOImplementation;
import com.capgemini.librarymanagementsystemhibernate.dao.UsersDAO;
import com.capgemini.librarymanagementsystemhibernate.dao.UsersDAOImplementation;
import com.capgemini.librarymanagementsystemhibernate.service.AdminService;
import com.capgemini.librarymanagementsystemhibernate.service.AdminServiceImplementation;
import com.capgemini.librarymanagementsystemhibernate.service.StudentService;
import com.capgemini.librarymanagementsystemhibernate.service.StudentServiceImplementation;
import com.capgemini.librarymanagementsystemhibernate.service.UsersService;
import com.capgemini.librarymanagementsystemhibernate.service.UsersServiceImplementation;

public class LibraryFactory {
	public static UsersDAO getUsersDao() {
		return new UsersDAOImplementation();
	}
	public static UsersService getUsersService() {
		return new UsersServiceImplementation();
	}
	
	public static AdminDAO getAdminDao() {
		return new AdminDAOImplementation();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplementation();
	}
	
	public static StudentDAO getStudentDao() {
		return new StudentDAOImplementation();
	}
	public static StudentService getStudentService() {
		return new StudentServiceImplementation();
	}
}
