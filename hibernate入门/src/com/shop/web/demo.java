package com.shop.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shop.domain.User;

public class demo {
	public static void main(String[] args) {
		addUser();
	}
	
   public static void addUser() {
	   Configuration conf = new Configuration().configure();
	   
	   SessionFactory sessionfactory = conf.buildSessionFactory();
	   
	   Session session = sessionfactory.openSession();
	   
	   //开启事务
	   Transaction tx = session.beginTransaction();
	   
	   //操作数据库
	   for(int i=0;i<12;i++) {
	   User user = new User();
	   user.setName("你爹我"+i);
	   user.setSex("是你爸爸"+i);
	   session.save(user);
	   }
	   //执行事务
	   tx.commit();
	   
	   //关闭资源
	   session.close();
	   sessionfactory.close();
   }
   
   public static void findUser() {
	   Configuration conf = new Configuration().configure();
	   
	   SessionFactory sessionfactory = conf.buildSessionFactory();
	   
	   Session session = sessionfactory.openSession();
	   
	   //开启事务
	   Transaction tx = session.beginTransaction();
	   
	   //操作数据库
	   //User user = new User();
	   
	   User user = session.get(User.class, 2);
	   System.out.println(user);
	   //执行事务
	   tx.commit();
	   
	   //关闭资源
	   session.close();
	   sessionfactory.close();
   }
   
   public static void updateUser() {
	   Configuration conf = new Configuration().configure();
	   
	   SessionFactory sessionfactory = conf.buildSessionFactory();
	   
	   Session session = sessionfactory.openSession();
	   
	   //开启事务
	   Transaction tx = session.beginTransaction();
	   
	   //操作数据库
	   //User user = new User();
	   
	   User user = session.get(User.class, 4);
	   user.setName("傻狗");
	   user.setSex("睿智");
	   session.update(user);
	   //执行事务
	   tx.commit();
	   
	   //关闭资源
	   session.close();
	   sessionfactory.close();
   }
   
   public static void deleteUser() {
	   Configuration conf = new Configuration().configure();
	   
	   SessionFactory sessionfactory = conf.buildSessionFactory();
	   
	   Session session = sessionfactory.openSession();
	   
	   //开启事务
	   Transaction tx = session.beginTransaction();
	   
	   //操作数据库
	   //User user = new User();
	   
	   User user = session.get(User.class, 6);

	   session.delete(user);
	   //执行事务
	   tx.commit();
	   
	   //关闭资源
	   session.close();
	   sessionfactory.close();
   }
   
   public static void practiceDemo() {
	   
	   Configuration conf = new Configuration().configure();
	   
	   SessionFactory sessionfactory = conf.buildSessionFactory();
	   
	   Session session = sessionfactory.openSession();
	   
	   //开启事务
	   Transaction tx = session.beginTransaction();
	   
   }
}
