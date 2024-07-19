package ch06;

//부모 클래스
class Person {
	String name;
	int age;

	//this : 자신의 객체를 가리키는 키워드, 내 자신의 객체 속성의 필드 호출 시 사용
	Person(String name, int age) {
		super(); //Object 객체 생성
		this.name = name;
		this.age = age;
	}
	
	//Person 클래스의 정보를 출력하는 메소드
	void displayInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Employee extends Person{
	String department;
	
	Employee(String name, int age, String department){
		super(name, age); //Person에는 디폴트 생성자가 없음
		this.department = department;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo(); //부모의 메소드 호출
		System.out.println(department);
	}
}

public class ConstructorEx4 {

	public static void main(String[] args) {
		Person ps = new Person("홍길동", 24);
		Employee em = new Employee("아무개", 20, "인사과");
		em.displayInfo();
	}

}
