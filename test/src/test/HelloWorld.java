package test;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		System.out.println("這個工具不錯");
		
		int x = -2, y = 0;
		//如果x大于0，则y的值为2*x+1
		if(x>0){
		    y=2*x+1;
		}else{
		    y= x +5;
		}
		//否则y的值为x+5
		System.out.println(y,x);
	}

}
