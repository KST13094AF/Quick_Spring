package com.Quick.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	// <aop:around> ����Ͻ� �޼ҵ� ���� ��, �Ŀ� ��� �����Ѵ�.
	// around �����̽��� Ŭ���̾�Ʈ�� �޼ҵ� ȣ���� ����æ��. �׷����� �޼ҵ� ȣ�� ��, �Ŀ� ���� ���� ó���� �� �� �ְ� �ȴ�.
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[BEFORE]: ����Ͻ� �޼ҵ� ���� �� ó���� ����...");
		Object returnObj = pjp.proceed();
		System.out.println("[AFTER]: ����Ͻ� �޼ҵ� ���� �� ó���� ����...");
		return returnObj;
	}
}
