package ch05;


//추상 클래스
abstract class Animal {
	abstract void speak(); // 추상메서드 (몸체{}가 없다)
	
	void Hello() {
		System.out.println("!!!");
	}
}

class Dog extends Animal{
	// 오버라이드 (Animal의 speak 무효)
	void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	// 오버라이드 (Animal의 speak 무효)
	void speak() {
		System.out.println("야옹");
	}
}

class Bird extends Animal {
	void speak() {
		System.out.println("짹짹");
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		
		a1.speak(); // 동적바인딩 된다. -> 부모의 메서드가 무효화되기때문
		a2.speak();
		a3.speak();
		
	}

}
