package study12182;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
	
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		// 16���� ������ �ߺ����� �迭�� �����ϱ�
		int[] number = new int[16];
		for( int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*50)+1;
			for( int j = 0; j < i; j++) {
				if(number[j] == number[i]){
					i--;
					break;
				}
			}
		}
//�ڹٽ�ũ��Ʈ �迭�� Ư���� ���翩�� - indexOf(Ư����), includes(Ư����)
//�ڹ� �迭�� indexOf, includes�� ����
// indexOf�� contains�� ���翩�θ� �� �� ������ String�� List Ŭ���������� ��밡��
		System.out.println(Arrays.toString(number));
		
		//number �迭�� ���ٿ� 4���� 4�ٷ� ����ϼ���
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j<4; j++) {
//				System.out.print(number[j+(i*4)]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("����������������������������������");
//		for(int i = 0; i < number.length; i++) {
//			if( i%4 == 0 && i != 0)
//				System.out.printf("��\n����������������������������������\n");
//			System.out.printf( "��%2d ", number[i] );
//		}
//		System.out.printf("��\n����������������������������������");
		
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 100;
		arr2[0][1] = 30;
		
		arr2[1][0] = 50;
		arr2[1][1] = 10;
		
		int[][] bingo = new int[][] {
			{24,12,45,11}, {9,4,12,31}, {5,41,39,17}, {1,50,43,22}
		};
		for( int i = 0; i <bingo.length; i++) {
			for(int k =0; k < bingo[i].length; k++) {
				if(bingo[i][k] > 25) {
					System.out.printf(" %2d",bingo[i][k]);
				}else
					System.out.printf(" %2s","��");
			}
			System.out.println();
		}
		//ũ�Ⱑ ���� �ٸ� 2���� �迭
		//int[] a, b, c;
		
		int[][] arr5 = new int[3][];
		int[] a = new int[] {1,2,3,4,5};
		int[] b = {10,20,30};
		int[] c = {11,22,33,44,55,66,77};
		
		arr5[0] = a;
		arr5[1] = b;
		arr5[2] = c;
		//ũ�Ⱑ �ٸ� �迭�� �̷���� ������ �迭�� ������迭�̶�� ��
		
		for(int i = 0; i < arr5.length; i++) {
			for(int k = 0; k < arr5[i].length; k++) {
				System.out.print(arr5[i][k]+" ");
			}
			System.out.println();
		}
		//�ڹٽ�ũ��Ʈ - �迭�� ������ �Ǽ��� ���ڿ��� ���������� ������ �� �ִ�.
		//�ڹ� - �迭������ �ο��� ������ Ÿ�Կ� �´� �����͸� ���� ����
		
//		int num11 = scan.nextInt();
//		scan.nextLine(); //���� �Է��� ���� �Է½� ���ۿ� ���Ͱ� ���Ƽ� ���͸� ���ִ°���
//		String word = scan.nextLine();
//		System.out.println( num11 + " "+ word );
		
		String[][] info = new String[3][3];
		String[] key = {"�̸�","����","����"};
		
		for(int i = 0; i < info.length; i++) {
			System.out.print("�̸� : ");
			info[i][0] = scan.nextLine();
			System.out.print("���� : ");
			int age = scan.nextInt();
			info[i][1] = Integer.toString(age); // Integer.toString �������� ���ڿ��� ���� float �Ǽ��� ���ڿ��� ����
												// Integer.parseInt(); ���ڿ��� ���ڷ� ����
												// Float.parseFloat(); Double.parseDouble();
			scan.nextLine();
			System.out.print("���� : ");
			info[i][2] = scan.nextLine();
		}
		for(int i = 0; i < info.length; i++) {
			for(int k = 0; k < info[i].length; k++) {
				System.out.printf("%s : %3s ",key[k],info[i][k]);
			}
			System.out.println();
		}
	}
}
