
public class Demo17 {

	public static void main(String[] args) {
		Ladder.bottom = 100;
		Ladder ladder1 = new Ladder();
		Ladder ladder2 = new Ladder();
		ladder1.setTop(50);
		ladder2.setTop(60);
		System.out.println(ladder1.top);
		System.out.println(ladder2.top);
		System.out.println(ladder1.getBottom());
		System.out.println(ladder2.getBottom());
		System.out.println(Sum.getSum(1, 50));
	}
}

class Sum{
	static int getSum(int start,int end){
		int sum = 0;
		for(int i = start;i< end ; i++){
			//sum = i +sum
			sum+= i;
		}
		return sum;
	}
}
