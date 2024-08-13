package ch14;

import java.util.Scanner;
import java.io.*;

public class FileCopyEx1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("원본 : ");
			String sFile = sc.nextLine();
			System.out.print("복사 : ");
			String cFile = sc.nextLine();
			
			FileReader fr = new FileReader("ch14/" + sFile);
			FileWriter fw = new FileWriter("ch14/" + cFile);
			
			int a;
			while((a=fr.read()) != -1) {
				fw.write(a);
			}
			fw.flush();
			fw.close();
			fr.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
