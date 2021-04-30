package Animal;
//13-2
public class AnimalTest2 {
	
	public static void main(String[] args) {
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치","치와와");
		a[1] = new Cat("마이클",7);
		
		System.out.print(a[0].getName() + " ");
		a[0].bark();
		System.out.print(a[1].getName()+" ");
		a[1].bark();
	
	}
	
}
