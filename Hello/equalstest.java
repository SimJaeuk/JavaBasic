public class equalstest {
    public static void main(String[] args) {
    String a = "hello";
    String b = "java";
    String c = "hello";
    String d = new String("hello");

    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(a == c);
    System.out.println(a == d);
    System.out.println(a.equals(d));
    System.out.println(a);
    System.out.println(d);



    //글자 자체가 같은지를 비교할때는 .equals를 이용하자.
    //a와 c의 주소값은 같지만 a,c와 d의 주소값은 다르다.
    //new String으로 선언했기 때문

    System.out.println(System.identityHashCode(a));
    System.out.println(System.identityHashCode(c));
    System.out.println(System.identityHashCode(d));

    }
}
