package onem.etl.mm.service;

import java.sql.SQLException;
import java.util.List;


import onem.etl.mm.dao.ISelectMMDao;

import onem.etl.mm.dao.SelectMMDaoImpl;

import com.test.webservicetest.HgGoodsInWeighInfoVo;

public class SelectMMServiceImpl implements ISelectMMService{
	
	private ISelectMMDao selectMMDao = new SelectMMDaoImpl();
	
	private ISelectJLService selectJLService =  new SelectJLServiceImpl();
	
	@Override
	public List<HgGoodsInWeighInfoVo> selectMM() throws SQLException {
		
		List<HgGoodsInWeighInfoVo> hgGoodsInWeighInfoVoList = selectMMDao.selectMMByTime();
		
		hgGoodsInWeighInfoVoList=selectJLService.selectJLByTime(hgGoodsInWeighInfoVoList);
		
		return hgGoodsInWeighInfoVoList;

	}
 
}
