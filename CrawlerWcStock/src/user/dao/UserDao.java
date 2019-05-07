package user.dao;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import model.Accout;
import  utils.DataSourceUtils;
public class UserDao {
	

	public Accout login(Accout accout) throws SQLException {
		Connection con=DataSourceUtils.getConn();
		String sql="select * from ACCOUNT where ACCOUNTID=? and BALANCE=?";
		QueryRunner run=new QueryRunner(true);
		//QueryRunner run = new QueryRunner(getDataSource(), true);
		//QueryRunner run=new QueryRunner(DataSourceUtils.getDataSource(),true);
		Accout userback=	run.query(con,sql,new BeanHandler<Accout>(Accout.class),accout.getAccountid(),accout.getBanlance());
		return userback;
	}
}
