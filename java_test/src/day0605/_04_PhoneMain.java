package day0605;

public class _04_PhoneMain {
	
	public static void main(String[] args) {
		_02_PhoneInterface phone;
		_02_SamsungPhone sPhone = new _02_SamsungPhone();

		phone = sPhone;// 업캐스팅 , 인터페이스에 정의된 메서드와 속성에만 접근가능
		
		sPhone = (_02_SamsungPhone)phone;//다운캐스팅

	}

}
