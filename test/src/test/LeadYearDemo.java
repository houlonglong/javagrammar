package test;

import java.time.Year;
import java.util.Scanner;

public class LeadYearDemo {
	public static void main(String[] agrs){
		System.out.println("请输入年份");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0 && (year%100!= 0 || (year%400 == 0))){
			System.out.println("你输入的是闰年");
		}else{
			System.out.println("你输入的不是闰年");
		}
	}

	
}
