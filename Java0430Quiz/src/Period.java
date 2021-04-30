//// 9-7 시작일과 종료일로 구성되는 '기간' 클래스 Period를 작성하자.
//
//public class Period {
//	//변수
//	private Day from;
//	private Day to;
//	
//	// 생성자
//	public Period(Day from, Day to) {
//		this.from = new Day(from);
//		this.to = new Day(to);
//	
//	// 메서드
//	public Day getFrom() {
//		return new Day(from);
//		}
//	public Day getTo() {
//		return new Day(to);
//		}
//	
//	public String toString() {
//		return "{" + from + "~" + to + "}";
//	}
//	}
//
//}
//
//class Period2 {
//	public static void main(String args) {
//		Period taejo = new Period(new Day(1392,8,5),Day(1398,10,14));
//		
//		System.out.println("태조 = "+ taejo);
//	}
//}
