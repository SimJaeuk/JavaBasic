import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요");
        int input = sc.nextInt();
        String inputString = "";
        // next - 단어
        // nextLine - 라인
        // nextInt - 정수
        switch (input) {
                case 1: inputString = "박영선";
                        break;
                case 2: inputString = "오세훈";
                        break;
                case 3: inputString = "허경영";
                        break;
}


        System.out.println(inputString); 



    }
}

