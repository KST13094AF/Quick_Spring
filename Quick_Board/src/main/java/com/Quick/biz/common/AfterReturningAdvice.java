package com.Quick.biz.common;

import org.aspectj.lang.JoinPoint;

import com.Quick.biz.user.UserDTO;

public class AfterReturningAdvice {
	//<aop:after-Returning> 비즈니스 메소드가 호출 된 후 결과값을 리턴할 때 실행
	
	// 두번째 매개변수 Object 바인드 변수 
	// 비즈니스 메소드가 리턴한 결괏값을 바인딩할 목적으로 사용된다 (어떤 값이 리턴될지 모르기 때문에 Object가 사용된다.)
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserDTO) {
			UserDTO user = (UserDTO)returnObj;
			if(user.getRole().equals("admin")) {
				System.out.println(user.getName()+" 로그인(admin)");
			}
		}
		System.out.println("[사후 처리]"+method +"() 메소드 리턴값: "+returnObj.toString());
	}
}
