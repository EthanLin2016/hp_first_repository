package onem.etl.mm.service;

import java.sql.SQLException;
import java.util.List;

import com.test.webservicetest.HgGoodsInWeighInfoVo;


public interface ISelectMMService {
	public List<HgGoodsInWeighInfoVo> selectMM() throws SQLException;
}
