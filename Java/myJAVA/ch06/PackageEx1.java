package ch06;


// 패키지명은 도메인 뒤에 들어감
import com.mysql.cj.jdbc.Driver;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.util.Date;

public class PackageEx1 {

	public static void main(String[] args) throws Exception {
		Driver d = new Driver();
		Frame f = new Frame();
		Button btn = new Button();
		ActionEvent ae;
		//Date : javaj.util, java.sql
		//많이 사용하는 클래스는 임포트, 적게 사용하는 클래스는 풀네임으로 사용
		Date date = new Date();
	}

}
