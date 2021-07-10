package string;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException{
		//읽은 바이트를 저장
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		//배열에 읽은 바이트를 저장 후 읽은 바이트 수를 리턴
		int readByteNo = System.in.read(bytes);
		
		//배열을 문자열로 전환
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		

	}

}
