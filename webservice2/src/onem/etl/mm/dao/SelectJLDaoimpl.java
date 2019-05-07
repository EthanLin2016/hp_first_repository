package onem.etl.mm.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.log4j.Logger;

import utils.DataSourceUtilsSqlServer;

import com.test.webservicetest.HgGoodsInWeighInfoVo;

public class SelectJLDaoimpl implements ISelectJLDao{
	 private static Logger logger = Logger.getLogger(SelectJLDaoimpl.class);
	@Override
	public List<HgGoodsInWeighInfoVo> selectJLByTime(
			List<HgGoodsInWeighInfoVo> hgGoodsInWeighInfoVoList)
			throws SQLException {
		QueryRunner run = new QueryRunner(DataSourceUtilsSqlServer.getDataSource());
		for(HgGoodsInWeighInfoVo hgGoodsInWeighInfoVo :hgGoodsInWeighInfoVoList){
			String tiCode  = hgGoodsInWeighInfoVo.getDataid();
			StringBuffer sql = new StringBuffer("");
			sql.append("select  top 100  a.progrossweight,a.prohuskweight,b.roomname as grossroom,c.roomname as huskroom   ");
			sql.append("from  carmetageweight a  left join  ");
			sql.append("      MetageRoomProperty b (nolock) on a.GrossRoomNo=b.RoomNo left join ");
			sql.append("      MetageRoomProperty c (nolock) on a.HuskRoomNo=c.RoomNo  ");
			sql.append("where a.tidcode= '"+tiCode+"'");
			String sqlStr = sql.toString();
			
			Map<String,Object> map = run.query(sqlStr, new MapHandler());
			for (Map.Entry<String, Object> entry : map.entrySet()) {
			      System.out.println(entry.getKey() + ":" + entry.getValue());
			      logger.info("JLDetail:"+entry.getKey() + ":" + entry.getValue());
			    }
			
			if ( map.get("grossroom")!=null &&  map.get("grossroom").toString().length()>0){
				String grossroomStr = map.get("grossroom").toString();
				hgGoodsInWeighInfoVo.setWeighstationname(grossroomStr);
			}
			else
			{
				hgGoodsInWeighInfoVo.setWeighstationname(" ");
			}
			
		
			if ( map.get("huskroom")!=null &&  map.get("huskroom").toString().length()>0){
				String huskroomStr = map.get("huskroom").toString();
				hgGoodsInWeighInfoVo.setTarestationname(huskroomStr);
			}
			else
			{
				hgGoodsInWeighInfoVo.setTarestationname(" ");
			}
			
			
		
			if (map.get("progrossweight")!=null && map.get("progrossweight").toString().length()>0){
				String pregroweight = map.get("progrossweight").toString();
				hgGoodsInWeighInfoVo.setPregroweight(new BigDecimal(pregroweight));
			}
			else
			{
				hgGoodsInWeighInfoVo.setPregroweight(new BigDecimal(0));
			}
			
			
		
			if (map.get("prohuskweight")!=null && map.get("prohuskweight").toString().length()>0){
				String prohuskweight = map.get("prohuskweight").toString();
				hgGoodsInWeighInfoVo.setPretareweight(new BigDecimal(prohuskweight));
			}
			else
			{
				hgGoodsInWeighInfoVo.setPretareweight(new BigDecimal(0));
			}
			
		}
		return hgGoodsInWeighInfoVoList;
	}

}
