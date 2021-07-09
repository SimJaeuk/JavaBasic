import java.util.Scanner;
import java.util.Random;

public class Quiz2{
    public static void main(String[] args) {
    // # 4-1 정숫값의 부호를 판정해서 표시하는 프로그램을 반복입력프로그램으로 수정
        
        // #1
    //     Scanner sc = new Scanner(System.in);

    //     int i = 1;

    //     while(i==1){
    //     System.out.print("정수값:");
    //     int A = sc.nextInt();
    //     if (A > 0){
    //         System.out.println("이 값은 양수 입니다.");
    //     }else if(A == 0){
    //         System.out.println("값이 0입니다.");
    //     }else{
    //         System.out.println("이 값은 음수입니다.");
    //     }System.out.print("다시 한번? 1-YES / 0-No:");
    //      i = sc.nextInt();
    // }
            // #2
            
    //     Scanner sc = new Scanner(System.in);
    //     int retry;
    // do{
    //     System.out.print("정수값 : ") ;
    //     int n = sc.nextInt();

    //     if (n > 0) {
    //         System.out.println("이 값은 양수입니다.");
    //     }else if (n < 0) {
    //         System.out.println("이 값은 음수입니다.");
    //     } else {
    //         System.out.println("이 값은 0 입니다.");
    //     }

    //     System.out.print("다시 한번? 1-Yes / 0-No : ");
    //     retry = sc.nextInt();
    //     }while (retry==1);

    // #4-2 3자리의 양의 정숫값을 읽는 프로그램 작성

    //     Scanner sc = new Scanner(System.in);
    //     int n;

    // do {
    //     System.out.print("세 자리의 정숫값 : ");
    //     n = sc.nextInt();


    // } while (n < 100 || n > 999);
    //     System.out.print("입력한 값은 " + n + "입니다.");
    
    // #4-3 2자리의 정숫값(10~99)를 맞추는 숫자 맞추기 게임 만들기
    //     Random random = new Random();
    //     Scanner sc = new Scanner(System.in);
    //     int r = 10 + random.nextInt(90);
    //     int n;
    //     System.out.println("숫자 맞추기 게임 시작!");
    //     System.out.println("10부터 99까지의 숫자를 맞춰주세요");
    // do {    
    //     System.out.print("어떤 숫자일까?: ");
    //     n = sc.nextInt();
    // if(n > r){
    //     System.out.print("더 작은 숫자입니다.");
    // }else if(n < r){
    //     System.out.print("더 큰 숫자입니다.");
    // }
        
    // }while (n > r || n < r);
    // System.out.print("정답입니다.");

    // #4-4 값을 읽어서 두 정수 사이에 있는 모든 정숫값을 정렬하는 프로그램
    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수 A:" );
    // int A = sc.nextInt();

    // System.out.print("정수 B:" );
    // int B = sc.nextInt();

    // // 필요시 작은수에서 큰 수로 위치 변환
    // if (A > B){
    //     int t = A;
    //     A = B;
    //     B = t;
    // }

    // // a와 b 사이의 정수 출력
    // do {
    //     System.out.print(A + " ");
    //     A += 1;
    // } while (A <= B);

    // #4-5 입력받은 정수값 부터 0까지 카운트다운하는 프로그램
    // Scanner sc = new Scanner(System.in);
    
    // System.out.println("카운트다운 합니다.");
    // int x;
    
    // do {
    //     System.out.print("양의 정수값: ");
    //     x = sc.nextInt();
        
    //     } while (x <= 0);

    // while (x >= 0){
    //     System.out.println(x--);
    // }
    // System.out.println("x의 값이 "+x+"이 됐습니다.");

    // 4-7 입력한 값의 개수만큼 '*'을 표시하는 프로그램 작성
    // 마지막에는 줄 바꿈 읽은 값이 1 미만이면 줄바꿈 x
    
    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("몇 개의 *를 표시할까요?");
    // int star = sc.nextInt();
    // int i = 0;
    
    // while (i < star){
    //     System.out.print("*");
    //     i++;
    // }
    // if (star > 1){
    //     System.out.println();
    // }

    // 4-8 읽은 값의 수만큼 *와 +를 번갈아가며 표시
    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("몇 개를 표시할까요?");
    // int star = sc.nextInt();
    // int i = 0;

    // while (i < star){
    //     if ( i % 2 == 0)
    //     System.out.print("*");
    //     else        
    //     System.out.print("+");

    //     i++;
    // }
    //     if (star > 1){
    //     System.out.println();
    //     }

    // 4-9 양의 정수값을 읽어서 그 자릿수를 출력하는 프로그램
    // Scanner sc = new Scanner(System.in);
    
    // System.out.println("양의 정수값의 자릿수를 표시합니다.");
    // System.out.print("양의 정수값:");
    // int x = sc.nextInt();
    // int y = 0;
    // while(x>0){
    //     y++;
    //     x = x/10; // 125.4  12.5 1.2 end
    // }
    //    System.out.print("입력한 숫자는 " + y + "자리입니다.");
    
    // 4-10 양의 정수값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램
    // Scanner sc = new Scanner(System.in);
    // System.out.print("양의 정수값:");
    // int x = sc.nextInt();
    // int y = 1;
    // int i = 1;
    
    // while(i <= x){
    //     y = y * i;
    //     i++;
    // }

    // System.out.println("1부터 5까지의 곱은"+ y +"입니다.");

    // 4-7을 for문으로 작성
    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("몇 개의 *를 표시할까요?");
    // int star = sc.nextInt();
    
    // for (int i = 0; i < star; i++)
    //     System.out.print("*");
        
    // if (star > 1)
    //     System.out.println();


    // 4-14 1부터 n까지의 합을 구하는 프로그램

    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("1부터 n까지의 합을 구합니다. n의 값:");
    // int n = sc.nextInt();
    // int plus = 0;

    // for (int i=0; i <= n; i++){
    //     plus = plus + i;

    // }
    // System.out.print("1부터 n까지의 합은 "+ plus +"입니다.");

    // 4-15 결과뿐만 아니라 계산식까지 표시

    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("1부터 n까지의 합을 구합니다. n의 값:");
    // int n = sc.nextInt();
    // int plus = 0;

    // for (int i=1; i < n; i++){
    //     plus = plus + i;
    //     System.out.print( i+" + " );
    // }
    //     System.out.print(n + " = " + (plus + n));
    
    
    // 4-16 신장별 표준 체중 대응표를 표시하는 프로그램을 작성
    // 시작/종료/증가 정수값으로 입력받기
    
    // Scanner sc = new Scanner(System.in);
    // System.out.print("몇 cm부터:");
    // int x = sc.nextInt();
    // System.out.print("몇 cm까지:");
    // int y = sc.nextInt();
    // System.out.print("몇 cm 단위:");
    // int z = sc.nextInt();
    // System.out.println("신장 표준 체중");
    // System.out.println("---------------");

    // for(int i = x; i <= y; i += z){
    //     System.out.println(i + " " + 0.9 *(i - 100));
    // }
    // // 4-18 입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수값:");
    // int x = sc.nextInt();
    // int y = 0;
    // for(int i = 1; i <= x ; i++){
    //     if (x % i == 0){
    //         System.out.print(i+" ");
    //         y++;
    //     }
        
    // }System.out.println("\n의 약수는"+ y+"개입니다.");
    
    
    // 4-19 1부터 n까지의 정수값에 각 값을 제곱해서 표시
    // Scanner sc = new Scanner(System.in);
    // System.out.print("정수값:");
    // int x = sc.nextInt();
    
    
    // for(int i = 1; i <= x; i++){
    //     System.out.println(i+"의 제곱은 "+i*i+"입니다.");
    // }
    
    // 4-20 달을 정수값으로 읽어서 해당하는 달의 계절을 표시
    // 1~12이외의 값 입력 하면 재입력 do문안에 do문
    // Scanner sc = new Scanner(System.in);
    // System.out.println("계절을 찾습니다.");
    // int month;
    // int again;
    
    // do{
    //     do{
    //         System.out.print("몇 월입니까?:");
    //         month = sc.nextInt();
    //         }while(month > 12);
        
    //             if(month == 12 || month == 1 || month == 2){
    //                 System.out.println("겨울입니다.");
    //             }else if(month == 3 || month == 4 || month == 5){
    //                 System.out.println("봄입니다.");
    //             }else if(month == 6 || month == 7 || month == 8){
    //                 System.out.println("여름입니다.");
    //             }else if(month == 9 || month == 10 || month == 11){
    //                 System.out.println("가을입니다.");
    //             }
    //             System.out.print("다시 하시겠습니까? 1...Yes/0...No");
    //             again = sc.nextInt();

    // }while(again==1);

    // 4-21 기호문자 *를 나열해서 n단으로 표시

    // Scanner sc = new Scanner(System.in);
    // System.out.println("정방형을 표시합니다.");
    // System.out.print("단수는:");
    // int x = sc.nextInt();

    // for(int i = 0; i < x; i++){         //줄
    //     for (int j = 0; j < x; j++){    //줄마다 갯수
    //         System.out.print("*");      //if x=3 j=3
    //     }
    //     System.out.println();
    // }

    // 4-22 기호문자 *를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램
    // Scanner sc = new Scanner(System.in);
    // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    // System.out.print("단수는?:");
    // int x = sc.nextInt();

    // for(int i = 0; i < x; i++){
    //     for (int j = 0; j < i+1; j++){
    //         System.out.print("*");
    //     }System.out.println();
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
    // System.out.print("단수는?:");
    // int y = sc.nextInt();

    // for(int i = 0; i < y; i++){
    //     for (int j = y; j > i; j--){
    //         System.out.print("*");
    //     }System.out.println();
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
    // System.out.print("단수는?:");
    // int z = sc.nextInt();
    
    // for (int k = 1; k <= z ; k++){             //줄
    //     for(int i = 1; i <= k-1 ; i++){            //빈칸
    //         System.out.print(" ");
    //     }
    //         for (int j = 1; j <= z-k+1; j++){     //별
    //             System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // 4-23 n단 피라미드 별표시

    // Scanner sc = new Scanner(System.in);
    // System.out.println("피라미드 지어보자");
    // System.out.print("단수는?:");
    // int x = sc.nextInt();
    
    // for (int k = 1; k <= x ; k++){             
    //     for(int i = x-1; i>=k; i--){          
    //         System.out.print(" ");
    //     }
    //         for (int j = 1; j <= 2*k-1; j++){     
    //             System.out.print("*");
    //     }
    //     System.out.println();
    // }
    
    // 4-24 n단 숫자피라미드 만들기
    // Scanner sc = new Scanner(System.in);
    // System.out.println("피라미드 지어보자");
    // System.out.print("단수는?:");
    // int x = sc.nextInt();
    
    // for (int k = 1; k <= x ; k++){             
    //     for(int i = x-1; i>=k; i--){          
    //         System.out.print(" ");
    //     }
    //         for (int j = 1; j <= 2*k-1; j++){
    //             System.out.print(k % 10);
    //     }
    //     System.out.println();
    //     }

    // 4-25 양의 정수값을 읽어서 소수인지 판정 
    // Scanner sc = new Scanner(System.in);
    // System.out.print("2 이상의 정수값:");
    // int x = sc.nextInt();
    // int i;
    // for(i = 2 ; i < x ; i++){
    //     if(x % i == 0){
    //         break;   
    //     }
    // } 
    //     if(i == x)   
    //     System.out.println("소수입니다.");
    //     else
    //     System.out.println("소수가 아닙니다.");

    // 4-26 정수값을 연속해서 입력을 받아 합계와 평균을 구하는 프로그램을 작성
    
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?:");
        int x = sc.nextInt();
        int i;
        int sum = 0;
        

        for(i = 0; x > i; i++){
            System.out.print("정수(0으로 종료): ");
            int t = sc.nextInt();
            if(t == 0) break;
            sum = sum + t;
            }
            
            System.out.println("합계는 " + sum + "입니다.");
            System.out.println("평균은 " + sum/i + "입니다.");
    }
}