package com.Quick.biz.common;

public class AfterReturningAdvice {
	//<aop:after-Returning> ����Ͻ� �޼ҵ尡 ȣ�� �� �� ������� ������ �� ����
	public void afterLog() {
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ����");
	}
}
