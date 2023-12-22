package study1222;

import java.util.Scanner;

public class java_method {
	static Scanner scan = new Scanner(System.in);
	static mart[] mart_list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mart_init(); //��ǰ����� ù��° ���� �Ǿ�� �Ѵ�.
		buyer ����ȫ = buyer_enroll(); //������ ��� ( buyer Ŭ���� ��ü ����)
		put( ����ȫ ); //������ �����ϱ� ���� �޼���, ���̻� �������� �ʾƾ� �޼��尡 ����ȴ�.
		buy( ����ȫ ); 
	}
	
	static void buy( buyer ����ȫ) {
		while(true) {
			System.out.println( ����ȫ );
			System.out.print("��ٱ����� ���ǵ��� ���� �Ͻðڽ��ϱ�?(y/n) : ");
			char yn = scan.nextLine().charAt(0);
			if( yn == 'y' || yn == 'y') {//���� ��ٱ����� ��� ���� ���Ž�
				����ȫ.payment();
				break; // ���� �Ϸ�Ǹ� buy �޼��� ����
			}else { //���� ���� - ��ٱ��Ͽ��� ����
				����ȫ.basket_remove();
			}
			System.out.println("�����ϼž� �Ǵ� �ݾ� : " + ����ȫ.total_price());
		}
	}
	
	static void put( buyer ����ȫ ) {
		while(true) {
			System.out.println("=================== ��� ================= \n");
			view();
			System.out.println("������ ��ȣ�� �Է�(0�Է½� �ߴ�) : ");
			int num = scan.nextInt();
			scan.nextLine(); //���� ������ ���ڿ� �Է½� �Է¹��۸� ���� ����.
			if( num == 0 ) break; //�����ߴ� �ϸ� while�� ����
			if( !(num >= 1 && num <= mart_list.length) ) {
				System.out.println("�߸��� ��ȣ �ٽ� �Է�");
				continue; //��ǰ��ȣ�� �߸� �Է½� �ٽ� �ݺ��� ����;
			}
			
			����ȫ.basket_add( mart_list[num-1] ); //��ٱ��� ũ�� ���� - �ι�° ������ ������ ����
			System.out.println("��ٱ��� Ȯ�� �Ͻðڽ��ϱ�? (y/n) : " );
			char yn = scan.nextLine().charAt(0);
			if ( yn == 'y' || yn == 'Y') {
				System.out.println( ����ȫ );
			}
		}
	}
	
	
	
	static buyer buyer_enroll() {
		int num = (int)(Math.random()*40000)+10000;
		System.out.println("������ ������ �Է��ϼ��� : ");
		String name = scan.nextLine();
		buyer ����ȫ = new buyer(num, name);
		����ȫ.basket = new mart[1]; //��ٱ��� ���� 1�� ���� - ���� ��ǰ�� ��ٱ��Ͽ� �����鼭 �þ�� ����
		return ����ȫ;
	}
	
	
	static void view() {
		for(int i = 0; i<mart_list.length; i++) {
			System.out.println( (i+1) + ". " + mart_list[i] );
		}
	}

	static void mart_init() {
		mart_list = new mart[] {
			new mart("������",1300,"����",3000 ), new mart("������ġ",2890,"������",5000),
			new mart("���̺�(4����)",5890,"����ǰ",450), new mart("�Ŷ��(5����)",4300,"���",5234),
			new mart("¥�İ�Ƽ(4����)",6430,"���",5482), new mart("�޹�(6��)",6700,"�Ｎ��ǰ",312),
			new mart("����������",1560,"�Ｎ��ǰ",105), new mart("��ä��ġ",2450,"������",150),
			new mart("�����",5400,"������",453), new mart("���±�",1700,"����",47),
			new mart("���丶��",30000,"����",128), new mart("�ߺ� �������",31000,"����",1248)
			
		};
	}
	
}
