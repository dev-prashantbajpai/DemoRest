package com.springrest.services;

import java.util.List;

import com.springrest.entities.User;

public interface UserService {

	public List<User> getUsers();
	
	public User getUser(long userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(long parseLong);
	
	public List<User> getUserByName(String name);
	
	public List<User> getUserBySurname(String surname);
	
	public List<User> getUserByPincode(long pincode);

	
}
