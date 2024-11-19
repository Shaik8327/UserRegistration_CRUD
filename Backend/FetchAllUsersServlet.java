package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDaoImplementation;
import com.entity.User;


public class FetchAll extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserDaoImplementation udao = new UserDaoImplementation(); 
		ArrayList<User> allUsers = (ArrayList<User>) udao.getAllUsers(); 
		req.getSession().setAttribute("users", allUsers); 
		  String contextPath = req.getContextPath(); // Gets the context path of the application 
		  resp.sendRedirect(contextPath + "/Frontend/displayCrud.jsp"); 
	}
}
