package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncodeString {
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
	public static String encodeString(String str){
		//int nameHash=userName.hashCode();
		String pwd="";
		try {
			//声明加密算法
			MessageDigest md= MessageDigest.getInstance("MD5");
			//返回加密以后字数组
			byte[] bs=md.digest(str.getBytes());
			for(byte b:bs){
				//to 16
				int res=b;
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
	
}
