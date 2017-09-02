package com.iomooc.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1;//外重循环
		int n = 1; //内重循环
		//外重循环控制输出几行
		while(m<=10){
			//内重循环控制每行输出几个星号
			n=1;
			while(n<=m){
				System.out.print("*");
				n++;
			}
			System.out.println();
			m++;
		
		}
	}

}
