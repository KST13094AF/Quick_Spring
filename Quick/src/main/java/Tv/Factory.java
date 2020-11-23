package Tv;
// 디자인 패턴 
// 결합도를 낮춤
public class Factory {
	public static Object getBean(String bean) {
		if(bean.equals("Samsung"))
			return new SamsungTv();
		else if(bean.equals("LgTv"))
			return new LgTv();
		return null;
	}
}	
