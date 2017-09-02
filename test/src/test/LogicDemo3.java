package test;

import java.util.Scanner;

public class LogicDemo3 {

	public static void main(String[] args) {
//		// 输入一个整数
//		System.out.println("请输入一个整数：");
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc);
//		int n = sc.nextInt();
//		if(!(n%3 == 0)){
//			System.out.println("不可以");
//		}else{
//			System.out.println("可以");
//		}
		
	 int i = 9,j = 8,k=6,m=10;
	 System.out.println((!(i>j)));
	 System.out.println((m<k++));
	 System.out.println(k);
	 if(!(i>j)||m<k++){
		 System.out.println((k));
		 k--;
	 }else{
		 System.out.println((k));
		 k++;
		
	 }
	 System.out.println(k);
	}

}
