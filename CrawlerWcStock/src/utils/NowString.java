package utils;

import java.util.Date;
import java.text.SimpleDateFormat;
public class NowString {
public static void main(String[] args) { 
SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
}
}