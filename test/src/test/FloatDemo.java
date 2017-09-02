package test;

public class FloatDemo {
	public static void main(String[] args){
		//定义一个单精度度浮点型变量，存放123.328
		float f = 123.328f;
		System.out.println("f=" +f);
		//定义一个双精度度浮点型变量，存放123.328
		double d = 5623.454;
		System.out.println("d=" +d);
		//将征信赋值给浮点型
		double d1 = 123l;
		System.out.println(d1);
		//变量间的赋值
		double d2 = d;
		System.out.println("d2=" +d2);
		char a = 'a';
		System.out.println("a=" + a);
		char ch = 65535;
		System.out.println("ch=" + ch);
		
		//定义变量存放unicode编码表示的字符
		char c = '\u005d';
		System.out.println("c=" + c	);
		
		
		   	int m = 10;
		      double n = 5.0;
		      
		    //变量m的值加3，n的值加5
		    
		        m = m+ 3;
		        n = n +5;
		       	System.out.println(m);
		       	System.out.println(n);
		    //求m和n的平均值，并将结果存于变量p中
		    
		       	double p = (m+n) / 2;
		        System.out.println(p);
		    //求m的平方乘以n的平方，并将结果存于变量q中
		    
		        double q = m * m *( n * n);
		        System.out.println(q);
		    //将p和q的值打印输出
	}
}
