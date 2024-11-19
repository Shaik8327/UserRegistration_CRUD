package com.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class UserDaoImplementation implements UserDao {

	private Session session; 
	private ArrayList<User> usersList; 
	//Constructor 
	public UserDaoImplementation() { 
		session = new 
		Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory().openSession(); 
	} 
	@Override 
	public int insertUser(User user) { 
		session.beginTransaction(); 
		session.persist(user); 
		session.getTransaction().commit(); 
		return 0; 
	} 
	@Override 
	public List<User> getAllUsers() { 
		usersList = (ArrayList<User>) session.createQuery("from User",User.class).list(); 
		return usersList; 
	} 
	@Override 
	public User getUserById(int id) { 
		session.beginTransaction(); 
		User user = session.get(User.class, id); 
		return user; 
	} 
	@Override 
	public int updateUserById(int id, String address, long mobile, String password) { 
		User user = session.get(User.class, id); 
		if(user!=null) { 
		   session.beginTransaction(); 
		   user.setAddress(address); 
		   user.setMobile(mobile); 
		   user.setPassword(password); 
		   session.getTransaction().commit(); 
		   return 1; 
		}  
		return 0; 
	 } 
	 @Override 
	 public int deleteUserById(int id) { 
		 User user = session.get(User.class, id); 
		 if(user!=null) { 
		   session.beginTransaction(); 
		   session.delete(user); 
		   session.getTransaction().commit(); 
		   return 1; 
		 } 
		 return 0; 
	 } 

}
