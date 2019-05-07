package utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * 
 * 事务的代理类，可以代理任意的Service
 *
 */

public class TxProxy implements InvocationHandler{
	private Object src;
	private TxProxy(Object src){
		this.src=src;
	}
	/**
	 * 提供一个静态的方法返回代理对象
	 */
	public static Object factory(Object src){
		Object proxyedObj=Proxy.newProxyInstance(TxProxy.class.getClassLoader(), 
				src.getClass().getInterfaces(),new TxProxy(src));
		return proxyedObj;
	}
	/**
	 *以下是执行的句柄，当调用代理类的任意方法时，都会调用这个方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//判断是否有事务的注解 Tx注解类 如果是查询没有必要开事务
		if(!method.isAnnotationPresent(Tx.class)){
			return method.invoke(src, args);
		}
		//第一步：声明连接
		Connection con=null;
		Object returnValue=null;
		try {
			//第二步：获取连接
			con = DataSourceUtils.getConn();
			//第三步：设置事物的开始
			con.setAutoCommit(false);
			//第四步：调用目标类（被代理类）的方法
			returnValue = method.invoke(src, args);
			//第五步：调用成功
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		}
		finally{
			con.close();
			DataSourceUtils.remove();
		}
		return returnValue;
	}
}
