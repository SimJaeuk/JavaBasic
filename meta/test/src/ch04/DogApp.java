package ch04;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog(); // heap°ø°£¿¡ ¶ç¿ò
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		// -> 1³â°æ°ú, ³ë¶õ»ö ¿°»ö, ÀÌ¸§ º¯°æ
		
		d1.age = d1.age + 1;
		d1.color = "³ë¶õ»ö";
		d1.name = "´ó´ó";
		//d1.type = "Çªµé";
		
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
	}

}
