package writer;

import java.io.*;

public class WriteExam2 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = { 'A', 'B', 'C' };
		
		writer.write(array);
	

		writer.flush();
		writer.close();
	}

}
