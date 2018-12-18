package com.shop.web;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shop.domain.User;

public class demo2 {
   public static void main(String[] args) {
	   findUser();
   }

private static void findUserList() {
	// TODO Auto-generated method stub
	Session session = HibernateTools.getSession();
	
	//开启事务
	Transaction tx = session.beginTransaction();
	
	//hibernate query language查询语句
	
	String sql ="from com.shop.domain.User";//此处包可以省略 也可写成"from User"
	
	Query query = session.createQuery(sql);
	
	List<User> list = query.list();
	
    for(User user : list) {
    	System.out.println(user);
    } 
    
    tx.commit();
    
    HibernateTools.sessionfactory.close();
    session.close();
    
}
    public static void findUser() {
	   
    	Session session = HibernateTools.getSession();
    	//开启事务
    	Transaction tx = session.beginTransaction();
    	//hql操作语句
    	String sql = "from User where uid=?";
    	
    	Query query = session.createQuery(sql);
    	
    	query.setInteger(0, 7);
    	
    	//使用查询对象查询结果返回
    	User user = (User) query.uniqueResult();
    	
    	System.out.println(user);
    	
    	tx.commit();
    	
    	HibernateTools.sessionfactory.close();
    	session.close();
    	
    	
    }
}
