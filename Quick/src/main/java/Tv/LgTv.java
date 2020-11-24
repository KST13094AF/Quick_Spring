package Tv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 컴포넌트 설정하게 되면 스프링 컨테이너가 스캔하면서 객체 등록해줌
// 하지만 클라이언트에서 불러와야 할 경우 이름으로 불러와야 하기 때문에 밑에 처럼 표기
// id or name을 설정하지 않는 경우 컨네이터가 설정하며 클래스 첫 글자를 소문자로 바꾼 것이 id가 된다.
@Component("LgTv")
public class LgTv implements TV{
	
	// 의존성 에노테이션 Autowired
	// 생성자, 메소드, 맴버변수 위헤 사용 할 수 있다.
	// 컨테이너가 해당 변수 타입을 확인한 후 그 타입의 객체를 메모라 상에 찾아 변수에 주입함.
	
	// 문제는 어느 객체에 의존성을 주입할 것이냐 ? 메모리 상의 같은 타입의 객체가 둘 이상일 경우
	// 이럴 때 @Qualifier("id") 에노테이션 사용
	// Autowired 의존성 주입 객체가 두개 이상일 경우 Exception -> NouniequeBeanDefintionException
	@Autowired
	@Qualifier("apple")
	private Speaker s;
	
	public void powerOn() {
		System.out.println("LG Tv on");
	}
	
	public void powerOff() {
		System.out.println("LG Tv off");
	}
	
	public void volumUp() {
		s.volumUp();
	}
	
	public void volumDown() {
		s.volumDown();
	}
}
