package ch14;

import java.io.*;

public class BufferedWriterEx1 {

	public static void main(String[] args) {
		String str = "������ ��ſ�... ȭ����";
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write(str, 0, str.length());
			bw.newLine();
			bw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
