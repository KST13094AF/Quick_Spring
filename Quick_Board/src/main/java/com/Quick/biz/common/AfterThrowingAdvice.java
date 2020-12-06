package com.Quick.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	//<aop:after-throwing> ����Ʈ ������ ������ �޼ҵ尡 ���� �� ���ܰ� �߻����� �� ����ȴ�.
	// ��� ���ܸ� ���� �� �ְ� �ϱ����� �ֻ��� Exception�� �Ű������� �Ѵ�.
	public void afterThrowingLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[���� ó��]"+method+"() �޼ҵ� ���� �� �߻��� ���� �޼���:" +exceptObj.getMessage());
	}
}
