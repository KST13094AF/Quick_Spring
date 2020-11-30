package com.Quick.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return (Connection)DriverManager.getConnection("jdbc:mysql://localhost/quick?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true","root","youngpoong20");
			// 지속적 데이터베이스 커넥션 연결 시 ssl 보안이 포함되어야 하는데 포함 하지 않아 예외가 발생한다. useSSL=false;
			// mysql jdbc 8.x 버젼 이후 발생하는 문제로 url에 allowPublicKeyRetrieval=true
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		if(stmt != null) {
			try {
				if(!stmt.isClosed()) 
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}
		
		if(conn != null) {
			try {
				if(!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
	
	public static void close(ResultSet rs,PreparedStatement stmt, Connection conn) {
		if(stmt != null) {
			try {
				if(!stmt.isClosed()) 
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}
		
		if(conn != null) {
			try {
				if(!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
		
		if(rs != null) {
			try {
				if(!rs.isClosed()) 
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
	}
}
