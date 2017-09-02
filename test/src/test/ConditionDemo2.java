package test;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 0;
		Scanner s =new Scanner(System.in);
		for(int i=0;i<10;i++){
			int n = s.nextInt();
			if((n%2==0)){
				System.out.println("Å¼Êý");
			}else{
				System.out.println("ÆæÊý");
			}
		}
	

	}

}
