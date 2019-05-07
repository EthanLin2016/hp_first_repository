package utils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 多处理的Servlet
 * 接收cmd参数，默认值为execute
 */
public abstract class BaseServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String methodName = req.getParameter("cmd");
		if(methodName==null || methodName.trim().equals("")){
			methodName="execute";
		}
		try{
			Method method = this.getClass()
								.getMethod(methodName,
										HttpServletRequest.class,
										HttpServletResponse.class);
			//method.invoke(this,req,resp);
			//加强base
			Object result=method.invoke(this, req,resp);
			if(result!=null){
				//处理转发
				String key=result.toString();//index
				//判断是转发还是重定向
				boolean redirect=false;//默认转发
				if (key.startsWith("302:")){
					key=key.split(":")[1];//取：后面的值
					redirect=true;
				}
				//从资源文件查出index=.jsp
				/*Properties p=new Properties();
				p.load(BaseServlet.class.getClassLoader().getResourceAsStream("views.properties"));
				//获取这个KEY所对应的页面*/
				//String page=p.getProperty(key);
				///上面的代码写了专门的类 (package)utils---pageutils
				String page=PageUtils.getPage(key);//调用(package)utils---pageutils
				if(page==null){
					throw new RuntimeException("你没有配置key:"+key);
				}
				else
				{//如果为真就重定向,否则转发
					if(redirect){
						resp.sendRedirect(req.getContextPath()+page);
					}
					else
					{
						req.getRequestDispatcher(page).forward(req, resp);
					}
				}
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	public abstract String execute(HttpServletRequest req,HttpServletResponse resp)
			throws Exception;
}
