package line;

import java.io.*;

public class ReadLineExam {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(
				ReadLineExam.class.getResource("language.txt").getPath()
				);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
		}
		br.close();
		

	}

}
