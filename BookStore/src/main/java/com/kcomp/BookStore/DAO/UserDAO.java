package com.kcomp.BookStore.DAO;

import java.util.List;

import com.kcomp.BookStore.Entity.User;


public interface UserDAO {

	 
    User findById(int id);
 
    void saveUser(User user);
     
     
    List<User> findAllUsers();
	
}
