package com.Quick.biz.common;

public class AfterThrowingAdvice {
	//<aop:after-throwing> ����Ʈ ������ ������ �޼ҵ尡 ���� �� ���ܰ� �߻����� �� ����ȴ�.
	public void afterThrowingLog() {
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ���� �߻�");
	}
}
