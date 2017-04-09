package com.blue.main;

public class Main  extends Person {
	int age = 16;
	public void test(){
	System.out.println("person age:"+ age);
	System.out.println("person age:"+ super.age);
	}
	
	//重写
	@Override
	public void speak() {
		System.out.println("测试方法重写");
	}
}
