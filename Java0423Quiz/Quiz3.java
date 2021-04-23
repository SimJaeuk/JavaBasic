import java.util.*;

public class Quiz3{
    public static void main(String[] args) {
    // // 5-4 논리형 변수 프로그램
    // boolean b1 = true;
    // boolean b2 = false;

    // System.out.println("b1 = " + b1);
    // System.out.println("b2 = " + b2);
    
    

    // //5-5  정숫값 x,y,z의 평균을 구하기
    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("x 값:");
    // int x = sc.nextInt();
    // System.out.print("y 값:");
    // int y = sc.nextInt();
    // System.out.print("z 값:");
    // int z = sc.nextInt();        
    
    // double avg = (x+y+z) / 3;

    // System.out.print("x,y,z의 평균은 "+ avg + "입니다.");

    //5-6  정숫값 x,y,z의 평균을 구하기 -> 캐스트 연산자 이용 후 실수표시
    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("x 값:");
    // int x = sc.nextInt();
    // System.out.print("y 값:");
    // int y = sc.nextInt();
    // System.out.print("z 값:");
    // int z = sc.nextInt();        
    
    // double avg = (x+y+z) / 3.0;

    // System.out.print("x,y,z의 평균은 "+ avg + "입니다.");


    // 5-7  int형 변환에 실숫값을 대입해서 표시하는 프로그램 작성
    
    // int a;
    // a = (int) 10.0;  //캐스트

    // System.out.println(a);

    
    // // 5-8 float형의 변수를 0.0부터 1.0까지 0.001씩 증가시키며 표시, 그 옆에 int형 변수를 0부터 1000까지 1씩 증가시키며 1000으로 나눈 값 표시

    
    // System.out.println("float              int");
    // System.out.println("--------------------------");

    // float x = 0.0F;

    // for(int i = 0; i <= 1000; i++, x += 0.001F){
    //     System.out.printf("%10.7f %10.7f \n", x , (float)i/1000);

    // }

    // // 6-1 자료형은 double이고  수가 5인 배열을 생성하고 이 배열의 모든 요소를 표시하는 프로그램 작성

    // double[] a = new double[5];

    // for(int i = 0; i < a.length ;i++)
    //     System.out.println("a[" + i + "] = " + a[i]);

    
    
    // // ********많이사용됨******** 6-2 요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1

    // int[] a = new int[5];

    // for(int j = 0; j < a.length ;j++)
    //     a[j] = 5 - j;

    // for(int i = 0; i < a.length ;i++)
    //     System.out.println("a[" + i + "] = " + a[i]);


    // // ********많이사용됨******** 6-6 배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램
    // // 표시 형식은 배열 초깃값과 같은 형식으로 각  요소의 값을 쉼표로 연결하고 {}로 감싼 형태이다.

    // Scanner sc = new Scanner(System.in);
    
    // System.out.print("요소 수:");
    // int n = sc.nextInt();
    

    // int[] a = new int[n];

    // for(int j = 0; j < n ;j++){
    //     System.out.print( "a[" + j + "] = ");
    //     a[j]= sc.nextInt();
    // }

    // System.out.print("a = {");
    // for(int i = 0; i <  n - 1; i++){
    //     System.out.print(a[i] + ", "); 
    //     }
    //     System.out.print(a[n-1]+"}");


    // // 6-7 시험 점수의 합계, 평균, 최고점, 최저점을 구하는 프로그램을 작성하자. 사람 수와 점수는 키보드를 통해 입력 받을 것.

    // Scanner sc = new Scanner(System.in);

    // System.out.print("사람 수:");
    // int n = sc.nextInt();

    // System.out.println("점수를 입력하세요.");
    // int[] a = new int[n];
    // int sum = 0;

    // for(int j = 0; j < n ;j++){
    //     System.out.print(j+1 +"번의 점수:");
    //     a[j] = sc.nextInt();
    //     sum += a[j];
    // }
    //  int max = a[0];
    //  int min = a[0];
    //  for (int i = 0 ; i < n; i++){
    //     if (a[i] > max) max = a[i];
    //     if (a[i] < min) min = a[i];
    //  }


    // System.out.println("합계는 " + sum + "입니다.");
    // System.out.println("평균은 " + (double)sum / n + "입니다.");
    // System.out.println("최고점은 " + max + "입니다.");
    // System.out.println("최저점은 " + min + "입니다.");


    // // 6-8 배열에서 특정 값을 가지는 요소를 찾아라.
    // // 동일 값의 요소가 여러 개 있으면 가장 앞에 위치한 요소를 찾는 프로그램과 가장 뒤에 있는 요소를 찾는 프로그램을 작성하자.

    // Scanner sc = new Scanner(System.in);

    // System.out.print("요소 수:");
    // int n = sc.nextInt();

    // System.out.println("점수를 입력하세요.");
    // int[] a = new int[n];

    //     for(int j = 0; j < n ;j++){
    //     System.out.print("a["+j+"] = ");
    //     a[j] = sc.nextInt();
    // }

    //     System.out.print("찾을 숫자: ");
    //     int find = sc.nextInt();
        
    
    //     for(int j = 0; j < n ;j++){
    //         if (a[j] == find){
    //             System.out.print("그 값은 a["+j+"]  에 있습니다.");
    //         }
    //     }

    // // 6-10 요소의 형이 int형인 배열을 만들어서 모든 요소에 1~10의 난수를 대입하자(1이상 10이하의 값을 대입).
    // //  요소 수는 키보드를 통해 입력받을 것.

    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    
    // int n = sc.nextInt();
    // int[] a = new int[n];

    //   for (int j = 0; j < n ; j++){
    //     a[j]= 1+ rand.nextInt(10);
    //   }
      
    //   for (int j = 0; j < n ; j++){
    //       System.out.println("a["+j+"] = " + a[j]);
    //   }

    //6-11 인접하는 요소가 동일한 값을 가지지 않도록[문제6-10]의 프로그램을 수정하자. 예를 들어{1,3,5,5,3,2}가 돼서는 안된다.


    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    
    // int n = sc.nextInt();
    // int[] a = new int[n];

    //   a[0]= 1+ rand.nextInt(10);

    //   for (int j = 1; j < n ; j++){
    //     do {
    //       a[j] = 1+ rand.nextInt(10);
    //     } while(a[j]==a[j-1]);
    //   }
      
    //   for (int j = 0; j < n ; j++){
    //       System.out.println("a["+j+"] = " + a[j]);
    //   }


    // //6-12 전체요소가 동일한 값을 가지지 않도록[문제6-10]의 프로그램을 수정하자. 예를 들어{1,3,5,3,2}가 돼서는 안된다. (10 이하)

    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);
    // int n = 0;
    // do{
    //   System.out.print("요소 수:");
    //   n = sc.nextInt();
    // }while(n>10);
    
