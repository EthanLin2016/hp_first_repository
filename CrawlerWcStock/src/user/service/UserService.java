package user.service;

import java.sql.SQLException;

import user.dao.UserDao;
import model.Accout;

public class UserService {
	private UserDao dao=new UserDao();
	
	/**
	 * 在对密码进行计算
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public Accout login(Accout user) throws SQLException {
		
		return dao.login(user);
	}
  
}
