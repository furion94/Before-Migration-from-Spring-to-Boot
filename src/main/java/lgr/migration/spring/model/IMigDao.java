package lgr.migration.spring.model;

import java.util.List;

import lgr.migration.spring.vo.MigVO;

public interface IMigDao {
	public List<MigVO> selectList();
	public MigVO selectDetail(String mig_seq);
	public Integer insertBoard(MigVO mvo);
	public Integer deleteBoard(String mig_seq);
	public Integer updateBoard(MigVO mvo);
}
