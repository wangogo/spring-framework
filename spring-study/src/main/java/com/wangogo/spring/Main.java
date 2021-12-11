package com.wangogo.spring;

import com.wangogo.spring.bean.MyTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-study.xml");

		MyTestBean bean = (MyTestBean) ctx.getBean("myTestBean");
		System.out.println(bean);
	}
}
