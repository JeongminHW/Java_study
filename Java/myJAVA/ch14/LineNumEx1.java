package ch14;

import java.io.*;

public class LineNumEx1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch14/LineNumEx1.java");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("ch14/LineNumEx1.txt");
			FileOutputStream fos = new FileOutputStream("ch14/LineNumEx1.txt");
			//다목적 출력 리스트
			PrintStream ps = new PrintStream(fos);
			String str = "";
			int i = 1;
			while(true) {
				str = br.readLine();
				if(str==null) break;
				str = i + " : "+str;
				ps.println(str);
				i++;
			}
			ps.close();
			fos.close();
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}