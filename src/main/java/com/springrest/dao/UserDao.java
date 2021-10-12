package com.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springrest.entities.User;



public interface UserDao extends JpaRepository<User, Long> {

	public List<User>findByName(String name);

	public List<User> findBySurname(String surname);
	
	public List<User>findByPincode(long pincode);
}
