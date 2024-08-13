package member;

public class SynchronizedEx1 implements Runnable {	
	public synchronized void a(String who) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(who + " b 호출");
		b(who);
	}
	
	//synchronized : a가 끝날 때까지 b는 대기상태
	public synchronized void b(String who) {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(who + " a 호출");
		a(who);
	}
	
	@Override
	public void run() {
		b(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		SynchronizedEx1 sch = new SynchronizedEx1();
		new Thread(sch, "첫번째").start();
		new Thread(sch, "두번째").start();
	}

}
