import java.util.*;

public class Quiz4 {
    public static void main(String[] args) {

      // 6- 16 요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어 학습 프로그램 작성

    	// Random rand = new Random();
      //   Scanner sc = new Scanner(System.in);

      //   String[] dayKor = {"일","월","화","수","목","금","토"};
      //   String[] dayEng = {"sun","mon","tue","wed","thu","fri","sat"};

      //   System.out.println("요일명을 영어 소문자로 입력하시오");

      //   int last= -1; // 이전 요일
      //   int retry = 0; 
      //   do {
      //     int day;
      //     do {
      //       day = rand.nextInt(7);
      //     } while(day == last);
      //     last = day;

      //     while (true) {
      //       System.out.print(dayKor[day]+"요일 : ");
      //       String s = sc.next();

      //       if (s.equals(dayEng[day])) break;  //정답일경우

      //       System.out.println("틀렸습니다. ");
      //     }
      //     System.out.print("정답입니다. 다시 한번? 1...Yes/0...No :");
      //     retry = sc.nextInt();
      //   }while(retry == 1);

      // 6-18 3행 4열의 행렬을 곱하는 프로그램을 작성하자.

        // Scanner sc= new Scanner(System.in);
        
        // int[][] a = new int[4][3];
        // int[][] b = new int[3][4];
        // int[][] c = new int[4][4];


        // System.out.println("행렬 a의 요소를 입력하세요");
        // for (int i = 0; i < 4; i++){
        //   for (int j = 0; j < 3; j++) {
        //     System.out.print("a["+i+"]["+j+"] :");
        //     a[i][j] = sc.nextInt();
        //   }
        // }

        // System.out.println("행렬 b의 요소를 입력하세요");
        // for (int i = 0; i < 3; i++){
        //   for (int j = 0; j < 4; j++) {
        //     System.out.print("b["+i+"]["+j+"] :");
        //     b[i][j] = sc.nextInt();
        //   }
        // }


        // for (int i = 0; i < 4; i++){
        //   for (int j = 0; j < 4; j++) {
        //     c[i][j] = 0;
        //     for (int k =0; k < 3; k++) {
        //       c[i][j] += a[i][k] * b[k][j];
        //     }
        //   }
        // }
        // System.out.println("행렬 a와 b의 곱");
        // for (int i = 0; i < 4; i++) {
        //   for (int j = 0; j < 4; j++)
        //   System.out.print(c[i][j]+" ");
        //   System.out.println();
        // }

      // 6- 20 두 과목 점수를 읽어 과목별 평균과 학생별 평균을 구하자

        // Scanner sc= new Scanner(System.in);
        
        // System.out.println("6명의 국어, 수학 점수를 입력하세요");

        // int[][] point = new int[6][2];
        // int[] sumStudent = new int[6];
        // int[] sumSubject = new int[2];

        // for (int i = 0; i < 6 ; i++){
        //   System.out.print(i+1 +"번 국어:");
        //   point[i][0] = sc.nextInt();
        //   System.out.print("    수학:");
        //   point[i][1] = sc.nextInt();

        //   sumStudent[i] = point[i][0] + point[i][1]; //학생 점수
          
        //   sumSubject[0] += point[i][0];  //국어점수합
        //   sumSubject[1] += point[i][1];  //수학점수합
        // }
      
        // System.out.println("No.\t국어\t수학\t평균");
        // for (int i = 0; i < 6 ; i++){
        //   System.out.println((i+1)+"\t"+point[i][0]+"\t"+point[i][1]+"\t"+(double)sumStudent[i]/2);
        // }
        // System.out.println("평균\t"+(double)sumSubject[0]/6+"\t"+(double)sumSubject[1]/6);

      // 6-21 학급 수, 각 학급의 학생 수, 그리고 모든 학생의 점수를 읽어서 합계와 평균을 내는 프로그램 작성.
      // 학급단위, 전교생을 대상으로 각각 구하기.
      
        Scanner sc = new Scanner(System.in);

        System.out.print("학급수 : ");
        int classNum = sc.nextInt();
        int[][] point = new int[classNum][];
        int totNumber = 0;
        
        for (int i = 0 ; i < point.length ; i ++){
          System.out.print(i+1+"반의 학생수 : ");
          int num = sc.nextInt();
        
          point[i] = new int[num];
          totNumber += num;
        
          for (int j = 0; j < point[i].length; j++){
            System.out.print((i+1) + "반"+ (j+1) +"번의 점수 :");
            point[i][j] = sc.nextInt();
          }
        }
          System.out.println("  반 |    합계    평균");
          System.out.println("----+-----------------");
          int total = 0;
          for (int i = 0 ; i < point.length; i++) {
            int sum = 0;
            for (int j = 0; j <point[i].length; j++) {
              sum += point[i][j];
            }
            total += sum;
            System.out.printf("%2d반 | %7d %7.1f\n",i+1,sum, (double)sum/point[i].length);
          }    
        
          System.out.println("----+-----------------");
            System.out.printf("  합 | %7d %7.1f\n",total, (double)total/totNumber);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    
}
