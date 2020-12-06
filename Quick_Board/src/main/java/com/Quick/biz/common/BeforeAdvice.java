package com.Quick.biz.common;

public class BeforeAdvice {
	// <aop:before>
	public void BeforeLog() {
		System.out.println("[사전 처리] 비즈니스 로직 수행 전.");
	}
}
