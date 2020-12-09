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
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}
/*
 *  ������̼����� ����Ʈ ���� ������ �� @Pointcut�� ����ϸ� �ϳ��� Ŭ���� �ȿ��� ���� ���� ����Ʈ ���� ������ �� �ִ�.
 *  ���� ����Ʈ ���� �ĺ��ϱ� ���� �ĺ��ڴ� ���� �޼ҵ� -> ���� ������ ���� �޼ҵ� ����Ʈ ���� �ĺ��ϴ� �̸����θ� ���ȴ�.
 */
