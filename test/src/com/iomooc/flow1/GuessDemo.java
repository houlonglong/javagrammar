package com.iomooc.flow1;

import java.util.Scanner;

public class GuessDemo {
	public static void main(String[] args) {
		int number = (int)(Math.random()*10+1);
		//System.out.println(number);
		int guess;
		System.out.println("��һ������1��10֮�����");
		do{
			System.out.println("����������");
			guess = new Scanner(System.in).nextInt();
			if(guess > number){
				System.out.println("̫��");
			}else if(guess < number){
				System.out.println("̫С");
			}
		}while(guess!= number);
		System.out.println("������ˣ���Ϊ"+number);
	}
}
