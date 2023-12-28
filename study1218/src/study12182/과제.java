package study12182;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과제- 자바 배열 문제
		//  {30, 4, 50, 60, 14, 80, 45, 72, 94, 25}
		// 10개의 정수가 저장된 배열의 값을 확인하고
		// 평균을 구하세요.
		// 10개 정수의 평균이하인 숫자들은 F, 평균 이상인 숫자들은 A 라고 표기되는
		// 배열을 만들어 출력하세요.
		
		//출력 결과 - F, F, A, A, F, A, F, A, A, F
		
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
