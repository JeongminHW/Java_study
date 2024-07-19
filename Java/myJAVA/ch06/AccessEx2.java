package ch06;

class Access2 { //public으로 선언하지 않으면 사용시 오류
	private String name;
	private int age;

	//Getter, Setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName()	{
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0)
			age = 0;
		this.age = age;
	}
	
}

public class AccessEx2 {
	public static void main(String[] args) {
		Access2 a2 = new Access2();
		a2.setName("홍길동");
		a2.setAge(20);
		System.out.println(a2.getAge() + "\t" + a2.getName());
	}

}
