package Tv;
// ������ ���� 
// ���յ��� ����
public class Factory {
	public static Object getBean(String bean) {
		if(bean.equals("Samsung"))
			return new SamsungTv();
		else if(bean.equals("LgTv"))
			return new LgTv();
		return null;
	}
}	
