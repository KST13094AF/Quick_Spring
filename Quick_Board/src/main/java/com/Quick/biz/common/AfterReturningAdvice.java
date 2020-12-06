package com.Quick.biz.common;

import org.aspectj.lang.JoinPoint;

import com.Quick.biz.user.UserDTO;

public class AfterReturningAdvice {
	//<aop:after-Returning> ����Ͻ� �޼ҵ尡 ȣ�� �� �� ������� ������ �� ����
	
	// �ι�° �Ű����� Object ���ε� ���� 
	// ����Ͻ� �޼ҵ尡 ������ �ᱣ���� ���ε��� �������� ���ȴ� (� ���� ���ϵ��� �𸣱� ������ Object�� ���ȴ�.)
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserDTO) {
			UserDTO user = (UserDTO)returnObj;
			if(user.getRole().equals("admin")) {
				System.out.println(user.getName()+" �α���(admin)");
			}
		}
		System.out.println("[���� ó��]"+method +"() �޼ҵ� ���ϰ�: "+returnObj.toString());
	}
}
