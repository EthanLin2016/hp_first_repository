package onem.etl.mm.service;

import java.sql.SQLException;
import java.util.List;

import com.test.webservicetest.HgGoodsInWeighInfoVo;


public interface ISelectJLService {
	public List<HgGoodsInWeighInfoVo> selectJLByTime(List<HgGoodsInWeighInfoVo> hgGoodsInWeighInfoVoList) throws SQLException;
}
