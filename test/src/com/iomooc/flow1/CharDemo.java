package com.iomooc.flow1;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		int count = 1;
		while(ch <='z'){
			System.out.print(ch+" ");
			if(count%13 ==0) System.out.println();
			count++;
			ch++;
		}
	}

}
