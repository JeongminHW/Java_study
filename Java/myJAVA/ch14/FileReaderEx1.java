package ch14;

import java.io.*;

public class FileReaderEx1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch14/aaa.txt");
			int a;
			while((a=fr.read())!=-1) { //-1 : 파일의 제일 끝(마지막) 값
				System.out.print((char)a);
			}
			fr.close();
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
