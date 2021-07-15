package writer;

import java.io.*;

public class WriteExam4 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
	

		writer.flush();
		writer.close();
	}

}
