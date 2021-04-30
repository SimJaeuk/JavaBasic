package Animal;
class Dog extends Animal{
	String type; //°³ Á¾·ù
	public Dog(String name, String type) {
		super(name);this.type = type;
	}
	public void bark() {
		System.out.println("¸Û¸Û!");
	}
	public String toString() {
		return type + "ÀÇ "+getName();
	}
	
}