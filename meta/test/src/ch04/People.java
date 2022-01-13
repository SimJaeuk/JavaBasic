package ch04;


//this는 자기 자신의 heap공간을 가르킨다.
public class People {
	String name;
	int age;
	
	public People(String name, int age) {
		System.out.println("People 메서드 스택 name: " + name);
		System.out.println("People 메서드 스택 age: " + age);
		
		this.name = name;
		this.age = age;
	}
}
