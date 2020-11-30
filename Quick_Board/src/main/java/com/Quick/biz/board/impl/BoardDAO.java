package com.Quick.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Quick.biz.board.BoardDTO;
import com.Quick.biz.common.JDBCUtil;

@Repository("boardDAO")
public class BoardDAO implements BoardService {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values(0,?,?,?)";
	private final String BOARD_UPDATE = "update board set title = ? content = ?, where seq = ?";
	private final String BOARD_DELETE = "delete board where seq = ?";
	private final String BOARD_GET = "select * from board where seq = ?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	@Override
	public void insertBoard(BoardDTO bDTO) {
		System.out.println("==> JDBC insertBoard() 龋免 贸府");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, bDTO.getTitle());
			pstmt.setString(2, bDTO.getWriter());
			pstmt.setString(3, bDTO.getContent());
			
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	@Override
	public void updateBoard(BoardDTO bDTO) {
		System.out.println("==> JDBC updateBoard() 龋免 贸府");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, bDTO.getTitle());
			pstmt.setString(2, bDTO.getContent());
			pstmt.setInt(3, bDTO.getSeq());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	@Override
	public void deleteBoard(BoardDTO bDTO) {
		System.out.println("==> JDBC deleteBoard() 龋免 贸府");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, bDTO.getSeq());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	@Override
	public BoardDTO getBoard(BoardDTO bDTO) {
		System.out.println("==> JDBC getBoard() 龋免 贸府");
		BoardDTO board = null;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_GET);
			pstmt.setInt(1, bDTO.getSeq());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardDTO();
				board.setSeq(rs.getInt("Seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return board;
	}
	
	@Override
	public List<BoardDTO> getBoardList(BoardDTO bDTO){
		System.out.println("==> JDBC getBoardList() 龋免 贸府");
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return list;
	}
}
