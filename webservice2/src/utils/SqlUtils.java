package utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 专门用于获取资源文件
 * @author Administrator
 *
 */
public class SqlUtils {
	private static Properties prop;
	//写了监听器(package listener--MyContextListener)，传配置文件views.properties （没写监听器之前按照以下写）
	static{
		prop=new Properties();
		try {
			
			//jar包外写法
			String rootPath = System.getProperty("user.dir").replace("\\", "/");
			InputStream  in = new BufferedInputStream(new FileInputStream(rootPath+"/res/sql.properties"));
			
			prop.load(in);
		//jar包内写法	
//			prop.load(SqlUtils.class.getResourceAsStream("/res/sql.properties"));
//		    prop.load(SqlUtils.class.getClassLoader().getResourceAsStream("res/sql.properties"));
//			prop.load(SqlUtils.class.getClassLoader().getResourceAsStream("sql.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void setIn(InputStream in){
		prop=new Properties();
		try {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getSql(String key){
		String page=prop.getProperty(key);
		if (page==null){
			throw new RuntimeException("");
		}
		return page;
	}
}
