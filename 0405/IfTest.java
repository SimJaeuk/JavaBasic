public class IfTest {
    public static void main(String[] args) {
    
    int money = 2000;
    boolean hasCard = true;

    if (money >= 3000 || hasCard) {
         System.out.println("택시를 타고 가라");
    }else {
         System.out.println("걸어가라");
    }
    }
}
/*
| , || -> OR

| -> 둘다 따져서 결과 도출
|| -> 앞에서 트루 발생 시 하나만 따져서 결과 도출
True | False -> True   1개 확인
True | True  -> True   1개 확인
False | Ture -> True   2개 확인
False | False -> False 2개 확인

& , && -> AND

& -> 둘다 따져서 결과 도출
&& -> 앞에서 펄스 발생 시 하나만 따져서 결과 도출
True & False -> Flase   2개 확인
True & True  -> True    2개 확인
False & Ture -> Flase   1개 확인
False & False -> False  1개 확인

결론 -> 두개쓰자
*/