    // int[] a = new int[n];

    // a[0]= 1+ rand.nextInt(10);

    //  for (int i = 0; i < n ; i++){
    //    int j;
    //   do {
    //     j = 0;
    //     a[i] = 1+ rand.nextInt(10);
    //     for (j =0; j < i; j++){
    //       if (a[j] == a[i] ) break;
    //     }
    //   }while(j < i);
      
    // }
    
    //   for (int j = 0; j < n ; j++){
    //       System.out.println("a["+j+"] = " + a[j]);
    //   }

    // //6-13 배열의 나열 순서를 섞는 프로그램을 작성하자.

    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    // int n = sc.nextInt();
    // int[] a = new int[n];

    //   for (int j = 0; j < n ; j++){
    //     System.out.print("a["+j+"] = ");
    //     a[j]= sc.nextInt();
    //   }

    // System.out.println("요소를 섞었습니다.");

    //   for (int i = 0 ; i < n*2 ; i++) {
    //     int x = rand.nextInt(n);
    //     int y = rand.nextInt(n);
    //     int t = a[x];
    //     a[x] = a[y];
    //     a[y] = t;
    //   }

    //   for (int j = 0; j < n ; j++){
    //       System.out.println("a["+j+"] = " + a[j]);
    //   }

    // 6-14 배열 a의 모든 요소를 역순으로 배열 b에 복사하는 프로그램을 작성하자.
    // 두 배열의 요소 수는 동일하다고 가정
      
    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    // int n = sc.nextInt();
    // int[] a = new int[n];
    // int[] b = new int[n];

    // for (int j = 0; j < n ; j++){
    //   System.out.print("a["+j+"] = ");
    //   a[j]= sc.nextInt();
    //   }

    // for (int i = 0; i < n ; i++){
    //   b[i] = a[n-i-1];
    //   System.out.println("b["+i+"] = " +b[i]);
    //   }
    

    // 6-15 월을 1~12의 숫자로 표시하고 해당 월의 영어 단어를 입력하는 프로그램을 작성하자.
    
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    
    String months[] = {  
      "January", "February", "March", "April", 
      "May","June","July","August",
      "September","October","November","December"
  };
    int re = 0;

    System.out.println("해당 월의 영어 단어를 입력하시오");
    System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
    
    do{
    int month = 1 + rand.nextInt(12);
  
    while(true){
    System.out.print(month + "월:");
    String s = sc.next();

    if (s.equals(months[month-1])) break; 
      System.out.println("틀렸습니다.");
    }  
      System.out.print("정답입니다.");
      System.out.print("다시 한번? 1....Yes / 0....No: ");
      re =  sc.nextInt();
  
    }while(re == 1);

    }
}