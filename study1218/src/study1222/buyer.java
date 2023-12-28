package study1222;

import java.util.Scanner;

public class buyer {
	int member_num; //회원 번호
	String member_name; //회원 이름
	int expend; //지불 금액
	mart[] basket; // 장바구니
	int cnt = 0;
	
	buyer(){};
	buyer(int num, String name){
		this.member_name = name;
		this.member_num = num;
	}
	
	@Override
	public String toString() {
		String out = "=================== 목록 ================= \n" +
				"회원번호 : " + member_num + " 회원명 : " + member_name +"\n" +
					 "장보구니 목록 \n";
		for(int i = 0; i < basket.length; i++) {
			out += (i+1) + ". " + basket[i] + "\n";
		}
		out += "총 결제 금액 : " + total_price();
		return out;
		}
	String total_price() {
		//장바구니에 담겨있는 물건의 총금액을 구하고 천단위 콤마로 변환하여 return 하세요
		int total = 0;
		for(int i = 0; i < basket.length; i++) {
			total += basket[i].price;
		}
		String total_ = Integer.toString( total ).replaceAll("\\B(?=(\\d{3})+(?!\\d))",",");
		return total_+"원";
		}
	void basket_add( mart item ) {
		if( cnt >= 1) {
			mart[] temp = new mart[cnt+1];
			for(int i = 0; i < basket.length; i++) {
				temp[i] = basket[i]; //기존 배열의 값을 새로운 배열에 넘겨주기
			}
			basket = temp; //새로운 배열의 주소를 받아서 기존 배열 버리기
			
		}
		basket[cnt] = item;
		cnt++;
	}
	
	void payment() { // 장바구니의 물건 전부 구입, 비용 지불 , basket 배열 비우기
		expend = Integer.parseInt( total_price().replaceAll("[^0-9]","") );
		System.out.println( "결제금액은 " + total_price() + " 입니다.");
		basket = null;
	}
	
	void basket_remove() {
		Scanner scan = new Scanner(System.in);
		System.out.println( this );
		System.out.print("제외 할 물건 번호 입력 : ");
		int num =scan.nextInt();
		
		for(int i = num; i < basket.length; i++) {
			basket[i-1] = basket[i];
		}
		mart [] temp = new mart[basket.length-1];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = basket[i];
		}
		basket = temp;
	}
	
}

