package Animal;

public class AnimalTest3 {

	public static void main(String[] args) {
		Animal[] a = new Animal[2];
		a[0] = new Dog("��ġ","ġ�Ϳ�");
		a[1] = new Cat("����Ŭ",7);
		
		for (int i = 0 ; i < a.length ; i++) {
			System.out.println("a["+i+"]="+ a[i]);	
		}
		
		for (int i = 0 ; i < a.length ; i++) {
			System.out.print("a["+i+"]=");	
			a[i].introduce();
		}
		
	}

}