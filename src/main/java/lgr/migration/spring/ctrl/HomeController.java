package lgr.migration.spring.ctrl;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lgr.migration.spring.model.IMigService;
import lgr.migration.spring.vo.MigVO;

@Controller
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IMigService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		log.info("메인 화면 호출");
		request.setAttribute("list", service.selectList());
		return "home";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detailBoardFrom(HttpServletRequest request, String mig_seq) {
		log.info("글 상세 화면 호출");
		request.setAttribute("board", service.selectDetail(mig_seq));
		return "datail";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertBoardForm() {
		log.info("글 작성 화면 호출");
		return "insert";
	}
	
	@RequestMapping(value = "/inserting", method = RequestMethod.POST)
	public String insertBoard(HttpServletRequest request, MigVO mvo) {
		log.info("글 작성");
		boolean isc = service.insertBoard(mvo);
		if(!isc) {
			request.setAttribute("false", "글 작성 실패!");
		}
		return "redirect:/";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateBoardForm(HttpServletRequest request, String mig_seq) {
		log.info("글 수정 화면 호출");
		request.setAttribute("board", service.selectDetail(mig_seq));
		return "update";
	}
	
	@RequestMapping(value = "/updating", method = RequestMethod.POST)
	public String updateBoard(HttpServletRequest request, MigVO mvo) {
		log.info("글 수정");
		boolean isc = service.updateBoard(mvo);
		if(!isc) {
			request.setAttribute("false", "글 수정 실패!");
		}
		return "redirect:/detail?mig_seq="+mvo.getMig_seq();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteBoard(HttpServletRequest request, String mig_seq) {
		boolean isc = service.deleteBoard(mig_seq);
		if(!isc) {
			request.setAttribute("false", "글 삭제 실패!");
		}
		return "redirect:/";
	}

}
