package test;

import java.net.Inet4Address;

public class VarDemo {

	public static void main(String[] args) {
	    //定义两个整形变量；
		int x1 = 1;
		int x = 0,y = 1;
		System.out.println(x +""+y);
		System.out.println("x1="+x1);
		//关于换行的问题
		System.out.print("++++++++++++++++"+"\n");
		System.out.print(x);
		System.out.print("\t"+y);
		System.out.print('\t'+y + "=========\n");
		System.out.println("\'"+x+"'");
		int n = 3 ;
		//短路运算符
		boolean b=(3>7&&(n++)<2);
		System.out.println(b);
		System.out.println(n);
		int num = 3 ;
		boolean d = (3<7)||((num++)<2);
		System.out.println(d+" "+num);
		
		   int num1 = 10;
		   int num2 = 5 ;
		   int result ;
		   result = num1 + num2;
		   System.out.println(result);
		
		   
		   
	}

}
