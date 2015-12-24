package org.hedspi.tutorial.ex3.dao;

import java.util.List;
import java.util.Map;

import org.hedspi.tutorial.ex3.model.Account;

public interface AccountDAO {
	public void insertAccount(String email, String password);
	public List<Account> listAccount();
	public List<Map<String, Object>> getAccount(String email, String password);
}
