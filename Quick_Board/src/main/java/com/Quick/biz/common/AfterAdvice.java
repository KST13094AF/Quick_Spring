package com.Quick.biz.common;

public class AfterAdvice {
	//<aop:after> try ���� finally ��� ó�� ������ ����Ǵ� �����̽� 
	//���ܰ� �߻��� ��Ȳ���� ����Ʈ �� ȣ�� �� ���� ���� ����ȴ�.
	public void finallyLog() {
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ������ ���ۤ�");
	}
}
