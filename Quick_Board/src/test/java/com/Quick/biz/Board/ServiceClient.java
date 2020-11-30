package com.Quick.biz.Board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.Quick.biz.board.BoardDTO;
import com.Quick.biz.board.impl.BoardService;

public class ServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext cantainer = new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService)cantainer.getBean("boardService");
		
		BoardDTO bDTO = new BoardDTO();
		bDTO.setTitle("테스트 1");
		bDTO.setContent("테스트 내용 1");
		bDTO.setWriter("유기현");
		boardService.insertBoard(bDTO);
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		list = boardService.getBoardList(bDTO);
		for(BoardDTO b : list) {
			System.out.println("--> "+ b.toString());
		}
		
		cantainer.close();
	}

}
