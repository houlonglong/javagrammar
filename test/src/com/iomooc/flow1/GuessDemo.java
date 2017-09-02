package com.iomooc.flow1;

import java.util.Scanner;

public class GuessDemo {
	public static void main(String[] args) {
		int number = (int)(Math.random()*10+1);
		//System.out.println(number);
		int guess;
		System.out.println("猜一个介于1到10之间的数");
		do{
			System.out.println("请输入数字");
			guess = new Scanner(System.in).nextInt();
			if(guess > number){
				System.out.println("太大");
			}else if(guess < number){
				System.out.println("太小");
			}
		}while(guess!= number);
		System.out.println("你猜中了！答案为"+number);
	}
}
