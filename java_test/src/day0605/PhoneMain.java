package day0605;

public class PhoneMain {
	
	public static void main(String[] args) {
		PhoneInterface phone;
		SamsungPhone sPhone = new SamsungPhone();

		phone = sPhone;// 업캐스팅 , 인터페이스에 정의된 메서드와 속성에만 접근가능
		
		sPhone = (SamsungPhone)phone;//다운캐스팅

	}

}
