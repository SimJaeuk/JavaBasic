package Animal;
//13-2
public class AnimalTest2 {
	
	public static void main(String[] args) {
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("��ġ","ġ�Ϳ�");
		a[1] = new Cat("����Ŭ",7);
		
		System.out.print(a[0].getName() + " ");
		a[0].bark();
		System.out.print(a[1].getName()+" ");
		a[1].bark();
	
	}
	
}
