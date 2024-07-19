package ch04;

public class Ex10 {

	public static void main(String[] args) {
		// break, continue
		/*
		 * int a = 0; while(true) { if(a==10) break; System.out.println(a); a++; }
		 */

		// for문을 이용해서 1~n까지의 합이 100에서 최대한 가까운 합 리턴
		int sum = 0;
		for (int i = 1; true; i++) {
			sum += i;
			if (sum > 100) {
				break;
			}
		}
		System.out.println(sum);

		// for문을 이용하여 순차적으로 1에서 n까지의 합이 100이하에 가장 가까운 n과 sum 값 리턴
		sum = 0;
		int i;
		for (i = 1; true; i++) {
			sum += i;
			if (sum > 100) {
				sum -=i;
				i--;
				break;
			}
		}
		System.out.println("n : " + i + "\nsum : " + sum);


		//1~10 사이의 짝수 출력
		for(int j = 1; j<=10; j++) {
			if(j%2==0) System.out.println(j);
		}
		
		for(int j = 1; j <=10; j++) {
			if(j%2!=0) 
				continue;
			System.out.println(j);
		}
		
		
		//1~20 사이의 3의 배수, 식, 합 출력 continue사용
		sum = 0;
		for(int j = 1; j<=20;j++) {
			/*
			 * if(j%3==0 & j<18) { sum += j; System.out.printf(j+" + "); continue; } else
			 * if(j==18) { sum +=j; System.out.print(j); }
			 */
			if(j%3!=0) {
				continue;
			}
			System.out.print(j);
			if(i>3)
				System.out.print(" + ");
			sum+=j;
		}
		System.out.println(" = " + sum);
		
	}
}
