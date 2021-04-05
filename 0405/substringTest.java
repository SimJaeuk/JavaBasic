public class substringTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello jump to java");
        System.out.println(sb.substring(0, 4));
        //substring(시작위치, 끝위치)와 같이 사용하면 StringBuffer 
        //객체의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다.

    }
}
