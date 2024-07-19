package ch04;

import java.util.*;

public class LuckyLotto2 {

	public static void main(String[] args) {
		Object arr[] = getLotto();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");

		}

	}

	public static Object[] getLotto() {
		Random rd = new Random();
		TreeSet<Integer> tr = new TreeSet<Integer>();
		
		for (int i = 0; tr.size() < 6; i++) {
			int num = rd.nextInt(45) + 1;
			tr.add(num);
		}

		Object lotto[] = tr.toArray();
		return lotto;
	}

}
