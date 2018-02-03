package com.bobo.bookstore.service;

import com.bobo.bookstore.dao.*;
import com.bobo.bookstore.dao.impl.*;
import com.bobo.bookstore.domain.*;

 

public class AccountService {
	
	private AccountDAO accountDAO = new AccountDAOIml();
	
	public Account getAccount(int accountId){
		return accountDAO.get(accountId);
	}
	
}
