package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.zerock.dto.PageDTO;
import org.zerock.vo.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList(PageDTO dto);
	
	public int getTotal();
	
	public int insert(BoardVO vo);
	
}
