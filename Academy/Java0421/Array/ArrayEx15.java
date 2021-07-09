public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", ".",
                          "..-.", "--.", "....", "..", ".---",
                          "-.-", ".-..", "--", "-.", "---",
                          ".--.", "--.-", ".-.", "...", "-",
                          "..-", "...-", ".--", "-..-","-.--",
                          "--.."};
        
        String result="";

        for(int i =0; i < source.length() ; i++) {
            result+=morse[source.charAt(i)-'A'];/// src의 i번째 문자를 ch에 저장
        }
        System.out.println("source:"+ source);
        System.out.println("morse:"+result);


    
    }
}
