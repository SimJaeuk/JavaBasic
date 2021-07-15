package writer;

import java.io.*;

public class WriteExam3 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = { 'A', 'B', 'C', 'D', 'E' };
		
		writer.write(array, 1, 3);
	

		writer.flush();
		writer.close();
	}

}
