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
import utils.HTTPUtils4;
import utils.HTTPUtils5;


public class SimulateLoginComputer  implements Runnable{
	
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
        System.out.println("请输入用户名：");
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        try {
       	 username=buff.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       
		
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
        String captcha_solution2="";
        String captcha_solution3="";
        String captcha_solution4="";
        String captcha_solution5="";
        //输入验证码
        System.out.println("请输入验证码1：");
        BufferedReader buffimg=new BufferedReader(new InputStreamReader(System.in));
        try {
            captcha_solution=buffimg.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("请输入验证码2：");
        BufferedReader buffimg2=new BufferedReader(new InputStreamReader(System.in));
        try {
            captcha_solution2=buffimg2.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        System.out.println("请输入验证码3：");
        BufferedReader buffimg3=new BufferedReader(new InputStreamReader(System.in));
        try {
            captcha_solution3=buffimg3.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("请输入验证码4：");
        BufferedReader buffimg4=new BufferedReader(new InputStreamReader(System.in));
        try {
            captcha_solution4=buffimg4.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("请输入验证码5：");
        BufferedReader buffimg5=new BufferedReader(new InputStreamReader(System.in));
        try {
            captcha_solution5=buffimg5.readLine();
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
        paramMap.put("username", username);
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
        
        
        Map<String,String> paramMap2 =new HashMap<String,String>();
        paramMap2.put("url", "http://xuexi.hgjt.cn/index/index/wslb");
        paramMap2.put("username", username);
        paramMap2.put("password", password);
        paramMap2.put("vercode", captcha_solution2);
        String result2 = HTTPUtils2.posthtml(login_src, paramMap2);
        JSONObject json2 =new  JSONObject(result2);
        
        System.out.println(json2.get("message"));
       // System.out.println(json.get("status"));
        Integer status2= (Integer) json2.get("status");
        if (status2!=1){
        	loginDouban();
        }
        
        Map<String,String> paramMap3 =new HashMap<String,String>();
        paramMap3.put("url", "http://xuexi.hgjt.cn/index/index/wslb");
        paramMap3.put("username", username);
        paramMap3.put("password", password);
        paramMap3.put("vercode", captcha_solution3);
        String result3 = HTTPUtils3.posthtml(login_src, paramMap3);
        JSONObject json3=new  JSONObject(result3);
        
        System.out.println(json3.get("message"));
       // System.out.println(json.get("status"));
        Integer status3= (Integer) json3.get("status");
        if (status3!=1){
        	loginDouban();
        }
        
        Map<String,String> paramMap4 =new HashMap<String,String>();
        paramMap4.put("url", "http://xuexi.hgjt.cn/index/index/wslb");
        paramMap4.put("username", username);
        paramMap4.put("password", password);
        paramMap4.put("vercode", captcha_solution4);
        String result4 = HTTPUtils4.posthtml(login_src, paramMap4);
        JSONObject json4=new  JSONObject(result4);
        
        System.out.println(json4.get("message"));
        Integer status4= (Integer) json4.get("status");
        if (status4!=1){
        	loginDouban();
        }
       
        
        Map<String,String> paramMap5 =new HashMap<String,String>();
        paramMap5.put("url", "http://xuexi.hgjt.cn/index/index/wslb");
        paramMap5.put("username", username);
        paramMap5.put("password", password);
        paramMap5.put("vercode", captcha_solution5);
        String result5 = HTTPUtils5.posthtml(login_src, paramMap5);
        JSONObject json5=new  JSONObject(result5);
        
        System.out.println(json5.get("message"));
       
        // System.out.println(json.get("status"));
        Integer status5= (Integer) json5.get("status");
        if (status5!=1){
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
            HTTPUtils2.downImg(src);
            HTTPUtils3.downImg(src);
            HTTPUtils4.downImg(src);
            HTTPUtils5.downImg(src);
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
	    final int m=3400;//3.4*1000
	    flag = isPortUsing("10.46.15.16", 1433);  
	    if (flag==false){
	    	 System.exit(0);
	    }
	   
	     start = System.currentTimeMillis();//开始系统时间
	      end = start + (120*60)*1000; //  seconds * 1000 ms/sec
    	//模拟登陆
    	loginDouban();
    	//输入时间答题时间
    	//Double dm =dateLimted();
    	//dm=dm*60;//换算成分钟
    	
    	
    	//选关必须多线程----------------------------------------------英语
    	//SimulateLoginComputer rtt = new SimulateLoginComputer();
    	//new Thread(rtt).start();
    	
    	//----------------------------------------------计算机
    	
    	new Thread(){
    		public void run() {
    			///----------------------------------------------------------------计算机
    	    	 int count=0;
    	    		String nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils3.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	     while( true ){
    	    	    ++count;

//    	    	   	 if(count%2==0){
//    	    	            //产生随机数
//    	    	            int m = (int)(Math.random()*20);
//    	    	            Thread.sleep(m*1000);
//    	    	        }
    	           try {
					Thread.sleep(m);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    	   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    	     	   
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
    	         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
    	         an_src = HTTPUtils3.gethtml(an_src);
    	         System.out.println(df.format(new Date())+"    childone:"+ count +"-----"+an_src);
    	   		 
    	   		 if (count==10*10){//次数控制，到10次提交一次，第一关
    	   			//提交连接                   
    	       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=370&matchid=0";
    	       		sub_src= HTTPUtils3.gethtml(sub_src);
    	       	 System.out.println(sub_src);
    	       	 
    	   	  //选关必须
    	    		 nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils3.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	                count = 0;
    	             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
    	                Random rand = new Random();
    	                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
    	                int randNumber = rand.nextInt(4 - 1+ 1) + 1;//产生10秒到5秒随机数字
    	                try {
							Thread.sleep(randNumber*1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//m秒 
    	   		 }//次数控制
    	   		 
    	        
    	     }
    	///--------------------------------------------------------------------
    		}
    	}.start();
    //----------------------------------------------------------------	
    	
    	
    	new Thread(){
    		public void run() {
    			///----------------------------------------------------------------计算机
    	    	 int count=0;
    	    		String nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils2.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	     while( true ){
    	    	    ++count;

//    	    	   	 if(count%2==0){
//    	    	            //产生随机数
//    	    	            int m = (int)(Math.random()*20);
//    	    	            Thread.sleep(m);
//    	    	        }
    	           try {
					Thread.sleep(m);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    	   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    	     	 
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
    	         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
    	         an_src = HTTPUtils2.gethtml(an_src);
    	         System.out.println(df.format(new Date())+"    childtwo:"+ count +"-----"+an_src);
    	   		 if (count==10*10){//次数控制，到10次提交一次，第一关
    	   			//提交连接                   
    	       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=370&matchid=0";
    	       		sub_src= HTTPUtils2.gethtml(sub_src);
    	       	 System.out.println(sub_src);
    	       	 
    	   	  //选关必须
    	    		 nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils2.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	                count = 0;
    	             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
    	                Random rand = new Random();
    	                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
    	                int randNumber = rand.nextInt(10 - 5 + 1) + 5;//产生10秒到5秒随机数字
    	                try {
							Thread.sleep(randNumber*1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//m秒 
    	   		 }//次数控制
    	   		 
    	        
    	     }
    	///--------------------------------------------------------------------
    		}
    	}.start();
    //----------------------------------------------------------------	
    	
    //----------线程4
    	//---计算机
    	new Thread(){
    		public void run() {
    			///----------------------------------------------------------------计算机
    	    	 int count=0;
    	    		String nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils4.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	     while( true ){
    	    	    ++count;

//    	    	   	 if(count%2==0){
//    	    	            //产生随机数
//    	    	            int m = (int)(Math.random()*20);
//    	    	            Thread.sleep(m);
//    	    	        }
    	           try {
					Thread.sleep(m);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    	   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    	     	   
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
    	         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
    	         an_src = HTTPUtils4.gethtml(an_src);
    	         System.out.println(df.format(new Date())+"    childthree:"+ count +"-----"+an_src);
    	   		 
    	   		 if (count==10*10){//次数控制，到10次提交一次，第一关
    	   			//提交连接                   
    	       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=370&matchid=0";
    	       		sub_src= HTTPUtils4.gethtml(sub_src);
    	       	 System.out.println(sub_src);
    	       	 
    	   	  //选关必须
    	    		 nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils4.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	                count = 0;
    	             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
    	                Random rand = new Random();
    	                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
    	                int randNumber = rand.nextInt(4 - 1+ 1) + 1;//产生10秒到5秒随机数字
    	                try {
							Thread.sleep(randNumber*1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//m秒 
    	   		 }//次数控制
    	   		 
    	        
    	     }
    	///--------------------------------------------------------------------
    		}
    	}.start();
    //----------------------------------------------------------------	
    	
    
 //----------线程5
    	//--计算机
    	new Thread(){
    		public void run() {
    			///----------------------------------------------------------------计算机
    	    	 int count=0;
    	    		String nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils5.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	     while( true ){
    	    	    ++count;

//    	    	   	 if(count%2==0){
//    	    	            //产生随机数
//    	    	            int m = (int)(Math.random()*20);
//    	    	            Thread.sleep(m);
//    	    	        }
    	           try {
					Thread.sleep(m);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    	   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    	     	   
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
    	         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
    	         an_src = HTTPUtils5.gethtml(an_src);
    	         System.out.println(df.format(new Date())+"    chilfour:"+ count +"-----"+an_src);
    	   		 
    	   		 if (count==10*10){//次数控制，到10次提交一次，第一关
    	   			//提交连接                   
    	       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=370&matchid=0";
    	       		sub_src= HTTPUtils5.gethtml(sub_src);
    	       	 System.out.println(sub_src);
    	       	 
    	   	  //选关必须
    	    		 nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    	    		nextRoundStr= HTTPUtils5.gethtml(nextRoundStr);
    	    	 System.out.println(nextRoundStr);
    	                count = 0;
    	             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
    	                Random rand = new Random();
    	                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
    	                int randNumber = rand.nextInt(4 - 1+ 1) + 1;//产生10秒到5秒随机数字
    	                try {
							Thread.sleep(randNumber*1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//m秒 
    	   		 }//次数控制
    	   		 
    	        
    	     }
    	///--------------------------------------------------------------------
    		}
    	}.start();
    //----------------------------------------------------------------	
    	
    
 ///----------------------------------------------------------------计算机
    	 int count=0;
    		String nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    		nextRoundStr= HTTPUtils.gethtml(nextRoundStr);
    	 System.out.println(nextRoundStr);
    	 while( true ){
    	    ++count;

//    	   	 if(count%2==0){
//    	            //产生随机数
//    	            int m = (int)(Math.random()*20);
//    	            Thread.sleep(m);
//    	        }
           Thread.sleep(m);
    	   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
     	  
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
         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
         an_src = HTTPUtils.gethtml(an_src);
         System.out.println(df.format(new Date())+"    main"+ count +"-----"+an_src);	 
   		 if (count==10*10){//次数控制，到10次提交一次，第一关
   			//提交连接                   
       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=370&matchid=0";
       		sub_src= HTTPUtils.gethtml(sub_src);
       	 System.out.println(sub_src);
       	 
   	  //选关必须
    		 nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=370&matchid=0";//计算机
    		nextRoundStr= HTTPUtils.gethtml(nextRoundStr);
    	 System.out.println(nextRoundStr);
                count = 0;
             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
                Random rand = new Random();
                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
                int randNumber = rand.nextInt(4 - 1 + 1) + 1;//产生5秒到2秒随机数字
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//英语    
                 int countC=0;
                 String nextRoundStrC="http://xuexi.hgjt.cn/index/cglb/dt?id=310&matchid=0";//第10关310
            		nextRoundStrC=HTTPUtils2.gethtml(nextRoundStrC);
            		System.out.println(nextRoundStrC);
                 while( true ){
                	    ++countC;
                       try {
                    	   Thread childThread = Thread.currentThread();
                    	   childThread.sleep(6*1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                	   	 SimpleDateFormat dfC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                 	    System.out.println(dfC.format(new Date()));// new Date()为获取当前系统时间
                 	   System.out.println("childserise："+ countC +"-----");
                 	    long currenttimeC =System.currentTimeMillis();

                	 if (currenttimeC>=end){
                		 //时间到自动跳转
                		 break;
                	 }
                	
                	
                   
                  String an_srcC="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=301&id=27359&answer=B";
                  an_srcC= HTTPUtils2.gethtml(an_srcC);
                  System.out.println(an_srcC);
               	
               		 if (countC==10*10){//第10关次数控制，到10次提交一次，第一关
               			//提交连接
                   		 String subC_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=310&matchid=0";//第10关
                   		subC_src=HTTPUtils2.gethtml(subC_src);
                      System.out.println(subC_src);
                      
                       nextRoundStrC="http://xuexi.hgjt.cn/index/cglb/dt?id=310&matchid=0";//第10关310
                 		nextRoundStrC=HTTPUtils2.gethtml(nextRoundStrC);
                 		System.out.println(nextRoundStrC);
                            countC = 0;
                         // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
                            Random randC = new Random();
                            //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
                            int randNumberC = randC.nextInt(4- 1 + 1) + 1;//产生120秒到60秒随机数字
                            try {
                            	Thread childThread = Thread.currentThread();
                            	childThread.sleep(randNumberC*1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}//m秒 
               		 }//次数控制
               		 
                    
                }
		
	}  


}
