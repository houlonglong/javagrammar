package demo16;

public class Demo16 {
	public static void main(String[] args){
		Computer computer = new Computer();
		int result = computer.getSum(9,99,999,999,9999,999999,999999);
		System.out.println("9+99+999+9999999+999999+999999="+result);
	}
}
