package demo14;

public class Person {
	int age;
	float heigt = 1.8f;
	double weight = 160;
	private int result;
	void eat(){
		System.out.println("eat");
	}
	void sellp(){
		System.out.println("sellp");
	}
	int eatCount(){
		return 1;
	}
	int eatCount2(int num){
		  int result = num-2;
		  return result;
	}
	int getAge(int age){
		return this.age;
	}
}
