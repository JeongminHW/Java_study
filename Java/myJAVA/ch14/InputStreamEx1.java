package ch14;

import java.io.*;

public class InputStreamEx1 {

	public static void main(String[] args) {
		InputStream is = System.in; //Ű����� �Է�
		
		//io�� �޼ҵ�� ��κ� ����ó��
		while(true) {
			try {
				int a = is.read(); //�������� ������ : �Է� �� ��� ����
				if(a == -1) break;
				System.out.println((char)a);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
