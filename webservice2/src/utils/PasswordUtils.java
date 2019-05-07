package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;
/**
 * 只对密码加密
 * @author Administrator
 *
 */
public class PasswordUtils {
	public static String encodePassword(String userName,String password){
		int nameHash=userName.hashCode();
		String pwd="";
		try {
			//声明加密算法
			MessageDigest md= MessageDigest.getInstance("MD5");
			//返回加密以后字数组
			byte[] bs=md.digest(password.getBytes());
			for(byte b:bs){
				//to 16
				int res=b+nameHash;
				int a=res & 0xff;
				if(a<16){
					a=a+16;
				}
				String hex=Integer.toHexString(a);
				pwd=pwd+hex;
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pwd;
	}
	@Test
	public void encode() throws NoSuchAlgorithmException{
		String pwd="1234";
		//声明加密算法
		MessageDigest md= MessageDigest.getInstance("MD5");
		//返回加密以后字数组
		byte[] bs=md.digest(pwd.getBytes());
		String password="";
		for(byte b:bs){
			//to 16
			
			int a=b & 0xff;
			if(a<16){
				a=a+16;
			}
			String hex=Integer.toHexString(a);
			password=password+hex;
		}
		System.out.println(password);
	}
	/**
	 * 由于所有用户名不同,用用户名的hash值,与密码的hash值进行加运算,对结果取值
	 * @throws NoSuchAlgorithmException
	 */
	@Test
	public void encode2() throws NoSuchAlgorithmException{
		String name="ad";
		int nameHash=name.hashCode();
		String pwd="1234";
		//声明加密算法
		MessageDigest md= MessageDigest.getInstance("MD5");
		//返回加密以后字数组
		byte[] bs=md.digest(pwd.getBytes());
		String password="";
		for(byte b:bs){
			//to 16
			int res=b+nameHash;
			int a=res & 0xff;
			if(a<16){
				a=a+16;
			}
			String hex=Integer.toHexString(a);
			password=password+hex;
		}
		System.out.println(password);
	}
}
