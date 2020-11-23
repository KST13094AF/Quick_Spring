package com.spring.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean listBean = (CollectionBean)factory.getBean("CollectionBean");
		List<String> list = listBean.getList();
		for(String l : list) {
			System.out.println(l.toString());
		}
		
		CollectionBean_Set cSet = (CollectionBean_Set)factory.getBean("CollectionSet");
		Set<String> set = cSet.getSet();
		for(String l : set)
			System.out.println(l.toString());
		
		CollectionMap cMap = (CollectionMap)factory.getBean("CollectionMap");
		Map<String,String> map = cMap.getMap();
		for(String i : map.keySet()) {
			System.out.println(i.toString());
			System.out.println(map.get(i.toString()));
		}
		
		
		factory.close();
	}

}
