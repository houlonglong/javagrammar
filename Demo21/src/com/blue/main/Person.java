package com.blue.main;
import com.red.main.*;;

public class Person {
	public void speak () {
		Jack jack = new Jack();
		if(jack instanceof Jack){
			System.out.println("����Jack��");
		}
		if(jack instanceof Person){
			
		}System.out.println("����Person��");
	}
}
