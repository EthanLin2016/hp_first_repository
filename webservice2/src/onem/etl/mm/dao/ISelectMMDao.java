package onem.etl.mm.dao;

import java.sql.SQLException;
import java.util.List;

import com.test.webservicetest.HgGoodsInWeighInfoVo;



public interface ISelectMMDao {
	public List<HgGoodsInWeighInfoVo> selectMMByTime() throws SQLException;
}
