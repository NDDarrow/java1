package study12182;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
	
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		// 16개의 정수를 중복없이 배열에 저장하기
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
//자바스크립트 배열에 특정값 존재여부 - indexOf(특정값), includes(특정값)
//자바 배열엔 indexOf, includes가 없다
// indexOf와 contains로 존재여부를 알 수 있지만 String과 List 클래스에서만 사용가능
		System.out.println(Arrays.toString(number));
		
		//number 배열을 한줄에 4개씩 4줄로 출력하세요
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j<4; j++) {
//				System.out.print(number[j+(i*4)]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("┌───┬───┬───┬───┐");
//		for(int i = 0; i < number.length; i++) {
//			if( i%4 == 0 && i != 0)
//				System.out.printf("│\n├───┼───┼───┼───┤\n");
//			System.out.printf( "│%2d ", number[i] );
//		}
//		System.out.printf("│\n└───┴───┴───┴───┘");
		
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
					System.out.printf(" %2s","★");
			}
			System.out.println();
		}
		//크기가 서로 다른 2차원 배열
		//int[] a, b, c;
		
		int[][] arr5 = new int[3][];
		int[] a = new int[] {1,2,3,4,5};
		int[] b = {10,20,30};
		int[] c = {11,22,33,44,55,66,77};
		
		arr5[0] = a;
		arr5[1] = b;
		arr5[2] = c;
		//크기가 다른 배열로 이루어진 다차원 배열을 비정방배열이라고 함
		
		for(int i = 0; i < arr5.length; i++) {
			for(int k = 0; k < arr5[i].length; k++) {
				System.out.print(arr5[i][k]+" ");
			}
			System.out.println();
		}
		//자바스크립트 - 배열에 정수나 실수나 문자열을 복합적으로 저장할 수 있다.
		//자바 - 배열생성시 부여한 데이터 타입에 맞는 데이터만 저장 가능
		
//		int num11 = scan.nextInt();
//		scan.nextLine(); //숫자 입력후 엔터 입력시 버퍼에 엔터가 남아서 엔터를 빼주는과정
//		String word = scan.nextLine();
//		System.out.println( num11 + " "+ word );
		
		String[][] info = new String[3][3];
		String[] key = {"이름","나이","직업"};
		
		for(int i = 0; i < info.length; i++) {
			System.out.print("이름 : ");
			info[i][0] = scan.nextLine();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			info[i][1] = Integer.toString(age); // Integer.toString 정정수를 문자열로 변경 float 실수를 문자열로 변경
												// Integer.parseInt(); 문자열을 숫자로 변경
												// Float.parseFloat(); Double.parseDouble();
			scan.nextLine();
			System.out.print("직업 : ");
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
