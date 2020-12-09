package com.Quick.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	// <aop:before>
	// joinPoint 인터페이스 
	// Signature getSignature() 클라이언트가 호출한 메소드의 시그니처 (리턴 타입, 이름, 매개변수) 정보가 저장된 Signature 객체 리턴
	// Object getTarget() 클라이언트가 호출한 비즈니스 메소드를 포함하는 비즈니스 객체 리턴
	// Object getArgs() 클라이언트가 메소드를 호출할 때 넘겨준 인ㅇ자 목록을 Object 타입으로 리턴
	
	// getSignature 객체가 제공하는 메소드
	// getName() 클라이언트가 호출한 메소드 이름
	// toLongString 클라이언트가 호출한 메소드 리턴, 이름, 매개변수를 패키지 경로까지 포함하여 리턴
	// toShortString 클라이언트가 호출한 메소드 시그니처를 축약한 문자열로 리턴.
	
	@Pointcut("execution(* com.Quick.biz..*impl.*(..))")
	public void allPointcut() {}
	
	@Before("allPoincut()")
	public void BeforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[사전 처리] "+ method +"() 메소드 정보 ARGS 정보: "+args[0].toString());
	}
}
