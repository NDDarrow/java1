package study12182;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����- �ڹ� �迭 ����
		//  {30, 4, 50, 60, 14, 80, 45, 72, 94, 25}
		// 10���� ������ ����� �迭�� ���� Ȯ���ϰ�
		// ����� ���ϼ���.
		// 10�� ������ ��������� ���ڵ��� F, ��� �̻��� ���ڵ��� A ��� ǥ��Ǵ�
		// �迭�� ����� ����ϼ���.
		
		//��� ��� - F, F, A, A, F, A, F, A, A, F
		
		int[] score = {30, 4, 50, 60, 14, 80, 45, 72, 94, 25};
		int sum = 0;
		int avr = 0;
		String[] result = new String[10];
		
		System.out.println( Arrays.toString(score));
		
		for(int i = 0; i < score.length; i++ ){
			sum += score[i];
		}
		avr = sum/score.length;
		
		for(int i = 0; i < score.length; i++){
			if( score[i] <= avr) {
				if(i == score.length-1) {
					result[i] = "F";
					System.out.print("F");
				}
				else{
					result[i] = "F";
					System.out.print("F ,");
				}
			}else{
				if(i == score.length-1) {
					result[i] = "A";
					System.out.print("A");
				}else{
					result[i] = "A";
					System.out.print("A ,");
				}
			}
		}
		System.out.println();
		System.out.print( Arrays.toString(result));
	}

}
