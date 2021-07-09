import java.util.Scanner;

public class DowhileExam {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);

            do{
                value = scan.nextInt();
                System.out.println("입력받은 값:" + value);
            }while(value !=10);
            System.out.println("반복문 종료!!");

//do while 문은 조건에 상관없이 무조건 한 번은 실행해 줌

    }
    
}