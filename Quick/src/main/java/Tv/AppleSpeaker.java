package Tv;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("---- AppleSpeaker 객체 생성 ----");
	}
	
	@Override
	public void volumDown() {
		System.out.println("AppleSpeaker 볼륨업");
	}
	@Override
	public void volumUp() {
		System.out.println("AppleSpeaker 볼륨다운");	
	}
}
