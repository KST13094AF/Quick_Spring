package com.Quick.biz.common;

public class AfterAdvice {
	//<aop:after> try ���� finally ��� ó�� ������ ����Ǵ� �����̽�
	public void finallyLog() {
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ������ ���ۤ�");
	}
}
