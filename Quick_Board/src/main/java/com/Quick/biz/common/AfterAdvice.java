package com.Quick.biz.common;

public class AfterAdvice {
	//<aop:after> try 구문 finally 블록 처럼 무조건 수행되는 어드바이스
	public void finallyLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작ㄱ");
	}
}
