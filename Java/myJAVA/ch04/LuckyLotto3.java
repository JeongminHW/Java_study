package ch04;

import java.util.*;

public class LuckyLotto3 {

	public static void main(String[] args) {
		int arr[] = getLotto();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");

		}

	}

	public static int[] getLotto() {
		int lotto[] = new int[6];
		Random rd = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			int num = rd.nextInt(45)+1;
			if(isDuplication(lotto, num))
				i--;
			else
				lotto[i] = num;
		}
		Arrays.sort(lotto); // 자동 정렬(오름차순)
		return lotto;
	}
	
	//"12 23 2 45".contains("2") : 중복이면 true
	public static boolean isDuplication(int arr[] , int num) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str+=arr[i]+" "; //배열 값 : 12 23 2 45
		}
		return str.contains(String.valueOf(num));
	}

}
