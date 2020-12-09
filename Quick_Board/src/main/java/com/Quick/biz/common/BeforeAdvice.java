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
	// joinPoint �������̽� 
	// Signature getSignature() Ŭ���̾�Ʈ�� ȣ���� �޼ҵ��� �ñ״�ó (���� Ÿ��, �̸�, �Ű�����) ������ ����� Signature ��ü ����
	// Object getTarget() Ŭ���̾�Ʈ�� ȣ���� ����Ͻ� �޼ҵ带 �����ϴ� ����Ͻ� ��ü ����
	// Object getArgs() Ŭ���̾�Ʈ�� �޼ҵ带 ȣ���� �� �Ѱ��� �Τ��� ����� Object Ÿ������ ����
	
	// getSignature ��ü�� �����ϴ� �޼ҵ�
	// getName() Ŭ���̾�Ʈ�� ȣ���� �޼ҵ� �̸�
	// toLongString Ŭ���̾�Ʈ�� ȣ���� �޼ҵ� ����, �̸�, �Ű������� ��Ű�� ��α��� �����Ͽ� ����
	// toShortString Ŭ���̾�Ʈ�� ȣ���� �޼ҵ� �ñ״�ó�� ����� ���ڿ��� ����.
	
	@Pointcut("execution(* com.Quick.biz..*impl.*(..))")
	public void allPointcut() {}
	
	@Before("allPoincut()")
	public void BeforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[���� ó��] "+ method +"() �޼ҵ� ���� ARGS ����: "+args[0].toString());
	}
}
