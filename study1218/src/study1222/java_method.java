package study1222;

import java.util.Scanner;

public class java_method {
	static Scanner scan = new Scanner(System.in);
	static mart[] mart_list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mart_init(); //제품등록이 첫번째 실행 되어야 한다.
		buyer 노재홍 = buyer_enroll(); //구매자 등록 ( buyer 클래스 객체 생성)
		put( 노재홍 ); //물건을 구매하기 위한 메서드, 더이상 구매하지 않아야 메서드가 종료된다.
		buy( 노재홍 ); 
	}
	
	static void buy( buyer 노재홍) {
		while(true) {
			System.out.println( 노재홍 );
			System.out.print("장바구니의 물건들을 결제 하시겠습니까?(y/n) : ");
			char yn = scan.nextLine().charAt(0);
			if( yn == 'y' || yn == 'y') {//현재 장바구니의 모든 물건 구매시
				노재홍.payment();
				break; // 결제 완료되면 buy 메서드 종료
			}else { //결제 보류 - 장바구니에서 빼기
				노재홍.basket_remove();
			}
			System.out.println("지불하셔야 되는 금액 : " + 노재홍.total_price());
		}
	}
	
	static void put( buyer 노재홍 ) {
		while(true) {
			System.out.println("=================== 목록 ================= \n");
			view();
			System.out.println("물건의 번호를 입력(0입력시 중단) : ");
			int num = scan.nextInt();
			scan.nextLine(); //숫자 다음에 문자열 입력시 입력버퍼를 비우는 과정.
			if( num == 0 ) break; //구매중단 하면 while문 종료
			if( !(num >= 1 && num <= mart_list.length) ) {
				System.out.println("잘못된 번호 다시 입력");
				continue; //제품번호를 잘못 입력시 다시 반복문 실행;
			}
			
			노재홍.basket_add( mart_list[num-1] ); //장바구니 크기 증가 - 두번째 물건을 담을때 부터
			System.out.println("장바구니 확인 하시겠습니까? (y/n) : " );
			char yn = scan.nextLine().charAt(0);
			if ( yn == 'y' || yn == 'Y') {
				System.out.println( 노재홍 );
			}
		}
	}
	
	
	
	static buyer buyer_enroll() {
		int num = (int)(Math.random()*40000)+10000;
		System.out.println("구매자 성함을 입력하세요 : ");
		String name = scan.nextLine();
		buyer 노재홍 = new buyer(num, name);
		노재홍.basket = new mart[1]; //장바구니 공간 1개 생성 - 추후 제품을 장바구니에 담으면서 늘어나게 변경
		return 노재홍;
	}
	
	
	static void view() {
		for(int i = 0; i<mart_list.length; i++) {
			System.out.println( (i+1) + ". " + mart_list[i] );
		}
	}

	static void mart_init() {
		mart_list = new mart[] {
			new mart("빼빼로",1300,"과자",3000 ), new mart("동원참치",2890,"통조림",5000),
			new mart("오이비누(4개입)",5890,"공산품",450), new mart("신라면(5개입)",4300,"라면",5234),
			new mart("짜파게티(4개입)",6430,"라면",5482), new mart("햇반(6개)",6700,"즉석식품",312),
			new mart("비비고육개장",1560,"즉석식품",105), new mart("야채참치",2450,"통조림",150),
			new mart("골뱅이",5400,"통조림",453), new mart("먹태깡",1700,"과자",47),
			new mart("샤토마니",30000,"와인",128), new mart("발비 소프라니",31000,"와인",1248)
			
		};
	}
	
}
