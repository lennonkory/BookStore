package com.kcomp.BookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcomp.BookStore.DAO.UserDAO;
import com.kcomp.BookStore.Entity.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	 @Autowired
	 private UserDAO DAO;
	
	@Override
	public List<User> findAllUsers() {
		return DAO.findAllUsers();
	}

	@Override
	public User findById(int id) {
		return DAO.findById(id);
	}

	@Override
	public void save(User user) {
		DAO.saveUser(user);
	}

	
	
}
