package demo15;

public class Person {
	int age;
	String speak = "ËµÄãÂğ";
	float height;
	Person(int age){
		this.age = age;
	}
	Person(float height){
		this.height = height;
	}
	Person(){
		
	}
	void speak(){
		System.out.println(this.speak);
	}
}
