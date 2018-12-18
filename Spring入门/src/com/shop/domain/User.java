package com.shop.domain;

public class User {
	private int id;
	private String name;
	private int age;
	private Car car;

	public int getId() {
		return id;
	}

	/*public User(String name, Car car) {
		System.out.println("User(String name, Car car).....");
		this.name = name;
		this.car = car;
	}
	public User(Car car,String name) {
		System.out.println("User(Car car,String name)....");
		this.name = name;
		this.car = car;
	}
	public User(Integer name, Car car) {
		System.out.println("User(Integer name, Car car)");
		this.name = name+"";
		this.car = car;
	}*/

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}
