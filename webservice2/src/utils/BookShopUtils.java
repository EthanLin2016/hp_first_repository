package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 
 * @author Administrator
 *
 */
public class BookShopUtils {
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-","");
	}
	public static String order(Object o){
		return ""+o.hashCode();
	}
	static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static String date(){
		return sdf.format(new Date());
	}
}
