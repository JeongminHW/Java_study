package ch08;


// 추상클래스에는 반드시 추상메소드가 선언 되어야 한다? 선언이 되지 않아도 괜찮음
abstract class Tv{
	String color;
	boolean power;
	int ch;
	
	void onoffPower() {
		power =! power;
	}
	
	void upCh() {
		ch++;
	}
	
	void downCh() {
		ch--;
	}
	
	abstract void setModel();
}

interface RemoteControl{
	void turnOn();
	void turnOff();
}

class SStv extends Tv implements RemoteControl{

	@Override
	void setModel() {}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
	
}

class LGtv extends Tv implements RemoteControl{
	
	@Override
	void setModel() {}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
	
}


public class InterfaceEx4 {

	public static void main(String[] args) {

	}

}
