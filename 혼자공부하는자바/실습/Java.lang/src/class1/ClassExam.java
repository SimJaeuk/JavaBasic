package class1;

public class ClassExam {

	public static void main(String[] args) throws Exception {
		//1
		Class clazz = Car.class;
		
		//2
		//Class clazz = Class.forName("class1.Car");
		
		//3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

}
