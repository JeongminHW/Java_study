package ch12;

class Runnable1 implements Runnable{
	String name;
	
	public Runnable1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(200);
				System.out.println(name + " : " + i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableEx1 {

	public static void main(String[] args) {
		Runnable1 r1 = new Runnable1("하나");
		Runnable1 r2 = new Runnable1("둘");
		//스레드 객체 생성
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
