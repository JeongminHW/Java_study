package ch11;

// StringBuffer : 멀티 쓰레드에서 동기화 가능
// StringBuilder : 단일 쓰레드에서 동기화 불가능
public class PalindromeEx1 {

	public static final int MAX = 100000;

	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다. 대칭수(palindrome)인
		 * 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
		 */

		// 문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		/*int sum = 0;
		
		for (int i = 0; i <= MAX; i++) {
			String num = String.valueOf(i);
			
			if(num.length() == 1) {
				if(num.charAt(0) == num.charAt(0)){
					sum += Integer.parseInt(num);
				}
			}
			if (num.length() == 2) {
				if (num.charAt(0) == num.charAt(1)) {
					sum += Integer.parseInt(num);
				}
			}
			if(num.length() == 3) {
				if(num.charAt(0) == num.charAt(2)){
					sum += Integer.parseInt(num);
				}
			}
			if (num.length() == 4) { // 10 01
				if (num.substring(0, 2).equals(num.substring(3, 4) + num.substring(2, 3))) {
					sum += Integer.parseInt(num);
				}
			}
			if(num.length() == 5) { 
				if(num.substring(0, 2).equals(num.substring(4, 5) + num.substring(3, 4))) {
					sum += Integer.parseInt(num);
				}
			}
			if (num.length() == 6) {
				if (num.substring(0, 3).equals(num.substring(5, 6) + num.substring(4, 5) + num.substring(3, 4))) {
					sum += Integer.parseInt(num);
				}
			}
			
		}
		System.out.println(sum);*/

		int i = 1;
		int sum = 0;
		while (i <= MAX) {
			String s = String.valueOf(i);
			StringBuilder sb = new StringBuilder(s);
			if (s.equals(sb.reverse().toString())) { // 문자로 비교하기 위해 toString
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

		// 문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		/*for(i = 1; i <= MAX; i++) {
			String num = String.valueOf(i);
			int Onum = Integer.parseInt(num);
			StringBuffer sb = new StringBuffer(Integer.toBinaryString(Onum));
			if(sb.equals(sb.reverse()))
				System.out.println(sb);
		}*/

		i = 1;
		sum = 0;
		while (i <= MAX) {
			String s = Integer.toBinaryString(i);
			StringBuilder sb = new StringBuilder(s);
			if (s.equals(sb.reverse().toString())) { // 문자로 비교하기 위해 toString
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

		// 문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		i = 1;
		sum = 0;
		while (i <= MAX) {
			String s2 = Integer.toBinaryString(i);
			String s10 = String.valueOf(i);
			StringBuilder sb2 = new StringBuilder(s2);
			StringBuilder sb10 = new StringBuilder(s10);
			if (s2.equals(sb2.reverse().toString()) && s10.equals(sb10.reverse().toString())) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
