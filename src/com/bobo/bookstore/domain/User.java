/**
 * 
 */
package com.bobo.bookstore.domain;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author zhangbo
 * 2018年1月28日  下午9:45:40
 * 用户实体
 */
import java.util.LinkedHashSet;
import java.util.Set;

public class User {

	//用户ID
	private Integer userId;
	//用户名称
	private String username;
	//账户ID
	private int accountId;
	 //交易集合
	private Set<Trade> trades = new LinkedHashSet<Trade>();

	public void setTrades(Set<Trade> trades) {
		this.trades = trades;
	}
	
	public Set<Trade> getTrades() {
		return trades;
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username
				+ ", accountId=" + accountId + "]";
	}

	//有参构造函数
	public User(Integer userId, String username, int accountId) {
		super();
		this.userId = userId;
		this.username = username;
		this.accountId = accountId;
	}

	//无参构造函数
	public User() {
		// TODO Auto-generated constructor stub
	}
}