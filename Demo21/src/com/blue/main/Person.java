package com.blue.main;
import com.red.main.*;;

public class Person {
	public void speak () {
		Jack jack = new Jack();
		if(jack instanceof Jack){
			System.out.println("属于Jack类");
		}
		if(jack instanceof Person){
			
		}System.out.println("属于Person类");
	}
}
