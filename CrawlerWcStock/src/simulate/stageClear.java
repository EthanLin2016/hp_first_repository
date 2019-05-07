package simulate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;

import utils.HTTPUtils;
import utils.HTTPUtils2;
import utils.HTTPUtils3;

public class stageClear {
	 static String username;
		
     static String password;
     private static void getImgRadomID(){
         //Json的地址[数据中包含验证码的地址]
     	double randomDouble=Math.random();
         String src="http://xuexi.hgjt.cn/vercode/vercode.php?a="+randomDouble;
         try {
             
             //下载验证码并存储到本地
             HTTPUtils3.downImg(src);
          //   HTTPUtils2.downImg(src);
             //System.out.println(content);
         } catch (ClientProtocolException e) {
            
             e.printStackTrace();
         } catch (IOException e) {
           
             e.printStackTrace();
         }
         
     }

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

       //输入验证码
       System.out.println("请输入验证码3：");
       BufferedReader buffimg=new BufferedReader(new InputStreamReader(System.in));
       try {
           captcha_solution=buffimg.readLine();
       } catch (IOException e) {
           e.printStackTrace();
       }
     
      
       System.out.println("logining-----------waiting----------------");
//       //判断是否允许答题
//       UserService service=new UserService();
//       Accout account=new Accout();
//       account.setAccountid("123456");
//       account.setBanlance("0");
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
       

       String result = HTTPUtils3.posthtml(login_src, paramMap);
       JSONObject json =new  JSONObject(result);
       System.out.println(json.get("message"));
       // System.out.println(json.get("status"));
        Integer status= (Integer) json.get("status");
        if (status!=1){
        	loginDouban();
        }
       
   }
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws JSONException 
	 * @throws InterruptedException 
	 */
	private static void stageclean(int stagenum,int startstage,int endstage,String intStr,String ansStr,String subStr) throws InterruptedException{
		
		for(int stage =startstage;stage<=endstage;stage++){//stage
				//选关必须
			   		String intRoundStr=intStr+String.valueOf(stage)+"&matchid=0";
			   		intRoundStr= HTTPUtils3.gethtml(intRoundStr);
			   	
				  for( int count=1;count<=stagenum*10;count=count+1){
						
						 //答题连接正确题连接
				         String an_src=ansStr;
				         an_src = HTTPUtils3.gethtml(an_src);
				         Thread.sleep(1*1000);
				         System.out.println(an_src);
				   		 if (count==stagenum*10){//次数控制，到10次提交一次，第一关
				   			//提交连接                   
				       		 String sub_src=subStr+String.valueOf(stage)+"&matchid=0";
				       		sub_src= HTTPUtils3.gethtml(sub_src);
				       	 System.out.println(sub_src);
				       	  
				             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
				                Random rand = new Random();
				                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
				                int randNumber = rand.nextInt(10 - 5 + 1) + 5;//产生10秒到5秒随机数字
				                try {
									Thread.sleep(2*1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									break;
								}//m秒 
				                break;
						
					}
				   	
				}
				  stagenum++;
			  }
	}
	public static void main(String[] args) throws JSONException, SQLException, InterruptedException {

			 loginDouban();
		////--------------英语301,310 计算机361,370，知识产权331，340，安全1，10
			 String stageStartStr="";///起始关
			   System.out.println("当前关ID：");
		       BufferedReader buffs=new BufferedReader(new InputStreamReader(System.in));
		       try {
		    	   stageStartStr=buffs.readLine();
		       } catch (IOException e) {
		           e.printStackTrace();
		       }
		       
		       String stageEndStr="";//结束管
			   System.out.println("最后关ID号：");
		       BufferedReader buffe=new BufferedReader(new InputStreamReader(System.in));
		       try {
		    	   stageEndStr=buffe.readLine();
		       } catch (IOException e) {
		           e.printStackTrace();
		       }
		       
			 int startstage=Integer.valueOf(stageStartStr);
			int endstage=Integer.valueOf(stageEndStr);
			
			String stageStr="";
			   System.out.println("当前关号：");
		       BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		       try {
		    	   stageStr=buff.readLine();
		       } catch (IOException e) {
		           e.printStackTrace();
		       }
		       
		      int stagecurnum = Integer.valueOf(stageStr);
			
		      String AnsUrs="";
		      String IntUrs="";
		      String SubUrs="";
//		    //--------安全
				 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=2&id=1269&answer=%E5%AF%B9";
				 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
				 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
				 stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);	
				
		      //--------英语
//			 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=301&id=27359&answer=B";
//			 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
//			 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
//			stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);	
//			
			//----------计算机
//				 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
//				 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
//				 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
//				 stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);
//		
					//----------知识产权
//				 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=331&id=25211&answer=B";
//				 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
//				 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
//				 stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);			 	 
//	
	}
	
	private static void singelstageclean() throws InterruptedException{
		///
		  for(int stage =10;stage<=10;stage=stage+1){//stage 开始管，结束管
				//选关必须
			   		String intRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=36"+String.valueOf(stage)+"&matchid=0";
			   		intRoundStr= HTTPUtils.gethtml(intRoundStr);
				  for( int count=1;count<=stage*10;count=count+1){
						
						 //答题连接正确题连接
				         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
				         an_src = HTTPUtils.gethtml(an_src);
				         Thread.sleep(1*1000);
				         System.out.println(an_src);
				   		 if (count==stage*10){//次数控制，到10次提交一次，第一关
				   			//提交连接                   
				       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=36"+String.valueOf(stage)+"&matchid=0";
				       		sub_src= HTTPUtils.gethtml(sub_src);
				       	 System.out.println(sub_src);
				       	  
				             // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数
				                Random rand = new Random();
				                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
				                int randNumber = rand.nextInt(10 - 5 + 1) + 5;//产生10秒到5秒随机数字
				                try {
									Thread.sleep(2*1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									break;
								}//m秒 
				                break;
						
					}
				   	
				}
			  }
	}
	
}
