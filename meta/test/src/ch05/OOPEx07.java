package ch05;


//�߻� Ŭ����
abstract class Animal {
	abstract void speak(); // �߻�޼��� (��ü{}�� ����)
	
	void Hello() {
		System.out.println("!!!");
	}
}

class Dog extends Animal{
	// �������̵� (Animal�� speak ��ȿ)
	void speak() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	// �������̵� (Animal�� speak ��ȿ)
	void speak() {
		System.out.println("�߿�");
	}
}

class Bird extends Animal {
	void speak() {
		System.out.println("±±");
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		
		a1.speak(); // �������ε� �ȴ�. -> �θ��� �޼��尡 ��ȿȭ�Ǳ⶧��
		a2.speak();
		a3.speak();
		
	}

}
