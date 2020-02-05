package lgr.migration.spring.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lgr.migration.spring.vo.MigVO;

@Service
public class MigServiceImpl implements IMigService{
	
	private static final Logger log = LoggerFactory.getLogger(MigServiceImpl.class);
	
	@Autowired
	private IMigDao dao;

	@Override
	public List<MigVO> selectList() {
		log.info("게시글 전체 조회");
		return dao.selectList();
	}

	@Override
	public MigVO selectDetail(String mig_seq) {
		log.info("{} 게시글 상세 조회",mig_seq);
		return dao.selectDetail(mig_seq);
	}

	@Override
	public boolean insertBoard(MigVO mvo) {
		log.info("게시글 추가");
		return dao.insertBoard(mvo)>0?true:false;
	}

	@Override
	public boolean deleteBoard(String mig_seq) {
		log.info("{} 글 삭제", mig_seq);
		return dao.deleteBoard(mig_seq)>0?true:false;
	}

	@Override
	public boolean updateBoard(MigVO mvo) {
		log.info("{} 글 수정", mvo.getMig_seq());
		return dao.updateBoard(mvo)>0?true:false;
	}

}
