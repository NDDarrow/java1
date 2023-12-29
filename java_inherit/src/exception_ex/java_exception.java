package exception_ex;

import java.util.Scanner;

public class java_exception {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name = "노재홍";
		int score = 0;
		int[] num = {};
		
		try {
			score = scan.nextInt();
			
			System.out.println( "이름 : " + name.concat("님") );
			System.out.println( score/ num.length);
		}catch(java.lang.NullPointerException e) {
			System.out.println("이름을 입력하세요");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("성적을 입력하세요");
		}
	
//		try {
//			String name;
//			name = scan.nextLine();
//			
//			System.out.println( name.charAt(0));
//			
//			System.out.println( name );
//		}catch( Exception e) { //Exception 모든 예외처리중에 제일 쎈놈
//			System.out.println("이름을 입력하세요");
//		}
		
//		//try - catch 문
//		try { //오류가 발생할 것 같은 코드를 삽입
//			int num = 10;
//			
//			System.out.println( num/0 );
//			
//			
//			
//		}catch ( java.lang.ArithmeticException e) {
//			System.out.println( e.getMessage() );
//			e.printStackTrace();
//			System.out.println("0으로 나누기 할 수 없습니다.");
//		}
//		System.out.println( "프로그램 종료");
//		//예외처리 - 오류가나면 프로그램이 종료되야 하지만 일단 회피해서 프로그램이 '실행'은 되게 하는거
	}
}
