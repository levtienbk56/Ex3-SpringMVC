package org.hedspi.tutorial.ex3.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.hedspi.tutorial.ex3.mapper.AccountMapper;
import org.hedspi.tutorial.ex3.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {
	
	@Autowired
	public AccountDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	@Override
	public void insertAccount(String email, String password) {
		String sql = "Insert into account (email,password) "
                + " values (?,?) ";
        Object[] params = new Object[] { email, password};
        this.getJdbcTemplate().update(sql, params);
	}

	@Override
	public List<Account> listAccount() {
		String sql = "Select a.email, a.password from account a";
 
        Object[] params = new Object[] {};
        AccountMapper mapper = new AccountMapper();
 
        List<Account > list = this.getJdbcTemplate().query(sql, params,
                mapper);
        return list;
	}
	
	
	public List<Map<String, Object>> getAccount(String email, String password){
		String sql = "Select a.email, a.password from Account a where a.email = ? and a.password = ?";
 
        Object[] params = new Object[] { email, password };
        
        List<Map<String, Object>> accs = this.getJdbcTemplate().queryForList(sql, params);
        return accs;
	}
	
}
