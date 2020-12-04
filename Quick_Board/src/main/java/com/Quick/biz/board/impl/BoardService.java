package com.Quick.biz.board.impl;

import java.util.List;

import com.Quick.biz.board.BoardDTO;

public interface BoardService {

	void insertBoard(BoardDTO bDTO);

	void updateBoard(BoardDTO bDTO);

	void deleteBoard(BoardDTO bDTO);

	BoardDTO getBoard(BoardDTO bDTO);

	List<BoardDTO> getBoardList(BoardDTO bDTO);
	
	//인터페이스

}