package demo15;

public class Demo15 {

	public static void main(String[] args) {
		 Person tom;
		 tom = new Person(10);
		 Person bob = new Person(1.8f);
		 System.out.println("tom age:" + tom.age);
		 System.out.println("bob height:" + bob.height);
		 tom.speak();
		 bob.speak();
		 //不要使用空对象
//		 tom = null;
//		 tom.speak();
		 tom = bob;
		 System.out.println("tom height:" + tom.height);
	}

}
