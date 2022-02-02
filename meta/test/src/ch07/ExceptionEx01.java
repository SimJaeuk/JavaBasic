package ch07;

class Gun {
	void shoot() {
		System.out.println("총을 발사했습니다.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// 컴파일 예외 (Java가 알 수 있음)
		try {
			System.out.println("잠자기 시작");
			Thread.sleep(1000); // 메인스레드 1초동안 재우기
			System.out.println("잠자기 끝");
		} catch (InterruptedException e) { // 방해
			e.printStackTrace();
		}
		
		// 런타임 예외 (개발자가 알 수 있음)
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[3]); // 강제 종료	
		} catch (RuntimeException e) {
			// catch의 역할 -> try중 예외 발생 시 어떻게 처리할지 정의하는 영역
			System.out.println("괜찮아 그냥 진행해");
			System.out.println(e.getMessage()); // 로그 파일 남겨두거나 데이터베이스에 저장 해야함
			e.printStackTrace();
		}
		
		Gun s = null;
		
		try {
			s.shoot();
		} catch (RuntimeException e) {
			System.out.println("총이 없어서 총을 만들고 다시 시도하겠습니다.");
			s = new Gun();
			s.shoot();
		}
		System.out.println("메인 스레드 종료");	
	}
}