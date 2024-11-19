package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDaoImplementation;


public class EditUserData extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			int id = Integer.parseInt(req.getParameter("user_id")); 
			long mobile = Long.parseLong(req.getParameter("mobile")); 
			String address = req.getParameter("address"); 
			String password = req.getParameter("password"); 
			int status = new UserDaoImplementation().updateUserById(id, address, mobile, password); 
			  if(status==1) { 
				  	resp.sendRedirect("FetchAll"); 
			  }
		
	}
}
