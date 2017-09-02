package com.iomooc.flow1;

import java.util.Scanner;

import test.white;

public class NumberInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		while(true){
			n = scanner.nextInt();
			if(n == 0){
				break;
			}
			System.out.println(n);
		}
	}

}
