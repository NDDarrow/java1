package inherit_test;
//교재 307쪽
public abstract class house {

	public static int makedate = 20231209; //클래스 변수 poly 패키지 연동용
	
	public boolean onoff;
	String brand;
	public int sn = 10000; //poly 패키지 연동용
	protected house(){
		onoff = false;
		System.out.println("나는 부모 house 클래스 생성자~");
	}
	
	protected house(String brand){
		this.brand = brand;
	}
	
	public abstract void power(); // 중괄호가 빠지고 세미콜론으로 닫은 메서드 = 추상메서드
	
	// 추상메서드는 앞에 abstract를 삽입
	// 추상 메서드를 가진 클래스는 반드시 추상 클래스가 되어야 한다.
	// class 앞에 abstract를 삽입
	// 부모클래스가 추상클래스라면 자식클래스는 부모의 모든 추상메서드를 구현해야한다.
	// 부모가 가진 추상클래스는 자식클래스에 반드시 생성되어야함
	// 부모에게 받은 추상메서드를 자식이 구현하지 않을꺼라면 자식클래스는 추상클래스가 되어야 한다.
	// 추상 클래스는 객체 생성이 안된다.
	// 추상 메서드는 내용이 없는 메서드라서 메모리 공간을 할당 받지 못한다.
	// 메모리 공간을 할당 받지 못하기 때문에 추상메서드를 가진 클래스는 객체 공간 할당 못받는다.
	
}







