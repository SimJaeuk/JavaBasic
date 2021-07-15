package input;

import java.io.*;

public class ReadExam3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		while(true) { 
			int readByteNum = is.read(buffer, 2, 3);
			if(readByteNum == -1) break;
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
