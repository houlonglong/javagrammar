package com.iomooc.flow1;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "������������λ�ϵ�����֮��Ϊ12����Ϊ42��\n";
		for(int i=200;i<=300;i++){
			int ge = i%100%10;
			int shi = i%100/10;
			int bai = i/100;
			System.out.println(bai	);
			if(ge+shi+bai==12&&ge*shi*bai==42){
				res += i+"\n";
			}
		}
		System.out.println(res);
	}

}
