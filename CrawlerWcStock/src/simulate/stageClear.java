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
         //Json�ĵ�ַ[�����а�����֤��ĵ�ַ]
     	double randomDouble=Math.random();
         String src="http://xuexi.hgjt.cn/vercode/vercode.php?a="+randomDouble;
         try {
             
             //������֤�벢�洢������
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
   	 //��¼ҳ
   	String login_src="http://xuexi.hgjt.cn/index/users/chklogin";
       //�����û���
       System.out.println("�������û�����");
       BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
       try {
      	 username=buff.readLine();
       } catch (IOException e) {
           e.printStackTrace();
       }
       
      
		
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
       System.out.println("��������֤��3��");
       BufferedReader buffimg=new BufferedReader(new InputStreamReader(System.in));
       try {
           captcha_solution=buffimg.readLine();
       } catch (IOException e) {
           e.printStackTrace();
       }
     
      
       System.out.println("logining-----------waiting----------------");
//       //�ж��Ƿ��������
//       UserService service=new UserService();
//       Accout account=new Accout();
//       account.setAccountid("123456");
//       account.setBanlance("0");
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
				//ѡ�ر���
			   		String intRoundStr=intStr+String.valueOf(stage)+"&matchid=0";
			   		intRoundStr= HTTPUtils3.gethtml(intRoundStr);
			   	
				  for( int count=1;count<=stagenum*10;count=count+1){
						
						 //����������ȷ������
				         String an_src=ansStr;
				         an_src = HTTPUtils3.gethtml(an_src);
				         Thread.sleep(1*1000);
				         System.out.println(an_src);
				   		 if (count==stagenum*10){//�������ƣ���10���ύһ�Σ���һ��
				   			//�ύ����                   
				       		 String sub_src=subStr+String.valueOf(stage)+"&matchid=0";
				       		sub_src= HTTPUtils3.gethtml(sub_src);
				       	 System.out.println(sub_src);
				       	  
				             // randNumber ������ֵΪһ�� MIN �� MAX ��Χ�ڵ������
				                Random rand = new Random();
				                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
				                int randNumber = rand.nextInt(10 - 5 + 1) + 5;//����10�뵽5���������
				                try {
									Thread.sleep(2*1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									break;
								}//m�� 
				                break;
						
					}
				   	
				}
				  stagenum++;
			  }
	}
	public static void main(String[] args) throws JSONException, SQLException, InterruptedException {

			 loginDouban();
		////--------------Ӣ��301,310 �����361,370��֪ʶ��Ȩ331��340����ȫ1��10
			 String stageStartStr="";///��ʼ��
			   System.out.println("��ǰ��ID��");
		       BufferedReader buffs=new BufferedReader(new InputStreamReader(System.in));
		       try {
		    	   stageStartStr=buffs.readLine();
		       } catch (IOException e) {
		           e.printStackTrace();
		       }
		       
		       String stageEndStr="";//������
			   System.out.println("����ID�ţ�");
		       BufferedReader buffe=new BufferedReader(new InputStreamReader(System.in));
		       try {
		    	   stageEndStr=buffe.readLine();
		       } catch (IOException e) {
		           e.printStackTrace();
		       }
		       
			 int startstage=Integer.valueOf(stageStartStr);
			int endstage=Integer.valueOf(stageEndStr);
			
			String stageStr="";
			   System.out.println("��ǰ�غţ�");
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
//		    //--------��ȫ
				 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=2&id=1269&answer=%E5%AF%B9";
				 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
				 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
				 stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);	
				
		      //--------Ӣ��
//			 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=301&id=27359&answer=B";
//			 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
//			 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
//			stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);	
//			
			//----------�����
//				 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
//				 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
//				 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
//				 stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);
//		
					//----------֪ʶ��Ȩ
//				 AnsUrs="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=331&id=25211&answer=B";
//				 IntUrs="http://xuexi.hgjt.cn/index/cglb/dt?id=";
//				 SubUrs="http://xuexi.hgjt.cn/index/cglb/passresult?passid=";
//				 stageclean(stagecurnum,startstage,endstage,IntUrs,AnsUrs,SubUrs);			 	 
//	
	}
	
	private static void singelstageclean() throws InterruptedException{
		///
		  for(int stage =10;stage<=10;stage=stage+1){//stage ��ʼ�ܣ�������
				//ѡ�ر���
			   		String intRoundStr="http://xuexi.hgjt.cn/index/cglb/dt?id=36"+String.valueOf(stage)+"&matchid=0";
			   		intRoundStr= HTTPUtils.gethtml(intRoundStr);
				  for( int count=1;count<=stage*10;count=count+1){
						
						 //����������ȷ������
				         String an_src="http://xuexi.hgjt.cn/index/cglb/ajaxdt?passid=361&id=30394&answer=D";
				         an_src = HTTPUtils.gethtml(an_src);
				         Thread.sleep(1*1000);
				         System.out.println(an_src);
				   		 if (count==stage*10){//�������ƣ���10���ύһ�Σ���һ��
				   			//�ύ����                   
				       		 String sub_src="http://xuexi.hgjt.cn/index/cglb/passresult?passid=36"+String.valueOf(stage)+"&matchid=0";
				       		sub_src= HTTPUtils.gethtml(sub_src);
				       	 System.out.println(sub_src);
				       	  
				             // randNumber ������ֵΪһ�� MIN �� MAX ��Χ�ڵ������
				                Random rand = new Random();
				                //int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
				                int randNumber = rand.nextInt(10 - 5 + 1) + 5;//����10�뵽5���������
				                try {
									Thread.sleep(2*1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									break;
								}//m�� 
				                break;
						
					}
				   	
				}
			  }
	}
	
}
