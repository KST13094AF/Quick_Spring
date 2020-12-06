package com.Quick.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	//<aop:after-throwing> 포인트 컷으로 지정된 메소드가 실행 중 예외가 발생했을 때 실행된다.
	// 모든 예외를 받을 수 있게 하기위해 최상위 Exception을 매개변수로 한다.
	public void afterThrowingLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[예외 처리]"+method+"() 메소드 수행 중 발생한 예외 메세지:" +exceptObj.getMessage());
	}
}
