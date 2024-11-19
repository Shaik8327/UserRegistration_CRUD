package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDaoImplementation;


public class DeleteUser extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id")); 
		int status = new UserDaoImplementation().deleteUserById(id); 
		if(status==1) { 
			resp.sendRedirect("FetchAll"); 
		} 
	}

}
