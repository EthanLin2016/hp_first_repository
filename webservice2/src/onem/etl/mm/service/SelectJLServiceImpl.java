package onem.etl.mm.service;

import java.sql.SQLException;
import java.util.List;

import onem.etl.mm.dao.ISelectJLDao;
import onem.etl.mm.dao.ISelectMMDao;
import onem.etl.mm.dao.SelectJLDaoimpl;
import onem.etl.mm.dao.SelectMMDaoImpl;

import com.test.webservicetest.HgGoodsInWeighInfoVo;

public class SelectJLServiceImpl implements  ISelectJLService{
	private ISelectJLDao selectJLDao = new SelectJLDaoimpl();
	
	@Override
	public List<HgGoodsInWeighInfoVo> selectJLByTime(
			List<HgGoodsInWeighInfoVo> hgGoodsInWeighInfoVoList)
			throws SQLException {
		 hgGoodsInWeighInfoVoList = selectJLDao.selectJLByTime(hgGoodsInWeighInfoVoList);
		return hgGoodsInWeighInfoVoList;
	}
 
}
