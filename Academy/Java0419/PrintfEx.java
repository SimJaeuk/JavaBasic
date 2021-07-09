public class PrintfEx {
    public static void main(String[] args) {
        int finger = 10;
        System.out.printf("Finger = %5d\n", finger);    //오른쪽에 붙이기
        System.out.printf("Finger = %05d\n", finger);   //다섯자리
        System.out.printf("Finger = %-5d\n", finger);   //왼쪽에 붙이기
        System.out.printf("Finger = %010d\n", finger);   //열자리
    }
}
