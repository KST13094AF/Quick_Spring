package com.Quick.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	// <aop:around> ����Ͻ� �޼ҵ� ���� ��, �Ŀ� ��� �����Ѵ�.
	// around �����̽��� Ŭ���̾�Ʈ�� �޼ҵ� ȣ���� ����æ��. �׷����� �޼ҵ� ȣ�� ��, �Ŀ� ���� ���� ó���� �� �� �ְ� �ȴ�.
	// around �����̽��� JoinPoint �������̽��� �ƴ� ProceedingJoinPoing ��ü�� �Ű������� �޾ƾ� �Ѵ�.
	// 
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object obj = pjp.proceed();
		
		stopWatch.stop();
		System.out.println(method +"() �޼ҵ� ���࿡ �ɸ� �ð� :" +stopWatch.getTotalTimeMillis()+"(ms) ��");
		
		return obj;
	}
}
