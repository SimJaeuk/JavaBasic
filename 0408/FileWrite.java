// import java.io.IOException;      예외처리
// import java.io.FileOutputStream; 파일생성
// import java.io.FileWriter;
// import java.io.PrintWriter;

import java.io.*; //정답은 아니다.

public class FileWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("out.txt");
        for(int i=1; i<101; i=i+2) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();


        // PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
        // for(int i=11; i<21; i++) {
        //     String data = i+" 번째 줄입니다.";
        //     pw2.println(data);
        // }
        // pw2.close();
    }
}




