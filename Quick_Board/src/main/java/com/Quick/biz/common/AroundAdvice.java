package com.Quick.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	// <aop:around> 비즈니스 메소드 실행 전, 후에 모두 동작한다.
	// around 어드바이스는 클라이언트의 메소드 호출을 가로챈다. 그럼으로 메소드 호출 전, 후에 사전 로직 처리를 할 수 있게 된다.
	// around 어드바이스는 JoinPoint 인터페이스가 아닌 ProceedingJoinPoing 객체를 매개변수로 받아야 한다.
	// 
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object obj = pjp.proceed();
		
		stopWatch.stop();
		System.out.println(method +"() 메소드 수행에 걸린 시간 :" +stopWatch.getTotalTimeMillis()+"(ms) 초");
		
		return obj;
	}
}
