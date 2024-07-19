package ch04;

public class GuGuDan {

	public static void main(String[] args) {
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.print(i+"단 " + i+"*"+j+"="+(i*j) +"\t");
			}
			System.out.println();
		}
	}

}
