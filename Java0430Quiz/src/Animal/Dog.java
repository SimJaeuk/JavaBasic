package Animal;
class Dog extends Animal{
	String type; //�� ����
	public Dog(String name, String type) {
		super(name);this.type = type;
	}
	public void bark() {
		System.out.println("�۸�!");
	}
	public String toString() {
		return type + "�� "+getName();
	}
	
}