package com.Quick.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService) container.getBean("userService");
		
		UserDTO uDTO = new UserDTO();
		uDTO.setId("id01");
		uDTO.setPassword("pw01");
		
		UserDTO user = userService.getUser(uDTO);
		
		if(user!= null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		}else {
			System.out.println("�α��� ����");
		}
		
		container.close();
	}

}
