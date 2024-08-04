package ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[0]= 1;
			arr[1]= 1;
			arr[2]= 1;
			arr[3]= 1;
		} catch (Exception e) {
			e.printStackTrace(); //디버깅 목적
		} finally {
			//예외 관계없이 무조건 실행
			System.out.println("fin");
		}
		
		// try는 catch or finally랑같이 사용해야함
		try {
			
		} finally {
		}
	}

}
