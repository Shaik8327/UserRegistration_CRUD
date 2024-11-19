package com.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDaoImplementation;
import com.entity.User;


public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("username"); 
		String email = req.getParameter("email"); 
		String password = req.getParameter("password"); 
		String dobString = req.getParameter("dob"); 
		Long mobile = Long.parseLong(req.getParameter("phone")); 
		String address = req.getParameter("address");
		
		 // Convert the string to a LocalDate (op onal) 
        LocalDate dob = LocalDate.parse(dobString, DateTimeFormatter.ofPattern("yyyy-MM-dd")); 
        java.sql.Date sqlDate = java.sql.Date.valueOf(dob); 
        User user = new User(name,email,password,sqlDate,mobile,address); 
        int status = new UserDaoImplementation().insertUser(user); 
        if(status==0) { 
         resp.sendRedirect("FetchAll"); 
        } 
	}

}
