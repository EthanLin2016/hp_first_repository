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

    //����¼���
    public static void loginDouban() throws JSONException, SQLException{
    	 //��¼ҳ
    	String login_src="http://xuexi.hgjt.cn/index/users/chklogin";
        //�����û���
       
        //��������
        
        //��������
        System.out.println("���������룺");
        BufferedReader buffpassword=new BufferedReader(new InputStreamReader(System.in));
        try {
        	password=buffpassword.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //��ȡ��֤��ͼƬ
        getImgRadomID();

        String captcha_solution="";
      
        //������֤��
        System.out.println("��������֤��1��");
        BufferedReader buffimg=new BufferedReader(new InputStreamReader(System.in));
        try {
            captcha_solution=buffimg.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
     
      
        System.out.println("logining-----------waiting----------------");
//        //�ж��Ƿ��������
//        UserService service=new UserService();
//        Accout account=new Accout();
//        account.setAccountid("123456");
//        account.setBanlance("0");
//		///��̨�����ж����ɵ���User
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
        //Json�ĵ�ַ[�����а�����֤��ĵ�ַ]
    	double randomDouble=Math.random();
        String src="http://xuexi.hgjt.cn/vercode/vercode.php?a="+randomDouble;
        try {
            
            //������֤�벢�洢������
            HTTPUtils.downImg(src);
         
            //System.out.println(content);
        } catch (ClientProtocolException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
          
            e.printStackTrace();
        }
        
    }
   
    
    //һ��ʵ����ֻ������һ��url
    public static void main(String[] args) throws Exception {
    	   //���ؿ���
	    boolean flag =false;
	    flag = isPortUsing("10.46.15.16", 1433);  
	    if (flag==false){
	    	 System.exit(0);
	    }
	   
	     start = System.currentTimeMillis();//��ʼϵͳʱ��
	      end = start + (180*60)*1000; //  seconds * 1000 ms/sec
    	//ģ���½
    	loginDouban();
    	//����ʱ�����ʱ��
    	//Double dm =dateLimted();
    	//dm=dm*60;//����ɷ���

 ///----------------------------------------------------------------Ӣ��
    	 int count=0;
    		String nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=310&matchid=0";//Ӣ��
    		nextRoundStr= HTTPUtils.gethtml(nextRoundStr);
    	                         
  		  //  JSONObject jsonab =new  JSONObject(an_srcString);
    		//nextRoundStr=EncodeString.encodeString(nextRoundStr);
  
    	 System.out.println(nextRoundStr);
    	 
     while( true ){
    	    ++count;

//    	   	 if(count%2==0){
//    	            //���������
//    	            int m = (int)(Math.random()*20);
//    	            Thread.sleep(m*1000);
//    	        }
           Thread.sleep(2*1000);
    	   	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
     	    System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
     	   System.out.println("mainserise��"+ count +"-----");
     	    long currenttime =System.currentTimeMillis();

    	 if (currenttime>=end){
    		 //ʱ�䵽�Զ���ת
    		 
    		 Date startTime = new Date(start);
    		 Date endTime = new Date(currenttime);
    		 SimpleDateFormat dfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
      	    System.out.println("start-------"+dfd.format(startTime));// new Date()Ϊ��ȡ��ǰϵͳʱ��
      	    System.out.println("end-------"+dfd.format(endTime));// new Date()Ϊ��ȡ��ǰϵͳʱ��
    		 break;
    	 }
    	
       //����������ȷ�����Ӽ����
         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=301&id=27359&answer=B";
         an_src = HTTPUtils.gethtml(an_src);
         an_src=EncodeString.encodeString(an_src);
         System.out.println(an_src);
   		 if (count==10*10){//�������ƣ���10���ύһ�Σ���һ��
   			//�ύ����                   
       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=310&matchid=0";
       		sub_src= HTTPUtils.gethtml(sub_src);
       		sub_src=EncodeString.encodeString(sub_src);
       	 System.out.println(sub_src);
       	 
   	  //ѡ�ر���
    		 nextRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=310&matchid=0";//�����
    		nextRoundStr= HTTPUtils.gethtml(nextRoundStr);
    		nextRoundStr=EncodeString.encodeString(nextRoundStr);
    	 System.out.println(nextRoundStr);
                count = 0;
             // randNumber ������ֵΪһ�� MIN �� MAX ��Χ�ڵ������
                Random rand = new Random();
                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
                int randNumber = rand.nextInt(4 - 2 + 1) + 2;//����10�뵽5���������
                Thread.sleep(randNumber*1000);//m�� 
   		 }//��������
   		 
        
     }
///--------------------------------------------------------------------
    }
	
    
    public static double dateLimted (){
    	System.out.println("�������ʱ��(Сʱ)��ֻ������1-9");
  	  BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        try {
      	  datelimited=buff.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        double num=0;
        java.text.DecimalFormat myformat=new java.text.DecimalFormat("#0.00");
       
       if(isNumeric(datelimited)) {
    	   num=Double.parseDouble(datelimited);//װ��Ϊdouble����
           num=Double.parseDouble(myformat.format(num));//����2ΪС��
       
   		if (num<0){
   			System.out.println("�������ʱ��������1");
   		}
       }
       else
    	   dateLimted();
       return num;
    }
    /**
     * ����������ʽ�ж��ַ����Ƿ�������
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
            Socket socket = new Socket(Address,port);  //����һ��Socket����
            flag = true;  
        } catch (IOException e) {  

        }  
        return flag;  
    }
	


}
