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
		tv2.powerOn();
		tv2.powerOff();
		tv2.volumUp();
		tv2.volumDown();
		
		System.out.println("-------------------");
		TV tv3 = (TV)fatory.getBean("tv3");
		tv3.powerOn();
		tv3.powerOff();
		tv3.volumUp();
		tv3.volumDown();
		
		System.out.println("-------------------");
		TV tv4 = (TV)fatory.getBean("LgTv");
		tv4.powerOn();
		tv4.powerOff();
		tv4.volumUp();
		tv4.volumDown();
		
		System.out.println("-------------------");
		TV tv5 = (TV)fatory.getBean("HansungTv");
		tv5.powerOn();
		tv5.powerOff();
		tv5.volumUp();
		tv5.volumDown();
		
		fatory.close();
	}
}
