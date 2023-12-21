package study1221;

import java.util.Scanner;

public class main_method {

	static Scanner scan = new Scanner(System.in);
	// static - 클래스(static) 메서드에서는 오직 static 변수나, static 메서드만 사용 가능
	//			static 메서드에서 인스턴스 변수와 인스턴스 메서드는 사용 불가	
	public static void search( student[] std, String name) {//이름으로 검색하여 성적 조회
		boolean isStd = false;
		
		for( int i = 0; i < std.length; i++) {
			if( std[i].name.equals(name) ) {
				System.out.println( std[i] );
				isStd = true;
			}
		}
		if(!isStd)
			System.out.println("없어용");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		student[] std = new student[6]; //참조변수
			std[0] = new student("이순신",64,56,80);
			std[1] = new student("김유신",80,54,12);
			std[2] = new student("아리에스타",15,30,78);
			std[3] = new student("메시",8,48,67);
			std[4] = new student("호날두",1,3,7);
			std[5] = new student("캐리어",56,100,100);
			
			
			System.out.println("조회할 학생 이름 입력 : ");
			String name = scan.nextLine();
			
			search( std , name );
			
//		student s = new student();
		
//		student std = new student( "이순신", 90, 66, 12); // student클래스 객체를 생성해서 참조변수 std에 저장
////		std.name = "이순신";
////		std.kor = 90;
////		std.mat = 66;
////		std.eng = 12;
//		std.total = (std.kor + std.mat + std.eng)/3;
//		std.avg = std.total/3;
//		System.out.println( std );
		
		
		
	}

}
