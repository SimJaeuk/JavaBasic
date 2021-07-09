public class ConstantExam {

    public static void main(String[] args) {
        // 변수 (값이 바뀔 수 있음)
        int i;
        i = 10; 
        i = 5;
        System.out.println(i);
        
        // final -> 상수(변하지 않는 값)
        // 대문자로만 구성된 명사로 정한다.
        // 여러 단어로 구성된 이름의 경우 단어 사이에 '_'를 써서 구분한다.
        final double PI = 3.14159;
        int radius = 3;
        double result = radius * 2 * PI;
        System.out.println(result);
        
        
    }
}