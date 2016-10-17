package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.UserModel;
import util.DbUtil;

public class UserDao {
	private Connection connection;

	public UserDao() {
		connection = DbUtil.getConnection();
	}

	public void addUser(UserModel user) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into user(first_name, last_name) values (?,?)");

			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
