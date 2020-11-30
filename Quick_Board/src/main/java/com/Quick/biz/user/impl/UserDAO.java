package com.Quick.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Quick.biz.common.JDBCUtil;
import com.Quick.biz.user.UserDTO;

@Repository("userDAO")
public class UserDAO  {
	
	PreparedStatement pstmt = null;
	Connection conn = null;
	ResultSet rs = null;
	
	private final String USER_GET = "select * from users where id = ? and password = ?";
	
	public UserDTO getUser(UserDTO uDTO) {
		UserDTO user = null;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, uDTO.getId());
			pstmt.setString(2, uDTO.getPassword());
			rs = pstmt.executeQuery();
			
			user = new UserDTO();
			if(rs.next()) {
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return user;
	}
}
