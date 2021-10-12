package com.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.UserDao;
import com.springrest.entities.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUser(long userId) {
		return userDao.getOne(userId);
	}

	@Override
	public User addUser(User user) {
		return this.userDao.save(user);

	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(long parseLong) {
		@SuppressWarnings("deprecation")
		User entity = userDao.getOne(parseLong);
		userDao.delete(entity);
	}

	@Override
	public List<User> getUserByName(String name) {
		return userDao.findByName(name);
	}

	@Override
	public List<User> getUserBySurname(String surname) {
		return userDao.findBySurname(surname);
	}

	@Override
	public List<User> getUserByPincode(long pincode) {
		return userDao.findByPincode(pincode);
	}



}
