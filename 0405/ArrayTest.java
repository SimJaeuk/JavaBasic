public class ArrayTest {    
    public static void main(String[] args) {
        String[] weeks = {"월","화","수","목","금","토","일"};
        for (int i =0; i<weeks.length; i++) {
            System.out.println(weeks[i]);

            // System.out.println(weeks[7]);
            // 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 
            // 오류가 발생한다.
        }
    }
}
// 배열의 길이는 고정되있다 -> 만들 때 반드시 길이값 필요

