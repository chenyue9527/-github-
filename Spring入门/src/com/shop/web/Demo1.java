package com.shop.web;

import javax.jws.soap.SOAPBinding.Use;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.domain.CollectionBean;
import com.shop.domain.User;

public class Demo1 {
   
  
  
  @Test
  public void fun1()
  {
  
	 /* User user = new 	User();
	  user.setName(121);
	  System.out.println(user);*/

	  
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 CollectionBean cb = (CollectionBean) context.getBean("cb");

	 System.out.println(cb);
  }
  
  
  
}
