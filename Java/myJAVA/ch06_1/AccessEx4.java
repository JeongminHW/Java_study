package ch06_1;

class Access4{
	private int a;
	protected int b; //같은 패키지에서는 public으로 동작
	public int c;
}

public class AccessEx4 {
	
	private int a;
	protected int b;
	public int c;

	public static void main(String[] args) {
		Access4 ac = new Access4();
		ac.b = 10;
		ac.c = 20;
	}

}
