import java.util.Scanner; // 입력받기

import javax.lang.model.util.ElementScanner6;

import java.util.Random; // 난수 생성

public class Quiz {
    public static void main(String[] args) {
        
        // # 1 한줄에 이어서 출력하기
        // System.out.print("첫 Java 프로그램입니다.");
        // System.out.print("화면에 출력하고 있습니다.");

        // # 2 한 줄에 한 글자씩 자신의 이름을 표시하는 프로그램 작성
        // System.out.println("홍");
        // System.out.println("길");
        // System.out.println("동");
        
        // System.out.println("홍\n길\n동");

        // # 3 성과 이름 사이에 빈 줄 추가하기
        // System.out.println("홍");
        // System.out.println("");
        // System.out.println("길");
        // System.out.println("동");
        
        // System.out.println("홍\n\n길\n동");

        // # 4 정수 82와 17의 합과 차를 구하는 프로그램 작성
        // System.out.println("82 + 17 = " + (82+17));
        // System.out.println("82 - 17 = " + (82-17));

        // # 5 2개 변수의 합과 평균을 구하자.
        // int x = 63;
        // int y = 18;

        // System.out.println("x값은 "+x+"입니다.");
        // System.out.println("y값은 "+y+"입니다.");
        // System.out.println("합계는 "+(x+y)+"입니다.");
        // System.out.println("평균은 "+(x+y)/2+"입니다.");

        // # 6 5번과 동일한 프로그램에 실수 대입하기
        // double x = 63.4;
        // double y = 18.3;

        // System.out.println("x값은 "+x+"입니다.");
        // System.out.println("y값은 "+y+"입니다.");
        // System.out.println("합계는 "+(x+y)+"입니다.");
        // System.out.println("평균은 "+(x+y)/2+"입니다.");

        // #7 3개의 int형 변수에 각각 값을 대입해서 합계와 평균을 구하는 프로그램
        // int x = 63;
        // int y = 18;
        // int z = 52;
        // int sum = x+y+z;

        // System.out.println("x값은 "+x+"입니다.");
        // System.out.println("y값은 "+y+"입니다.");
        // System.out.println("z값은 "+z+"입니다.");
        // System.out.println("합계는 "+sum+"입니다.");
        // System.out.println("평균은 "+sum/3+"입니다.");

        // #8 정수값 입력받기
        // Scanner scanner = new Scanner(System.in);
        
        
        // System.out.print("정수값:");
        // int i = scanner.nextInt();
        // System.out.println(i + "을 입력했습니다.");

        // #9 입력한 정숫값에 10을 더한 값과 10을 뺸 값을 출력하자.
        // Scanner scanner = new Scanner(System.in);
        
        
        // System.out.print("정수값:");
        // int i = scanner.nextInt();
        // System.out.println("10을 더한 값은"+(i+10)+"입니다.");
        // System.out.println("10을 뺀 값은"+(i-10)+"입니다.");
        
        // #10 키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과
        // 마지막 자릿수 값만 표시하는 프로그램을 작성
        // Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();

        // System.out.print("정수값:");
        
        // System.out.println("마지막 자릿수를 제외한 값은 "+(i / 10)+"입니다.");
        // System.out.println("마지막 자릿수는 "+(i % 10)+"입니다.");

        // # 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성
        // Scanner sc = new Scanner(System.in);
        // System.out.print("삼각형의 넓이를 구합니다.");

        // System.out.print("밑변: ");
        // Double a = sc.nextDouble();
        // System.out.print("높이: ");
        // Double b = sc.nextDouble();
        
        // System.out.println("넓이는 "+a*b/2+"입니다.");
         
        // # 구의 겉넓이와 부피 구하기
        // Scanner sc = new Scanner(System.in);
        // System.out.println("구의 겉넓이와 부피를 구합니다.");

        // System.out.print("반지름: ");
        // Double r = sc.nextDouble();
        // final Double PI = 3.1416; //상수 선언

        // System.out.println("겉넓이는 "+(4 * PI * r*r)+"입니다.");
        // System.out.println("부피는 "+(4 / 3.0 * PI * r*r*r )+"입니다.");

        // # 한 자리 양의 정수값(즉, 1이상 9이하의 값) 랜덤표시
        // # 한 자리 음의 정수값(즉, -9이상 -1이하의 값) 랜덤표시
        // # 두 자리 양의 정수값(즉, 10이상 99이하의 값) 랜덤표시
        // System.out.println("3개의 난수를 생성했습니다.");
        // Random random = new Random();

        // int x = 1 + random.nextInt(9); // 9미만= 8 + 1 = 9
        // int y = -1 - random.nextInt(9); // - -
        // int z = 10 + random.nextInt(90);

        // System.out.println("한 자리 양의 정수: " + x);
        // System.out.println("한 자리 음의 정수: " + y);
        // System.out.println("두 자리 양의 정수: "+ z);


        // # 입력한 정수값의 +5 또는 -5범위의 랜덤 정숫값을 생성
        // Random random = new Random();
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("정수값:");
        // int x = sc.nextInt();

        // System.out.println("입력 값의 5 범위의 난수를 생성했습니다.");
        // System.out.println("값은 "+ (x-5 + random.nextInt(11)) +"입니다.");

        // # 성과 이름으로 인사하는 프로그램 작성
        // Scanner sc = new Scanner(System.in);

        
        // System.out.print("성:");
        // String x = sc.next();
        // System.out.print("이름:");
        // String y = sc.next();
        // System.out.println("안녕하세요." + x + y +" 씨.");

        // # String형의 변수를 문자열로 초기화하거나 변수에 문자열을 대입
        // String s1 = "ABC";
        // String s2 = "XYZ";

        // System.out.println("문자열 s1은 " +s1+ "입니다.");
        // System.out.println("문자열 s2는 " +s2+ "입니다.");

        // s1 = "FBI"; //초기화는 한번만 하면 됨
        // System.out.println("문자열 s1은 " +s1+ "입니다.");
        // System.out.println("문자열 s2는 " +s2+ "입니다.");

        // # 키보드로 입력한 정숫값이 음이면 음이라고 알려주는 프로그램을 작성하자.
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값:");
        // int x = sc.nextInt();
        
        // if (x < 0) {
        //     System.out.println("이 값은 음의 값입니다.");
        // }
        
        // # 정수값을 읽어서 절댓값을 구하는 프로그램
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값:");
        // int x = sc.nextInt();
        
        // if (x < 0) {
        //     System.out.println("절대값은 "+ -x +"입니다.");
        // }else{
        //     System.out.println("절대값은 "+ x +"입니다.");

        
        // # 3-3 2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 
        // "B는 A의 약수이다."
        // #아니면 "B는 A의 약수가 아니다."
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수 A:");
        // int A = sc.nextInt();
        // System.out.print("변수 B:");
        // int B = sc.nextInt();

        // if (A % B == 0){
        //     System.out.println("B는 A의 약수입니다.");
        // }else{
        //     System.out.println("B는 A의 약수가 아닙니다.");
        // }

        // # 3-4 직전문제를 논리 부정 연산자를 사용해서 수정하기
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수 A:");
        // int A = sc.nextInt();
        // System.out.print("변수 B:");
        // int B = sc.nextInt();

        // if (!(A % B == 0)){
        //     System.out.println("B는 A의 약수가 아닙니다.");
        // }else{
        //     System.out.println("B는 A의 약수입니다.");
        // }

        // # 3-5 정수값을 읽어 부호(양수/음수/0)판정
        // # 마지막 else를 if (n==0)으로 변경하면 어떻게되는지 확인
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값:");
        // int A = sc.nextInt();
     
        // if (A > 0){
        //     System.out.println("값이 양수 입니다.");
        // }else if(A == 0){
        //     System.out.println("값이 0입니다.");
        // }else if(A < 0){
        //     System.out.println("값이 음수입니다.");
        // }


        // # 3-7 2개의 변수 a,b에 값을 읽어서 대소관계 표시
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수 a:");
        // int a = sc.nextInt();
        
        // System.out.print("변수 b:");
        // int b = sc.nextInt();
        
        // if (a > b){
        //     System.out.println("a가 크다.");
        // }else if(a < b){
        //     System.out.println("b가 크다.");
        // }else if(a == b){
        //     System.out.println("a와 b가 같다.");
        // }

        // # 3-9 입력한 정수값이 10의 배수이면 배수라고 표시
        // 아닐경우 아니라고 표시, 음수일경우 음수라고 표시
        
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값:");
        // int a = sc.nextInt();
        
        // if (a % 10 == 0){
        //     System.out.println("이 값은 10의 배수입니다.");
        // }else if(a % 10 != 0){
        //     System.out.println("이 값은 10의 배수가 아닙니다.");
        // }else if(a < 0){
        //     System.out.println("음의 정수값을 입력했습니다.");
        // }

        // # 3-11 입력한 점수에 따라 수/우/미/양/가 판정

        // Scanner sc = new Scanner(System.in);

        // System.out.print("점수:");
        // int a = sc.nextInt();
        
        // if(a > 100){
        //     System.out.println("잘못된 점수 입니다.");
        // }else if (a >= 90){
        //     System.out.println("수");
        // }else if(a >= 80){
        //     System.out.println("우");
        // }else if(a >= 70){
            // System.out.println("미");
        // }else if(a >= 60){
        //     System.out.println("양");
        // }else {
        //     System.out.println("가");  
        // }

        // # 3-13 값을 읽어서 두 값의 차를 표시하는 프로그램을 작성

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        
        // if(a > b){
        //     System.out.println("두 값의 차는 "+(a-b)+"입니다.");
        // }else if (a < b){
        //     System.out.println("두 값의 차는 "+(b-a)+"입니다.");
        // }else if(a == b){
        //     System.out.println("두 값은 차이가 없습니다.");
        // }

        // 3-13을  if를 사용하지 않고 프로그램을 작성하시오.
        // 다항연산자
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        // int minus;

        // minus = (a > b) ? a - b : b - a;
        // System.out.println("두 값의 차는 " + minus + "입니다.");
        //
        
        
        // 3-15 입력한 3개의 정수 중 최솟값을 구하는 프로그램
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        // System.out.print("정수 c:");
        // int c = sc.nextInt();
        // int min = a;
        
        // if(b < min) min = b;
        // if(c < min) min = c;

        // System.out.println("최솟값은 "+ min +"입니다.");

        // 3-16 입력한 3개의 정수 중 중앙값을 구하는 프로그램
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        // System.out.print("정수 c:");
        // int c = sc.nextInt();
        // int mid = a;
        
        
        // if ((b >= a && c <= a) || (b <= a && c >= a ))
        //     mid = a; // b > a > c    c > a > b
        // else if ((a >= b && c <= b) || (a <= b && c >= b ))
        //     mid = b;
        // else
        //     mid = c;

        // System.out.println("중앙값은 "+ mid +"입니다.");

        // if(a >= b )
        //     if(b >= c)
        //         mid = b;
        //     else if (a <= c)
        //         mid = a;
        //     else
        //         mid = c;
        // else if (a > c)
        //     mid = a;
        // else if (b > c)
        //     mid = c;
        // else
        //     mid = b;


        // 3-18 2개의 정숫값을 내림차순(큰 순)으로 정렬

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a:");
        // int a = sc.nextInt();
        // System.out.print("정수 b:");
        // int b = sc.nextInt();
        
        // System.out.println("a >= b가 되도록 정렬했습니다.");
        // if (a < b) {
        //     int c = a;
        //         a = b;
        //         b = c;
        // }
        // System.out.println("변수 a는 " + a +"입니다.");
        // System.out.println("변수 b는 " + b +"입니다.");
    
        // 3-19 3개의 정숫값을 오름차순(작은 순)으로 정렬

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
        System.out.print("정수 c:");
        int c = sc.nextInt();
        
        System.out.println("a <= b <= c 가 되도록 정렬했습니다.");
        
        int temp;

        if (b > c){
            temp = b; b = c; c = temp;
        }if (a > b){
            temp = a; a = b; b = temp;
        }if (b > c){
            temp = b; b = c; c = temp;
        }
        System.out.println("변수 a는 " + a +"입니다.");
        System.out.println("변수 b는 " + b +"입니다.");
        System.out.println("변수 c는 " + c +"입니다.");

        
    }
}
