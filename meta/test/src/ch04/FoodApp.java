package ch04;

public class FoodApp {

	public static void main(String[] args) {
		
		Food 치킨 = new Food("치킨", 2000);
		Food 피자 = new Food("피자", 5000); 
		
		치킨.myPrint();
		피자.myPrint();
	}

}
