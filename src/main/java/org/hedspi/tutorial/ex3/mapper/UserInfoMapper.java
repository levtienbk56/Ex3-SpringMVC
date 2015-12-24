package org.hedspi.tutorial.ex3.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hedspi.tutorial.ex3.model.UserInfo;
import org.springframework.jdbc.core.RowMapper;

public class UserInfoMapper implements RowMapper<UserInfo>{

	@Override
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Integer id = rs.getInt("id");
		String firstname = rs.getString("firstname");
		String lastname = rs.getString("lastname");
		String address = rs.getString("address");
		String bio = rs.getString("bio");

		return new UserInfo(id, firstname, lastname, address, bio);
	}

}
