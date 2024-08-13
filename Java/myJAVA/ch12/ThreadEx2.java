package ch12;

class NoThread2{

	String name;
	
	public NoThread2(String name) {
		this.name = name;
	}
	
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
	
	public void start() {
		run();
	}
}

public class ThreadEx2{
	
	public static void main(String[] args) {
		NoThread2 t1 = new NoThread2("첫번째");
		NoThread2 t2 = new NoThread2("두번째");
		t1.start();
		t2.start();
	}

}
