package simulate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;

import model.Accout;

import user.service.UserService;
import utils.EncodeString;
import utils.HTTPUtils;
import utils.HTTPUtils2;
import utils.HTTPUtils3;


public class English61044  {
	
	 static String username;
	
     static String password;
     
     static String datelimited;
    static long start ;
    static long end ;
     private UserService service=new UserService();

    //主登录入口
    public static void loginDouban() throws JSONException, SQLException{
    	 //登录页
    	String login_src="http://xuexi.hgjt.cn/index/users/chklogin";
        //输入用户名
       
        //输入密码
        
        //输入密码
        System.out.println("请输入密码：");
        BufferedReader buffpassword=new BufferedReader(new InputStreamReader(System.in));
        try {
        	password=buffpassword.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取验证码图片
        getImgRadomID();

        String captcha_solution="";
      
        //输入验证码
        System.out.println("请输入验证码1：");
        BufferedReader buffimg=new BufferedReader(new InputStreamReader(System.in));
        try {
            captcha_solution=buffimg.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
     
      
        System.out.println("logining-----------waiting----------------");
//        //判断是否允许答题
//        UserService service=new UserService();
//        Accout account=new Accout();
//        account.setAccountid("123456");
//        account.setBanlance("0");
//		///后台根据判断生成的新User
//		Accout userback=service.login(account);
//	
//
//		if (userback==null){
//			 System.exit(0);
//		}
		///////////////////////
	        //post
        Map<String,String> paramMap =new HashMap<String,String>();
        paramMap.put("url", "http://xuexi.hgjt.cn/index/index/wslb");
        paramMap.put("username", "61044");
        paramMap.put("password", password);
        paramMap.put("vercode", captcha_solution);
        

        String result = HTTPUtils.posthtml(login_src, paramMap);
        JSONObject json =new  JSONObject(result);
        System.out.println(json.get("message"));
        // System.out.println(json.get("status"));
         Integer status= (Integer) json.get("status");
         if (status!=1){
         	loginDouban();
         }

    }
    private static void getImgRadomID(){
        //Json的地址[数据中包含验证码的地址]
    	double randomDouble=Math.random();
        String src="http://xuexi.hgjt.cn/vercode/vercode.php?a="+randomDouble;
        try {
            
            //下载验证码并存储到本地
            HTTPUtils.downImg(src);
         
            //System.out.println(content);
        } catch (ClientProtocolException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
          
            e.printStackTrace();
        }
        
    }
   
    
    //一个实例，只请求了一个url
    public static void main(String[] args) throws Exception {
    	   //开关控制
	    boolean flag =false;
	    flag = isPortUsing("10.46.15.16", 1433);  
	    if (flag==false){
	    	 System.exit(0);
	    }
	   
	     start = System.currentTimeMillis();//开始系统时间
	      end = start + (180*60)*1000; //  seconds * 1000 ms/sec
    	//模拟登陆
    	loginDouban();
    	//输入时间答题时间
    	//Double dm =dateLimted();
    	//dm=dm*60;//换算成分钟

 ///----------------------------------------------------------------英语
    	 int count=0;
    		String nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=310&matchid=0";//英语
    		nextRoundStr= HTTPUtils.gethtml(nextRoundStr);
    	                         
  		  //  JSONObject jsonab =new  JSONObject(an_srcString);
    		//nextRoundStr=EncodeString.encodeString(nextRoundStr);
  
    	 System.out.println(nextRoundStr);
    	 
     while( true ){
    	    ++count;

//    	   	 if(count%2==0){
//    	            //产生随机数
//    	            int m = (int)(Math.random()*20);
//    	            Thread.sleep(m*1000);
//    	        }
           Thread.sleep(2*1000);
    	   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
     	    System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
     	   System.out.println("mainserise："+ count +"-----");
     	    long currenttime =System.currentTimeMillis();

    	 if (currenttime>=end){
    		 //时间到自动跳转
    		 
    		 Date startTime = new Date(start);
    		 Date endTime = new Date(currenttime);
    		 SimpleDateFormat dfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
      	    System.out.println("start-------"+dfd.format(startTime));// new Date()为获取当前系统时间
      	    System.out.println("end-------"+dfd.format(endTime));// new Date()为获取当前系统时间
    		 break;
    	 }
    	
       //答题连接正确题连接计算机
         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=301&id=27359&answer=B";
         an_src = HTTPUtils.gethtml(an_src);
         an_src=EncodeString.encodeString(an_src);
         System.out.println(an_src);
   		 if (count==10*10){//次数控制，到10次提交一次，第一关
   			//提交连接                   
       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=310&matchid=0";
       		sub_src= HTTPUtils.gethtml(sub_src);
       		sub_src=EncodeString.encodeString(sub_src);
       	 System.out.println(sub_src);
       	 
   	  //选关必须
    		 nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=310&matchid=0";//计算机
    		nextRoundStr= HTTPUtils.gethtml(nextRoundStr);
    		nextRoundStr=EncodeString.encodeString(nextRoundStr);
    	 System.out.println(nextRoundStr);
                count = 0;
             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
                Random rand = new Random();
                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
                int randNumber = rand.nextInt(4 - 2 + 1) + 2;//产生10秒到5秒随机数字
                Thread.sleep(randNumber*1000);//m秒 
   		 }//次数控制
   		 
        
     }
///--------------------------------------------------------------------
    }
	
    
    public static double dateLimted (){
    	System.out.println("输入答题时间(小时)：只能输入1-9");
  	  BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        try {
      	  datelimited=buff.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        double num=0;
        java.text.DecimalFormat myformat=new java.text.DecimalFormat("#0.00");
       
       if(isNumeric(datelimited)) {
    	   num=Double.parseDouble(datelimited);//装换为double类型
           num=Double.parseDouble(myformat.format(num));//保留2为小数
       
   		if (num<0){
   			System.out.println("输入答题时间必须大于1");
   		}
       }
       else
    	   dateLimted();
       return num;
    }
    /**
     * 利用正则表达式判断字符串是否是数字
     * @param str
     * @return
     */
    private static boolean isNumeric(String str){
           Pattern pattern = Pattern.compile("^[0.0-9.0]+$");
           Matcher isNum = pattern.matcher(str);
           if( !isNum.matches() ){
               return false;
           }
           return true;
    }
    private static boolean isPortUsing(String host,int port) throws UnknownHostException{  
        boolean flag = false;  
        InetAddress Address = InetAddress.getByName(host); 
        try {  
            Socket socket = new Socket(Address,port);  //建立一个Socket连接
            flag = true;  
        } catch (IOException e) {  

        }  
        return flag;  
    }
	


}
