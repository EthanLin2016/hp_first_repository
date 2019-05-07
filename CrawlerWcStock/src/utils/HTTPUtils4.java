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
        //获取响应文件，即html，采用get方法获取响应数据
        HttpGet getMethod = new HttpGet(personalUrl);
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        try {
            //执行get方法
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
     //构建参数，即模拟需要输入的参数。这部分通过抓包获得。不会抓包的请看我之前写的一些博客
        List<NameValuePair> list=new ArrayList<NameValuePair>();
        //循环取参数赋值
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
            //向后台请求数据,登陆网站
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
     * 此方法是下载验证码图片到本地
     * @param src  给个验证图片完整的地址
     * @throws IOException 
     */
	 public static void downImg(String src) throws IOException{
	        File fileDir=new File("d:\\tuxiangshibie\\IdentifyingCode");
	        if(!fileDir.exists()){
	            fileDir.mkdirs();
	        }
	        //图片下载保存地址
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
	            System.out.println("图片下载成功！");
	        } catch (ClientProtocolException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        out.close();
	    }
	    
	 
	 /**
	     * 获取验证码图片“token”值
	     * @return token
	     */
	    private static String getImgID(){
	        //Json的地址[数据中包含验证码的地址]
	        String src="https://www.douban.com/j/misc/captcha";
	        HttpGet httpGet=new HttpGet(src);
	        String token="";
	        try {
	            HttpResponse response=httpClient4.execute(httpGet);
	            HttpEntity entity=response.getEntity();
	            //将json数据转化为map，对应的是key，value的形式。不理解json数据的，请看我前面的关于json解析的博客
	            String content=EntityUtils.toString(entity,"utf-8");
	            Map<String,String> mapList=getResultList(content);
	            token=mapList.get("token");
	            //获取验证码的地址
	            String url="https:"+mapList.get("url");
	            //下载验证码并存储到本地
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
	     * 用JSON 把数据格式化，并生成迭代器，放入Map中返回
	     * @param content 请求验证码时服务器返回的数据
	     * @return Map集合
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
