
public class Demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setRadius(12.5);
		
		Ladder ladder = new Ladder(10,20,15);
		
		People people = new People();
		System.out.println("people计算的面积"+ people.computerArea(circle));
		System.out.println("people计算的梯形面积"+ people.computerArea(ladder));
		Test test = new Test();
	    test.speek(3);
	}

}

class Test {
	double a =4;
	void speek(double a){
		System.out.println("a" + this.a);
		
	}
}