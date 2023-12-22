package study1222;

import java.util.Scanner;

public class buyer {
	int member_num; //ȸ�� ��ȣ
	String member_name; //ȸ�� �̸�
	int expend; //���� �ݾ�
	mart[] basket; // ��ٱ���
	int cnt = 0;
	
	buyer(){};
	buyer(int num, String name){
		this.member_name = name;
		this.member_num = num;
	}
	
	@Override
	public String toString() {
		String out = "=================== ��� ================= \n" +
				"ȸ����ȣ : " + member_num + " ȸ���� : " + member_name +"\n" +
					 "�庸���� ��� \n";
		for(int i = 0; i < basket.length; i++) {
			out += (i+1) + ". " + basket[i] + "\n";
		}
		out += "�� ���� �ݾ� : " + total_price();
		return out;
		}
	String total_price() {
		//��ٱ��Ͽ� ����ִ� ������ �ѱݾ��� ���ϰ� õ���� �޸��� ��ȯ�Ͽ� return �ϼ���
		int total = 0;
		for(int i = 0; i < basket.length; i++) {
			total += basket[i].price;
		}
		String total_ = Integer.toString( total ).replaceAll("\\B(?=(\\d{3})+(?!\\d))",",");
		return total_+"��";
		}
	void basket_add( mart item ) {
		if( cnt >= 1) {
			mart[] temp = new mart[cnt+1];
			for(int i = 0; i < basket.length; i++) {
				temp[i] = basket[i]; //���� �迭�� ���� ���ο� �迭�� �Ѱ��ֱ�
			}
			basket = temp; //���ο� �迭�� �ּҸ� �޾Ƽ� ���� �迭 ������
			
		}
		basket[cnt] = item;
		cnt++;
	}
	
	void payment() { // ��ٱ����� ���� ���� ����, ��� ���� , basket �迭 ����
		expend = Integer.parseInt( total_price().replaceAll("[^0-9]","") );
		System.out.println( "�����ݾ��� " + total_price() + " �Դϴ�.");
		basket = null;
	}
	
	void basket_remove() {
		Scanner scan = new Scanner(System.in);
		System.out.println( this );
		System.out.print("���� �� ���� ��ȣ �Է� : ");
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

