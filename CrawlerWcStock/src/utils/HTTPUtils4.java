package utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public  class HTTPUtils4 {
	private static HttpClient httpClient4=new DefaultHttpClient();
	public static HttpResponse getRawHtml(HttpClient client, String personalUrl) {
        //��ȡ��Ӧ�ļ�����html������get������ȡ��Ӧ����
        HttpGet getMethod = new HttpGet(personalUrl);
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        try {
            //ִ��get����
            response = client.execute(getMethod);
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            // getMethod.abort();
        }
        return response;
    }
	
	public static String gethtml(String redirectLocation) {  
        HttpGet httpget = new HttpGet(redirectLocation);  
        // Create a response handler  
        ResponseHandler<String> responseHandler = new BasicResponseHandler();  
        String responseBody = "";  
        try {  
            responseBody = httpClient4.execute(httpget, responseHandler);  
        } catch (Exception e) {
            e.printStackTrace();  
            responseBody = null;  
        } finally {  
            httpget.abort();  
//            httpClient.getConnectionManager().shutdown();  
        }  
        return responseBody;  
    }  
	public static String posthtml(String redirectLocation,Map<String,String> paramMap) {  
     //������������ģ����Ҫ����Ĳ������ⲿ��ͨ��ץ����á�����ץ�����뿴��֮ǰд��һЩ����
        List<NameValuePair> list=new ArrayList<NameValuePair>();
        //ѭ��ȡ������ֵ
		Iterator<Map.Entry<String, String>> iterator1 = paramMap.entrySet().iterator();
        Map.Entry<String, String> entry;
        while (iterator1.hasNext()) {
            entry = iterator1.next();
           // entry.getKey();
           // entry.getValue();
            list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }

//        list.add(new BasicNameValuePair("url","http://xuexi.hgjt.cn/index/index/wslb"));
//        list.add(new BasicNameValuePair("username", username));
//        list.add(new BasicNameValuePair("password", password));
//        list.add(new BasicNameValuePair("vercode", captcha_solution));
        String result="";
        HttpPost httpPost = new HttpPost(redirectLocation);
        try {
            //���̨��������,��½��վ
            httpPost.setEntity(new UrlEncodedFormEntity(list));
            HttpResponse response=httpClient4.execute(httpPost);
            HttpEntity entity=response.getEntity();
            result=EntityUtils.toString(entity,"utf-8");
           

           // System.out.println(result);
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return result;
	}
	
	/**
     * �˷�����������֤��ͼƬ������
     * @param src  ������֤ͼƬ�����ĵ�ַ
     * @throws IOException 
     */
	 public static void downImg(String src) throws IOException{
	        File fileDir=new File("d:\\tuxiangshibie\\IdentifyingCode");
	        if(!fileDir.exists()){
	            fileDir.mkdirs();
	        }
	        //ͼƬ���ر����ַ
	        File file=new File("d:\\tuxiangshibie\\IdentifyingCode\\4.png");
	        if(file.exists()){
	            file.delete();
	        }
	        InputStream input = null;
	        FileOutputStream out= null;
	        HttpGet httpGet=new HttpGet(src);
	        try {
	            HttpResponse response=httpClient4.execute(httpGet);
	            System.out.print("httpClient4-------"+httpClient4);
	            HttpEntity entity = response.getEntity();
	            input = entity.getContent();
	            int i=-1;
	            byte[] byt=new byte[1024];
	            out=new FileOutputStream(file);
	            while((i=input.read(byt))!=-1){
	                out.write(byt);
	            }
	            System.out.println("ͼƬ���سɹ���");
	        } catch (ClientProtocolException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        out.close();
	    }
	    
	 
	 /**
	     * ��ȡ��֤��ͼƬ��token��ֵ
	     * @return token
	     */
	    private static String getImgID(){
	        //Json�ĵ�ַ[�����а�����֤��ĵ�ַ]
	        String src="https://www.douban.com/j/misc/captcha";
	        HttpGet httpGet=new HttpGet(src);
	        String token="";
	        try {
	            HttpResponse response=httpClient4.execute(httpGet);
	            HttpEntity entity=response.getEntity();
	            //��json����ת��Ϊmap����Ӧ����key��value����ʽ�������json���ݵģ��뿴��ǰ��Ĺ���json�����Ĳ���
	            String content=EntityUtils.toString(entity,"utf-8");
	            Map<String,String> mapList=getResultList(content);
	            token=mapList.get("token");
	            //��ȡ��֤��ĵ�ַ
	            String url="https:"+mapList.get("url");
	            //������֤�벢�洢������
	            downImg(url);
	            //System.out.println(token);
	            //System.out.println(url);
	            //System.out.println(content);
	        } catch (ClientProtocolException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return token;
	    }
	    /**
	     * ��JSON �����ݸ�ʽ���������ɵ�����������Map�з���
	     * @param content ������֤��ʱ���������ص�����
	     * @return Map����
	     */
	    public static Map<String,String> getResultList(String content){
	        Map<String,String> maplist=new HashMap<String,String>();
	        try {
	            JSONObject jo=new JSONObject(content.replaceAll(",\\\"r\\\":false", ""));
	            Iterator it = jo.keys();
	            String key="";
	            String value="";
	            while(it.hasNext()){
	                key=(String) it.next();
	                value=jo.getString(key);
	                maplist.put(key, value);
	            }
	        } catch (JSONException e) {
	            e.printStackTrace();
	        }
	        return maplist;
	    }
	    
}
