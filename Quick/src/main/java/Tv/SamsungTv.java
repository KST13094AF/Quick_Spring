package Tv;

public class SamsungTv implements TV {
	
	private Speaker speaker;
	private int price;
	
	public SamsungTv() {
		System.out.println("----- Samsung Tv 객체 생성 (생성자:디폴트) -----");
	}
	
	public SamsungTv(Speaker sony) {
		System.out.println("----- Samsung Tv 객체 생성 (생성자:인자1) -----");
		this.speaker = sony;
	} 
	
	public SamsungTv(Speaker sony, int price) {
		System.out.println("----- Samsung Tv 객체 생성 (생성자:인자2) -----");
		this.speaker = sony;
		this.price = price;
	}

	public void init() {
		System.out.println("----- Samsung Tv 초기화 메소드 호출 -----");
	}
	
	public void destroy() {
		System.out.println("---- Samsung Tv 종료전 메소드 호출 -----");
	}
	
	public void powerOn() {
		System.out.println("Samsung Tv on (가격: "+price+")");
	}
	
	public void powerOff() {
		System.out.println("Samsung Tv off");
	}
	
	public void volumUp() {
		speaker.volumUp();
	}
	
	public void volumDown() {
		speaker.volumDown();
	}

	public Speaker getSeapker() {
		return speaker;
	}

	public void setSpeaker(Speaker sony) {
		System.out.println("--- Samsung Tv SetSony ---");
		this.speaker = sony;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("--- Samsung Tv SetPrice ---");
		this.price = price;
	}

}