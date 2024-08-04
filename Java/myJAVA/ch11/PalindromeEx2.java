package ch11;

import java.util.Arrays;

// StringBuffer : 멀티 쓰레드에서 동기화 가능
// StringBuilder : 단일 쓰레드에서 동기화 불가능
public class PalindromeEx2 {

	public static final int MAX = 100000;

	public static void main(String[] args) {
		int sum[] = new int[3];
		for (int i = 1; i <= MAX; i++) {
			if (isPalindrome(i, 10)) {
				sum[0] += i;
			}
			if (isPalindrome(i, 2)) {
				sum[1] += i;
			}
			if (isPalindrome(i, 10) && isPalindrome(i, 2)) {
				sum[2] += i;
			}
		}
		System.out.println(Arrays.toString(sum));
	}

	public static boolean isPalindrome(int a, int radix) {
		StringBuilder sb = new StringBuilder(Integer.toString(a, radix));
		return sb.toString().equals(sb.reverse().toString());
	}
}
