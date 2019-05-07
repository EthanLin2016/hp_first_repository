package onem.etl.mm.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.log4j.Logger;

import org.junit.Test;

import com.test.webservicetest.*;

import utils.DataSourceUtils;
import utils.DateUtil;
import utils.SqlUtils;

public class SelectMMDaoImpl implements ISelectMMDao{
	 private static Logger logger = Logger.getLogger(SelectMMDaoImpl.class);


	@Override
	
	public List<HgGoodsInWeighInfoVo> selectMMByTime() throws SQLException {
		String sql="";
		QueryRunner run = new QueryRunner(DataSourceUtils.getDataSource());
		sql = SqlUtils.getSql("mmsql");
		//sql = "select a.*,to_char(pzsj,'yyyy-mm-dd hh24:mi:ss') as pzsja,to_char(mzsj,'yyyy-mm-dd hh24:mi:ss') as mzsja from IETI_charge_view_4 a where FWDRCODE<>'214096' and  TTYPE='汽车' AND PZSJ >= trunc(sysdate)-1 AND MZSJ <= trunc(sysdate) and pz>0";

		List<Map<String,Object>> list = run.query(sql, new MapListHandler());
		List<HgGoodsInWeighInfoVo> listHgGoodsInWeighInfoVo =new ArrayList<HgGoodsInWeighInfoVo>();
		ObjectFactory obj = new ObjectFactory ();
		//遍历集合list
		for( Map<String,Object> map : list ){
			
			HgGoodsInWeighInfoVo hGoodsInWeighInfoVo = obj.createHgGoodsInWeighInfoVo();
			for (Map.Entry<String, Object> entry : map.entrySet()) {
			      System.out.println("MMDetail:"+entry.getKey() + ":" + entry.getValue());
			      logger.info("MMDetail:"+entry.getKey() + ":" + entry.getValue());
			    }
			
			if (map.get("MATNRCODE") ==null || map.get("MATNRCODE").toString().length()<=0){
				hGoodsInWeighInfoVo.setMaktxnum("");
			}
			else
				
			{
				hGoodsInWeighInfoVo.setMaktxnum(map.get("MATNRCODE").toString()); //物料代码
			}
			
			if (map.get("MATNR") ==null || map.get("MATNR").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setMaktx("");
			}
			else{
				hGoodsInWeighInfoVo.setMaktx(map.get("MATNR").toString()); //物料名称
			}

			if (map.get("BILLNO") ==null || map.get("BILLNO").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setMsbill("");//通知单号
			}
			else
			{
				hGoodsInWeighInfoVo.setMsbill(map.get("BILLNO").toString());//通知单号
			}
		
			hGoodsInWeighInfoVo.setMsunit("TON");//单位
			
			if (map.get("SPNO") ==null || map.get("SPNO").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setShipnum("");//船编
			}
			else
			{
				hGoodsInWeighInfoVo.setShipnum(map.get("SPNO").toString());//船编
			}
				
			if (map.get("FWDR") ==null || map.get("FWDR").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setTransunitname("");
			}
			else
			{
				hGoodsInWeighInfoVo.setTransunitname(map.get("FWDR").toString());//车队名称
			}
			
			if (map.get("TF") ==null || map.get("TF").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setUnitdes("");
			}
			else
			{
				hGoodsInWeighInfoVo.setUnitdes(map.get("TF").toString());//收货工厂
			}
				
			if (map.get("TN") ==null || map.get("TN").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setVehnum("");//车辆牌照
			}
			else
			{
				hGoodsInWeighInfoVo.setVehnum(map.get("TN").toString());//车辆牌照
			}
			
			if (map.get("GW") ==null || map.get("GW").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setGroweight(new BigDecimal(0));
			}
			else
			{
				BigDecimal gw = new BigDecimal(map.get("GW").toString());
				hGoodsInWeighInfoVo.setGroweight(gw);//毛重 
			}

			if (map.get("PZ") ==null || map.get("PZ").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setTareweight(new BigDecimal(0));//皮重 
			}
			else
			{
				BigDecimal pz = new BigDecimal(map.get("PZ").toString());
				hGoodsInWeighInfoVo.setTareweight(pz);//皮重 
			}

			if (map.get("TW") ==null || map.get("TW").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setInpla("");//收货库存地
			}
			else
			{
				hGoodsInWeighInfoVo.setInpla(map.get("TW").toString());//收货库存地
			}

			
			if (map.get("NW") ==null || map.get("NW").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setNetweight(new BigDecimal(0));//净重
			}
			else
			{
				BigDecimal nw = new BigDecimal(map.get("NW").toString());
				hGoodsInWeighInfoVo.setNetweight(nw);//净重
				
			}
			
			
			if (map.get("PZSJA") ==null || map.get("PZSJA").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setTaretime("");//皮重时间
			}
			else
			{
				String pzsjStr = map.get("PZSJA").toString();
				 StringBuilder sb = new StringBuilder(pzsjStr);//构造一个StringBuilder对象
			        sb.insert(10, "T");//在指定的位置1，插入指定的字符串
			        pzsjStr = sb.toString();
			        pzsjStr = pzsjStr.replace(" ", "");
				hGoodsInWeighInfoVo.setTaretime(pzsjStr);//皮重时间
			}
	
			
			if (map.get("MZSJA") ==null || map.get("MZSJA").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setWgttime("");//毛重时间

			}
			else
			{
				String mzsjStr = map.get("MZSJA").toString();
				 StringBuilder sb1 = new StringBuilder(mzsjStr);//构造一个StringBuilder对象
			        sb1.insert(10, "T");//在指定的位置1，插入指定的字符串
			        mzsjStr = sb1.toString();
			        mzsjStr = mzsjStr.replace(" ", "");
				hGoodsInWeighInfoVo.setWgttime(mzsjStr);//毛重时间

			}
			
			hGoodsInWeighInfoVo.setBusinesstype("采购进厂");//运输业务类型
			
			if (map.get("ST") ==null || map.get("ST").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setSendpla("");//发放库存地
			}
			else
			{
				hGoodsInWeighInfoVo.setSendpla(map.get("ST").toString());//发放库存地
			}
				
			if (map.get("DNO") ==null || map.get("DNO").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setDataid("");//dataid对应TID
			}
			else
			{
				hGoodsInWeighInfoVo.setDataid(map.get("DNO").toString());//dataid对应TID
			}
				
			if (map.get("IECODE") ==null || map.get("IECODE").toString().length()<=0)
			{
				hGoodsInWeighInfoVo.setContractnum("");
			}
			else
			{
				hGoodsInWeighInfoVo.setContractnum(map.get("IECODE").toString());
			}
				

			listHgGoodsInWeighInfoVo.add(hGoodsInWeighInfoVo);
		}
		return listHgGoodsInWeighInfoVo;
	}
	


}
