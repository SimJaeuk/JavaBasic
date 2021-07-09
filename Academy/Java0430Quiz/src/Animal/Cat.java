package Animal;
class Cat extends Animal{
	int age;
	public Cat(String name, int age) { //생성자
		super(name);this.age = age;
	}
	
	public void bark() {               //울기
		System.out.println("냐옹!");
	}
	
	public String toString() {
		return age + "살의 "+getName();
	}
	
}