package com.iomooc.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1;//����ѭ��
		int n = 1; //����ѭ��
		//����ѭ�������������
		while(m<=10){
			//����ѭ������ÿ����������Ǻ�
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
