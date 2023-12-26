package study1226;

import java.util.Arrays;
import java.util.Scanner;
import test.test;

public class java_access {

//제어자 - 클래스, 변수, 메서드
// 접근제어자 - public, private, protected, default (반드시 암기, 매우중요)
// 	static, final, abstract, native 등등
	
// static - '클래스의' 또는 '공통적인'
//		  - static이 붙은 변수나 메서드는 인스턴스(객체)를 생성하지 않고 사용가능
//		  - static 변수는 인스턴스 메서드에서 사용 가능 하다.
//		  - static 메서드에서는 인스턴스변수 사용불가
//		  - static 메서드에서는오직 static 변수나, static 메서드만 사용 가능
//		  - static class 내부 클래스에 적용 하여 사용한다.
	
// final  - '마지막의' 또는 '변경될 수 없는'
//		  - final을 변수에 붙여주면 상수의 의미가 된다.(초기값 이후에 값 변경 안됨)
//		  - final이 붙은 배열의 배열내부의 값 변경은 되지만, 다른 배열로 교체는 불가능
//		  - final을 메서드에 붙여주면 해당 메서드는 오버라이딩 불가
//        - final을 class에 붙여주면 상속 할 수 없다.(추상화도 안된다.)
	
// 접근 제어자
// public - 공공의 , 제한없이 사용가능
//		  - class에 public이 붙은 경우 어디에서도 해당 클래스를 사용할 수 있다.
//		  - 인스턴스변수, 클래스변수, 인스턴트메서드, 클래스메서드 등 public이 붙지 않으면
//			객체를 생성하여도 사용하는데 제한이 있다.
	
// dafault - 같은 패키지에서만 사용가능
// protected - 같은 패키지에서만 사용가능
// 			 - 다른 패키지라도 상속관계라면 사용가능
// private - 패키지가 같아도 달라도 사용 불가
//		   - 어떠한 클래스도 사용 할 수 없음
//		   - 오직 해당 클래스 내부에서만 사용가능
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	book.cnt = 1; //클래스 변수이기 때문에 객체 생성없이 사용가능
		book bk =  new book();
		bk.title = "c언어"; // 인스턴스변수는 객체 생성후 사용가능
		book.cnt = 2;
		bk.cnt = 3; //클래스의 모든 변수
		//book.init();
		
		final int num = 10;
		//num = 20;
		final int[] arr = new int[] {10,20,30};
		arr[0] = 100;
		//arr = new int[] {20,30,40};
		//final 을 arr배열의 주소에 붙였기 때문에 실제로 저장된 값을 변경하는 것은 가능
		//하지만 arr배열 주소 자체를 변경하는 것은 불가능함
		System.out.println( Arrays.toString(arr) );
		
		book bk1 = new book();
		test sex = new test();
		sex.maker = "설날";
	}

}
