package runtimeException;

public class ClassCastExceptionExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal; //Cat 객체를 매개값으로 주어서 Dog 타입으로 변환할 수 없음

	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}