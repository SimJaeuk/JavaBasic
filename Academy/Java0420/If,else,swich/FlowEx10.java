import java.util.*;

public class FlowEx10 {
    public static void main(String[] args) {
        int score =0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요. (1~100)>");
        
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); 
        score = Integer.parseInt(tmp); // 입력받은 문자열 숫자로 변환

        // int score = scanner.nextInt();

        switch(score/10) {              // 자리수 하나 날려버리기
            case 10:
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default :
                grade = 'F';
        }

        System.out.println("당신의 학점은 "+ grade +"입니다.");
        
    }
    
}
