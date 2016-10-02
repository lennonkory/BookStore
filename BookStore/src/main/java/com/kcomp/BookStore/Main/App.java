package com.kcomp.BookStore.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kcomp.BookStore.Configuration.HibernateConfig;
import com.kcomp.BookStore.Entity.User;
import com.kcomp.BookStore.Service.UserService;

public class App{
	
    public static void main( String[] args ){
    	ApplicationContext context = 
                new AnnotationConfigApplicationContext(HibernateConfig.class);

    	UserService userService = context.getBean(UserService.class);
    	
    	User user = new User();
    	
    	user.setFirstName("Bob");
    	user.setLastName("Smith");
    	
    	userService.save(user);
    	
    	/*
    	List<User> users = userService.findAllUsers();
    	
    	for(User user : users){
    		System.out.println(user.toString());
    	}
    	
    	User user = userService.findById(3);
    	
    	System.out.println(user.toString());
    	*/
    }
}
