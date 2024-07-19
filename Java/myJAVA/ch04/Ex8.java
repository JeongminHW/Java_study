package ch04;

public class Ex8 {

	public static void main(String[] args) {
		//1
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.println(" = " + sum);

		//2
		sum = 0;
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		//3
		int odd = 0;
		int even = 0;
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("홀수의 합 : " + odd + "\n짝수의 합 : " + even);
		
		//4
		sum = 0;
		for(int i = 1; i<=50; i++) {
			if(i%10==3 || i%10==6 || i%10==9 || i/10 == 3) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
