package study1220;

import java.util.Arrays;

public class what{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 m1 = new class1();
		class1.company = "조선";
		
		m1.age = 40;
		m1.name = "이순신";
		m1.num = 101;
		
		System.out.println(m1);
		
		//교재 208page ~ 218page
		//클래스 란 - 사용자 정의 데이터 타입
		//			기존의 기본 데이터 타입이 아닌 새로운 형태의 타입을
		//			직접 정의 하는것,
		//			기본 데이터타입과의 차이점은, 여러종류의 데이터를 다룰수도 있으며
		//			기능(메서드)을 정의 할 수 있다.
		
		// 하나의 변수에 다른 종류의 데이터를 넣을수 없었기 때문에 구조체(struct)가 생겨남
		// 구조체는 사용자가 정의하는 타입
		// 이러한 구조체는 다양한 데이터 종류를 가지고 있다보니 함수를 사용하는데 구조체를 함수와 연동하는 과정에서 많은 시간이 필요해짐
		// 이러한 구조체의 장점을 살리며 단점을 보완하기 위해 클래스(class)를 사용하게 됨
		// 자바에서는 클래스 중심으로 개발을 해야 한다.( 반드시는 아니고)
		
		// 변수 - 지역변수(만들어진 곳 외에서 사용 불가), 인스턴트 변수, 클래스변수
		// 지역변수 - 자바스크립트와 동일
		// 인스턴트변수 - 클래스의 멤버 변수 (클래스 객체의 실제 데이터를 저장하는 변수)
		// 클래스변수 - 클래스의 전역변수 (공유 변수)
		
//			car c1 = new car(); // 클래스의 객체생성(인스턴스 생성)
//			c1.car_num = 8069;
//			c1.car_name = "qm5";
//			System.out.println( c1 );
//			
//			car c2 = new car();
//			c2.car_num = 1559;
//			c2.car_name = "렉스턴";
//			c2.car_num = c2.up();
//			
//			System.out.println(c2);
//			
//			car[] c = new car[10]; //car 클래스의 참조변수 10개 생성
//			for( int i = 0; i< c.length; i++) {
//				c[i] = new car(); //car 클래스의 객체 생성(인스턴트 변수 와 메서드 공간생성)
//				c[i].car_num = i + 1000 +(int)(Math.random()*9000);
//				c[i].car_name = "소나타"+i;
//				System.out.println(c[i]);
//			}
			
		}

}

class car{ // 클래스명이 car 인 클래스 정의, 클래스의 정의 부분이고 공간생성이 아니다.
		   // car라는 클래스를 생성하면 car()라는 메소드가 자동 생성됨
	int car_num; //인스턴트 변수
	String car_name; //인스턴트 변수
	
	public String toString() {
		return car_num + " " + car_name;
	}
	public int up() {
		return car_num +1000;
	}
}

