package com.Quick.biz.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.Quick.biz.board.impl.BoardService;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		AbstractApplicationContext cantainer = new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService)cantainer.getBean("boardService");
		
		BoardDTO bDTO = new BoardDTO();
		bDTO.setTitle("�׽�Ʈ 1");
		bDTO.setContent("�׽�Ʈ ���� 1");
		bDTO.setWriter("������");
		boardService.insertBoard(bDTO);
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		list = boardService.getBoardList(bDTO);
		for(BoardDTO b : list) {
			System.out.println("--> "+ b.toString());
		}
		
		cantainer.close();
	}
}