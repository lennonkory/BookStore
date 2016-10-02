package com.kcomp.BookStore.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.kcomp.BookStore.Entity.User;


@Repository("userDAO")
public class UserDAOImpl extends AbstractDAO<Integer, User> implements UserDAO{

	@Override
	public User findById(int id) {
		 return getByKey(id);
	}

	@Override
	public void saveUser(User user) {
		  persist(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
	}

}
