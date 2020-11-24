package Tv;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("HansungTv")
public class HansungTv implements TV {
	
	// @Resource 에노테이션
	// name 속성을 사용하여 스프링 컨테이너가 해당 이름으로 의존성을 주입한다.
	@Resource(name="sony")
	private Speaker s;
	
	public HansungTv() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void powerOn() {
		System.out.println(" 한성 티비 온 ");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println(" 한성 티비 오프 ");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub
		s.volumUp();
	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		s.volumDown();
	}
	
}
