package lgr.migration.spring.model;

import java.util.List;

import lgr.migration.spring.vo.MigVO;

public interface IMigService {
	public List<MigVO> selectList();
	public MigVO selectDetail(String mig_seq);
	public boolean insertBoard(MigVO mvo);
	public boolean deleteBoard(String mig_seq);
	public boolean updateBoard(MigVO mvo);
}
