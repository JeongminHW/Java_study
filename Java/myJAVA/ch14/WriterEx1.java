package ch14;

import java.io.*;

public class WriterEx1 {
	public static void main(String[] args) {
		int a = 'A';
		char b = 'b';
		char c = 'Á¤';
		try {
			OutputStream os = System.out;
			Writer writer = new OutputStreamWriter(os);
			writer.write(a);
			writer.write(b);
			writer.write(c);
			writer.flush();
			writer.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
