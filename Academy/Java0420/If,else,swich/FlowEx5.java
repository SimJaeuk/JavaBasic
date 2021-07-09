import java.util.*;

public class FlowEx5 {

    public static void main(String[] args) {
        int score = 0; // 점수저장
        char grade = ' ', opt = ' '; // 학점 저장. 공백 초기화

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 입력값 score에 저장
        
        if (score >= 90) {                     
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            }else if (score < 94) {
                opt = '-';
            }
        }else if (score >=80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            }else if (score < 84) {
                opt = '-';
            }
        }else if (score >=70){
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.printf("당신의 학점은 %c%c 입니다.%n", grade, opt);
    }
    
}

    

