package onem.etl.mm.dao;

import java.sql.SQLException;
import java.util.List;

import com.test.webservicetest.HgGoodsInWeighInfoVo;

public interface ISelectJLDao {
	public List<HgGoodsInWeighInfoVo> selectJLByTime(List<HgGoodsInWeighInfoVo> hgGoodsInWeighInfoVoList) throws SQLException;
}
