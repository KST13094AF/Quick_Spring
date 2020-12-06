package com.Quick.biz.common;

public class AfterThrowingAdvice {
	//<aop:after-throwing> 포인트 컷으로 지정된 메소드가 실행 중 예외가 발생했을 때 실행된다.
	public void afterThrowingLog() {
		System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생");
	}
}
