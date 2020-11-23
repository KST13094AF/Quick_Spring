package Tv;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {
	
	public static void main(String[] args) {
		AbstractApplicationContext fatory = new GenericXmlApplicationContext("applicationContext.xml");
		// applicationContext.xml BeanFactory가 제공하는 bean 관리, 트랜젝션, 메시지 기반 다국어 처리 지원
		// GenericXmlApplicationContext 객체가 생성되어 스프링 컨테이너가 구동됨
		// New -> Other -> Spring -> Spring Bean Configuration File 생성
		
		System.out.println("-------------------");
		TV tv = (TV)fatory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		// 필요한 객체 bean 에서 설정한 객체 Lookup 
		
		System.out.println("-------------------");
		TV tv2 = (TV)fatory.getBean("tv2");
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		
		fatory.close();
	}
}
