package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.dto.PageDTO;
import org.zerock.dto.PageUtil;
import org.zerock.mapper.BoardMapper;
import org.zerock.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getPageList(PageDTO dto) {
		log.info("-=====/=======mapper:==="+mapper);
		return mapper.getList(dto);
	}

	@Override
	public void register(BoardVO vo) {
		mapper.insert(vo);

	}
	@Override
	public int getTotal() {
		
		return mapper.getTotal();

	}
		

}
