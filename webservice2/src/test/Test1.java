package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.junit.Test;




import utils.DataSourceUtilsSqlServer;




public class Test1 {
	@Test
	public void testserver() throws SQLException{
		String sql="";
		QueryRunner run = new QueryRunner(DataSourceUtilsSqlServer.getDataSource());
		sql = "select  top 10 * from  carmetageweight ";

		Map<String,Object> map = run.query(sql, new MapHandler());
		for (Map.Entry<String, Object> entry : map.entrySet()) {
		      System.out.println(entry.getKey() + ":" + entry.getValue());
		    }
	}
}
