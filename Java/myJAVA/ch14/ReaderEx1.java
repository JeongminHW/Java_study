package ch14;

import java.io.*;

public class ReaderEx1 {

	public static void main(String[] args) {
		try {
			InputStream is = System.in;
			//1byte������ ó���Ǵ� �����͸� ���ڴ����� ó��
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
