package utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;



import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {
	//生命线程�?��的容�?
	private static ThreadLocal<Connection> tl;
	private static DataSource ds;
	static{
		//默认读取c3p0-config.xml默认配置
		ds=new ComboPooledDataSource("myoracle");
		tl=new ThreadLocal<Connection>();
	}
	public static DataSource getDataSource(){
		return ds;
	}
	public static Connection getConn(){
		//先从T1这个容器中获取一次数据，如果当前线程已经保存过connection则直接返回这个connection
		Connection con=tl.get();
		if (con==null)
		{
			try {
				con=ds.getConnection();
				
				tl.set(con);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return con;
	
	}
	public static void remove() {
		
		tl.remove();
	}
	
}
