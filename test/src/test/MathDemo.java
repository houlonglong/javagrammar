package test;

public class MathDemo {

	public static void main(String[] args) {
	  int x = 4;
	  System.out.println(x);
	  int y = (x++)+5;
	 System.out.println("x = "+ x+",y="+y);
	 
	 //++x
	 x = 4;
	 y=(++x)+5;
	 System.out.println("x = "+ x+",y="+y);
	 
	 x = 4;
	 y=(x--)+5;
	 System.out.println("x = "+ x+",y="+y);
	 
	 //--x
	 x = 4;
	 y=(--x)+5;
	 System.out.println("x = "+ x+",y="+y);
	}

}
