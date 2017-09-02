package com.iomooc.flow1;

import java.security.PublicKey;

public class SumDemo {
	public static void main(String[] arg){
		 int num = 1;
		 int sum = 0;
		 while(num <= 5){
			 sum +=num*num;
			 num++;
		 }
		 System.out.println(sum);
	}
  
}
