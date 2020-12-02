package com.Quick.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quick.biz.board.BoardDTO;

@Service("boardService")
public class BoardServiceimpl implements BoardService {

	@Autowired
	private BoardDAO bDAO;
	
	public BoardServiceimpl() {
	}
	
	@Override
	public void insertBoard(BoardDTO bDTO) {
		// TODO Auto-generated method stub
		bDAO.insertBoard(bDTO);
	}

	@Override
	public void updateBoard(BoardDTO bDTO) {
		// TODO Auto-generated method stub
		bDAO.updateBoard(bDTO);
	}

	@Override
	public void deleteBoard(BoardDTO bDTO) {
		// TODO Auto-generated method stub
		bDAO.deleteBoard(bDTO);
	}

	@Override
	public BoardDTO getBoard(BoardDTO bDTO) {
		// TODO Auto-generated method stub
		return bDAO.getBoard(bDTO);
	}

	@Override
	public List<BoardDTO> getBoardList(BoardDTO bDTO) {
		// TODO Auto-generated method stub
		return bDAO.getBoardList(bDTO);
	}

}
