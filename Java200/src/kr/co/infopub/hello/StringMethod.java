package kr.co.infopub.hello;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args){

        String text = " Hello Java4Android";

        // charAt -> index 번째의 한개의 문자
        char a = text.charAt(2);
        System.out.println(a);

        // concat -> 문자열 가장 뒤에 붙이기
        String b = text.concat("s");
        System.out.println(b);

        // contains -> 문자열 포함여부 확인
        boolean c = text.contains("And");
        System.out.println(c);

        // equals -> 두 문자열이 같은지 확인
        String com = " HEllo Java4Android";
        boolean d = text.equals(com);
        System.out.println(d);

        // equalsIgnoreCase -> 대소문자 구분없는 비교
        boolean e = text.equalsIgnoreCase(com);
        System.out.println(e);

        // indexOf -> 문자열이 처음 발견된 인덱스값 ( 없으면 -1 )
        int index = text.indexOf("a");
        System.out.println(index);

        // lastIndexOf -> 문자열이 마지막 발견된 인덱스값 ( 없으면 -1 )
        int lastIndex = text.lastIndexOf("a");
        System.out.println(lastIndex);

        // trim -> 앞쪽과 뒤쪽의 공백 제거
        String f = text.trim();
        System.out.println(f);

        // length -> 문자열의 길이 (공백포함)
        int g = text.length();
        System.out.println(g);

        // substring -> index() 번째의 문자열들을 잘라서 반환
        String h = text.substring(7);
        System.out.println(h);

        // replace -> 문자열을 대체
        String i = text.replace(" ", "-");
        System.out.println(i);

        // toUpperCase -> 모두 대문자로 변경
        // toLowerCase -> 모두 소문자로 변경
        String j = text.toUpperCase();
        String k = text.toLowerCase();
        System.out.println(j);
        System.out.println(k);

        // split(" "); -> del 문자열을 기준으로 잘라서 배열로 만든다
        String [] l = text.split(" ");
        for(int m = 0; m<l.length; m++)
        System.out.println(l[m]);
    }
}
