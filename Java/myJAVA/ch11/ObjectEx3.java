package ch11;

// == : 객체 번호값 (주소값, hashcode값) 비교하는 비교연산자
// equals() : 문자열이 갖고있는 문자 값을 비교하는 메소드
class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // instanceof (예약어) : 연산자 // obj가 멤버 객체 타입인지 아닌지 연산
			Member member = (Member) obj;
			if(id.equals(member.id))
				return true;
		}
		return false;
	}
}

public class ObjectEx3 {

	public static void main(String[] args) {
		Member m1 = new Member("aaa");
		Member m2 = new Member("aaa");
		Member m3 = new Member("bbb");
		
		if(m1.equals(m2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		if(m1.equals(m3))
			System.out.println("같음");
		else
			System.out.println("다름");
	}

}
