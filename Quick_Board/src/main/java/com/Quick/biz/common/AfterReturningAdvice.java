package com.Quick.biz.common;

public class AfterReturningAdvice {
	//<aop:after-Returning> 비즈니스 메소드가 호출 된 후 결과값을 리턴할 때 실행
	public void afterLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 동작");
	}
}
