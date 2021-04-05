public class appendtest { 
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        // append 메소드는 뒤쪽에 문자를 이어 붙인다.
    }
}
