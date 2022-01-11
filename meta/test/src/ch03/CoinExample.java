package ch03;

public class CoinExample {

	public static void main(String[] args) {
		// 최소 동전구하기 500, 100, 50, 10
		int money = 4990;
		int restMoney = money;
		
		// 변수명 첫 글자가 숫자가 될 수 없다.
		
		
		// 스탭 1
		int count500 = restMoney/500;
		System.out.println("500원 : " + count500); // 180원 남음
		restMoney = restMoney%500;
		System.out.println("남은금액 : " + restMoney);
		
		
		// 스탭 2
		int count100 = restMoney/100;
		System.out.println("100원 : " + count100);
		restMoney = restMoney%100;
		System.out.println("남은금액 : "+ restMoney);
		
		
		// 스탭 3
		int count50 = restMoney/50;
		System.out.println("50원 : " + count50);
		restMoney = restMoney%50;
		System.out.println("남은금액 : "+ restMoney);
		
		
		// 스탭 4
		int count10 = restMoney/10;
		System.out.println("50원 : " + count10);
		restMoney = restMoney%10;
		System.out.println("남은금액 : "+ restMoney);
		
		
		
		
		
		
		// 마무리
		System.out.println("===========================");
		System.out.println(money +"의 최소동전 개수는?");
		System.out.println("500원" + count500 +"개");
		System.out.println("100원" + count100 +"개");
		System.out.println("50원" + count50 +"개");
		System.out.println("10원" + count10 +"개");
		System.out.println("===========================");
		
	}

}
