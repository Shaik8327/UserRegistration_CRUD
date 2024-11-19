package com.Dao;

import java.util.List;

import com.entity.User;

public interface UserDao {
	int insertUser(User user); 
	List<User> getAllUsers(); 
	User getUserById(int id); 
	int updateUserById(int id,String address,long mobile, String password); 
	int deleteUserById(int id); 
}
