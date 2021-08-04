package kr.co.infopub.method;

import static java.lang.Math.sqrt;

public class MathMethod {
    public static void main(String[] args) {
        // sqrt -> 제곱근
        int a = (int) Math.sqrt(9);
        System.out.println(a);

        // random -> 1과 0사이의 실수(0 포함)
        double b = Math.random();
        System.out.println(b);

        // abs -> 절대값 구하기
        int c = Math.abs(-50);
        System.out.println(c);

        // ceil -> 올림
        // floor -> 내림
        double d = Math.ceil(34.3);
        double e = Math.floor(34.7);
        System.out.println(d);
        System.out.println(e);

        // pow -> 제곱
        int f = (int) Math.pow(2, 3);
        System.out.println(f);

        // max -> 최대값
        // min -> 최소값
        int g = (int) Math.max(7, 9);
        System.out.println(g);
        int h = (int) Math.min(7, 9);
        System.out.println(h);

    }
}
