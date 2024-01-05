package cafe;

public class Order {
	// 전체 메뉴 보여주는 메소드 - 분류(커피, 음료, 빽스치노) 선택 -> 해당 분류에서 제품 이름 입력하여 주문
	// 커피메뉴를 선택하여 보다가 음료메뉴를 보고싶으면 이동하여 보이게 해줘야 한다.
	public static void kiosk() {
		System.out.println("\n==========주문==========\n");
		
		Category main =  Category.커피;
		while(true) {
		System.out.println("1.커피  2.음료  3.빽스치노");
		
		
		}
	}
	
	// 주문 진행하는 메서드 - 주문할 제품을 선택했다면 결제까지 진행 되는 메서드
	
	
	// 주문 내역을 Order_history를 통해 저장하는 메서드
	
}
