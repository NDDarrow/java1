package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class line {

	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {	
		
		
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("치즈버거");
		stack.push("핫크리스피버거");
		stack.push("통새우와퍼");
		stack.push("싸이버거");
		stack.push("치킨킹");
		
		System.out.println( stack);
	
		
		System.out.println( stack.pop());
		System.out.println( stack.empty());
		System.out.println( stack);
		System.out.println( stack.peek()); //스택구조에서 빼지 않고 마지막 입력된 값만 알려주는 메서드
		System.out.println( stack.search("싸이버거")); // 찾기
		
		Stack<String> back = new Stack<String>();
		Stack<String> front = new Stack<String>();
		String now = "네이버메인";
		// 브라우저에서 페이지 이동시 스택에 저장되는 방법 구현
		
		while(true) {
		now = pageMove(back, front, now);
		}
	}

	static String pageMove(Stack<String> back, Stack<String> front, String now) {
		System.out.println("이동할 페이지 입력(뒤 - 1, 앞 - 2) : ");
		String url = scan.nextLine();
		
		if( url.equals("1") ) {
			if(back.empty() ) {
				System.out.println("방문한 페이지가 없습니다.");
				url = now;
			}else {
				url = back.pop();
				front.push(now);
			}
		}else if( url.equals("2") ) {
			if( front.empty() ) {
				System.out.println("방문한 페이지가 없습니다.");
				url = now;
			}else {
				url = front.pop();
				back.push(now);
			}
		}else {
			back.push(now);
		}
		
		System.out.println("현재 페이지 : " + url);
		System.out.println("\n==========뒤==========");
		System.out.println( back );
		System.out.println("\n==========앞==========" );
		System.out.println( front + "\n\n");
		
		return url;
	}

}

// stack - 선형자료구조이며, FILO( 첫번째 입력된 값은 마지막에 출력된다.)
//						 LiFO( 마지막에 입력된 값은 첫번째로 출력된다)