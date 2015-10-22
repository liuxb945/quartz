package com.lailaihui.quarz.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @description job testcase
 * @author Administrator
 *
 */
public class QuarzTestCase {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:spring/spring-config-quarz.xml"});
		 context.getBean("springQuarzJobFactory");
	}

}
