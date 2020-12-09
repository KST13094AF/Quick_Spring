package com.Quick.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
//@Aspect
public class LogAdvice {
	//@Pointcut("execution(* com.Quick.biz..*impl.*(..))")
	public void allPointcut() {}
	
	//@Pointcut("execution(* com.Quick.biz..*impl.*(..))")
	public void getPointcut() {}
	
	//@Before("allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
}
/*
 *  어노테이션으로 포인트 컷을 선언할 때 @Pointcut을 사용하며 하나의 클래스 안에서 여러 개의 포인트 컷을 선언할 수 있다.
 *  여러 포인트 컷을 식별하기 위한 식별자는 참조 메소드 -> 구현 로직이 없는 메소드 포인트 컷을 식별하는 이름으로만 사용된다.
 */
