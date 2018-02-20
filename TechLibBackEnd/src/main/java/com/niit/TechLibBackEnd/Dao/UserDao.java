package com.niit.TechLibBackEnd.Dao;

import java.util.List;

import com.niit.TechLibBackEnd.Model.User;

public interface UserDao {

	public boolean insertUser(User user);
	
	List<User> list();
	
	User get(int id);
 	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	
	
}
