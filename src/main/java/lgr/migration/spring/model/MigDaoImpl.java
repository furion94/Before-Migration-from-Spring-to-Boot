package lgr.migration.spring.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lgr.migration.spring.vo.MigVO;

@Repository
public class MigDaoImpl implements IMigDao{

	@Autowired
	private SqlSessionTemplate session;
	
	private final String NS = "lgr.migration.spring.model.IMigDao.";
	
	@Override
	public List<MigVO> selectList() {
		return session.selectList(NS+"selectList");
	}

	@Override
	public MigVO selectDetail(String mig_seq) {
		return session.selectOne(NS+"selectDetail", mig_seq);
	}

	@Override
	public Integer insertBoard(MigVO mvo) {
		return session.insert(NS+"insertBoard", mvo);
	}

	@Override
	public Integer deleteBoard(String mig_seq) {
		return session.delete(NS+"deleteBoard", mig_seq);
	}

	@Override
	public Integer updateBoard(MigVO mvo) {
		return session.update(NS+"updateBoard", mvo);
	}
	
	

}
