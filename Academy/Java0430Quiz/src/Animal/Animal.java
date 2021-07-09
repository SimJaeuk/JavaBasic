package Animal;
// 13-1
abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void bark();
	
	public String getName() {
		return name;
	}
	public void introduce() {
		System.out.print(toString()+"¿Ã¥Ÿ. ");
		bark();
	}
	
	
}