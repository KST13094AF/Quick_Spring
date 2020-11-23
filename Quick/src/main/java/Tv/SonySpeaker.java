package Tv;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("---- SonySpeaker 객체 생성 -----");
	}
	
	@Override
	public void volumUp() {
		System.out.println(" SonySpeaker 볼륨업 ");
	}
	
	@Override
	public void volumDown() {
		System.out.println(" SonySpeaker 볼륨다운 ");
	}
}
