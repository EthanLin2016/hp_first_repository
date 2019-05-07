package onem.etl.application;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.test.webservicetest.HgGoodsInWeighInfoVo;
import com.test.webservicetest.HgGoodsInWeighWebService;
import com.test.webservicetest.HgGoodsInWeighWebServiceImplService;
import com.test.webservicetest.ObjectFactory;
import com.test.webservicetest.ResponseResult;
import com.test.webservicetest.WebserviceHeader;

import onem.etl.mm.dao.SelectMMDaoImpl;
import onem.etl.mm.service.ISelectMMService;
import onem.etl.mm.service.SelectMMServiceImpl;


import utils.DateUtil;
import utils.TxProxy;

public class TransmitTT2 {

	private static ISelectMMService selectMMService = new SelectMMServiceImpl();
	 private static Logger logger = Logger.getLogger(TransmitTT2.class); 
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ParseException 
	 * 测试环境 test 123456
	 * 正式环境 HanGang   HG@ttwl254
	 */
	public static void main(String[] args) throws SQLException, ParseException {
		List<HgGoodsInWeighInfoVo> hgGoodsInWeighInfoVoList= selectMMService.selectMM();
		
		ObjectFactory obj = new ObjectFactory ();
		WebserviceHeader webserviceHeader = obj.createWebserviceHeader();
		webserviceHeader.setAccount("HanGang");
		webserviceHeader.setPwd("HG@ttwl254");
		
		Date yestadayBegin = DateUtil.getBeginDayOfYesterday();
		String yestadayBeginStr = DateUtil.dateToString(yestadayBegin, "yyyy-MM-dd HH:mm:ss");
		yestadayBeginStr = yestadayBeginStr.replace(" ", "");
		 StringBuilder sb = new StringBuilder(yestadayBeginStr);//构造一个StringBuilder对象
	        sb.insert(10, "T");//在指定的位置1，插入指定的字符串
	        yestadayBeginStr = sb.toString();
	        
	        Date yestadayEnd = DateUtil.getEndDayOfYesterDay();
	        String yestadayEndStr = DateUtil.dateToString(yestadayEnd, "yyyy-MM-dd HH:mm:ss");
	        yestadayEndStr = yestadayEndStr.replace(" ", "");
			  sb = new StringBuilder(yestadayEndStr);//构造一个StringBuilder对象
		        sb.insert(10, "T");//在指定的位置1，插入指定的字符串
		        yestadayEndStr = sb.toString();

		Date currentTime = new Date();
		String currentTimeStr = DateUtil.dateToString(currentTime, "yyyy-MM-dd HH:mm:ss");
		currentTimeStr = currentTimeStr.replace(" ", "");
		      sb = new StringBuilder(currentTimeStr);//构造一个StringBuilder对象
	        sb.insert(10, "T");//在指定的位置1，插入指定的字符串
	        currentTimeStr = sb.toString();
		
		
		webserviceHeader.setMessageSendingDateTime(currentTimeStr);
		webserviceHeader.setDataSource("河钢邯钢");
		
		HgGoodsInWeighWebServiceImplService service = new HgGoodsInWeighWebServiceImplService();
		HgGoodsInWeighWebService Iservice = service.getHgGoodsInWeighWebServiceImplPort();
		ResponseResult responseResult = Iservice.addBuyMetricInfo(webserviceHeader, yestadayBeginStr, yestadayEndStr, hgGoodsInWeighInfoVoList);
		logger.info("responseResult:"+responseResult.getRspCode()+"------"+responseResult.getRspMsg()+"------"+responseResult.getRspTime()+"------"+responseResult.getRspType());
	}

}
