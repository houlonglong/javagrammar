package com.blue.main;

public class Main  extends Person {
	int age = 16;
	public void test(){
	System.out.println("person age:"+ age);
	System.out.println("person age:"+ super.age);
	}
	
	//��д
	@Override
	public void speak() {
		System.out.println("���Է�����д");
	}
}
