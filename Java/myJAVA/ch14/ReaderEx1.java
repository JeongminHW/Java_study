package ch14;

import java.io.*;

public class ReaderEx1 {

	public static void main(String[] args) {
		try {
			InputStream is = System.in;
			//1byte단위로 처리되는 데이터를 문자단위로 처리
			Reader reader = new InputStreamReader(is);
			while(true) {
				int a = reader.read();
				if(a==-1) break;
				System.out.print((char)a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
