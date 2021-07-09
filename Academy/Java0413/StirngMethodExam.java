public class StirngMethodExam {
    public static void main(String[] args){
    //String str = new String("hello");
        String str = "hello";
        String str2 = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        System.out.println(str);
        str = str.concat(" world");
        System.out.println(str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode("hello"));
        System.out.println(System.identityHashCode(" world"));
    }
}
