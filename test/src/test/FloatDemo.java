package test;

public class FloatDemo {
	public static void main(String[] args){
		//����һ�������ȶȸ����ͱ��������123.328
		float f = 123.328f;
		System.out.println("f=" +f);
		//����һ��˫���ȶȸ����ͱ��������123.328
		double d = 5623.454;
		System.out.println("d=" +d);
		//�����Ÿ�ֵ��������
		double d1 = 123l;
		System.out.println(d1);
		//������ĸ�ֵ
		double d2 = d;
		System.out.println("d2=" +d2);
		char a = 'a';
		System.out.println("a=" + a);
		char ch = 65535;
		System.out.println("ch=" + ch);
		
		//����������unicode�����ʾ���ַ�
		char c = '\u005d';
		System.out.println("c=" + c	);
		
		
		   	int m = 10;
		      double n = 5.0;
		      
		    //����m��ֵ��3��n��ֵ��5
		    
		        m = m+ 3;
		        n = n +5;
		       	System.out.println(m);
		       	System.out.println(n);
		    //��m��n��ƽ��ֵ������������ڱ���p��
		    
		       	double p = (m+n) / 2;
		        System.out.println(p);
		    //��m��ƽ������n��ƽ��������������ڱ���q��
		    
		        double q = m * m *( n * n);
		        System.out.println(q);
		    //��p��q��ֵ��ӡ���
	}
}
