package ch04;

public class Ex9 {

	public static void main(String[] args) {
		// while문을 이용해서 1~10까지의 합
		int sum = 0;
		int i = 0;
		while (i < 11) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		while(true) {
			System.out.println("무한반복");
			if(true) 
				break; //자기를 감싸고있는 반복문 탈출
		}
		
		do {
			System.out.println("무조건 한 번은 실행");
		} while (false);
	}

}
