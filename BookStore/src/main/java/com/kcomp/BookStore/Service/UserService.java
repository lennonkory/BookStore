package com.kcomp.BookStore.Service;

import java.util.List;

import com.kcomp.BookStore.Entity.User;

public interface UserService {

	List<User> findAllUsers();

	User findById(int id);

	void save(User user);

}
