package com.bobo.bookstore.dao.impl;

import com.bobo.bookstore.dao.*;
import com.bobo.bookstore.domain.*;
 

public class UserDAOImpl extends BaseDAO<User> implements UserDAO {

	@Override
	public User getUser(String username) {
		String sql = "SELECT userId, username, accountId " +
				"FROM userinfo WHERE username = ?";
		return query(sql, username); 
	}

}
