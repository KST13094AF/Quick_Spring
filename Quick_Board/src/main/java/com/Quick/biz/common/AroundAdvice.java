package com.Quick.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	// <aop:around> 비즈니스 메소드 실행 전, 후에 모두 동작한다.
	// around 어드바이스는 클라이언트의 메소드 호출을 가로챈다. 그럼으로 메소드 호출 전, 후에 사전 로직 처리를 할 수 있게 된다.
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[BEFORE]: 비즈니스 메소드 수행 전 처리할 내용...");
		Object returnObj = pjp.proceed();
		System.out.println("[AFTER]: 비즈니스 메소드 수행 후 처리할 내용...");
		return returnObj;
	}
}
