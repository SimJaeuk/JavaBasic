package Animal;
class Cat extends Animal{
	int age;
	public Cat(String name, int age) { //������
		super(name);this.age = age;
	}
	
	public void bark() {               //���
		System.out.println("�Ŀ�!");
	}
	
	public String toString() {
		return age + "���� "+getName();
	}
	
}