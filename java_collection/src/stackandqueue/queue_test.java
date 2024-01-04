package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_test {

	public static void main(String[] args) {
		// 선형 큐
		Queue<String> q = new LinkedList<String>();
		q.add("김민수");
		q.offer("노재홍");
		q.offer("서종우");
		q.offer("박종권");
		
		System.out.println( q );
		System.out.println( q.remove() ); //꺼내기
		System.out.println( q.poll() ); //꺼내기
		// remove와 poll의 차이 - remove는 큐에서 꺼낼 값이 없는 경우 오류, poll은 null 출력
		System.out.println( q.peek() ); //꺼내기
		System.out.println( q.isEmpty() ); //비어있는지 확인
		
		// 우선순위 큐
		// 사전적 순서에 맞게 방출, 영어가 한글보다 우선순위 높음
		Queue<String> pq = new PriorityQueue<String>();
		
		pq.offer("편의점");
		pq.offer("제육볶음");
		pq.offer("육개장");
		pq.offer("백반");
		pq.offer("donkas");
		
		System.out.println( pq );
		System.out.println( pq.poll() );
		System.out.println( pq.poll() ); 
		
		// Deque - 이중 큐 (입출이 이중으로 되어 있는 큐)
		// 입출이 이중이기 때문에 어떻게 사용하냐에 따라서 Stack으로 사용할 수도 queue로 사용할 수도 있다.
		// 맨앞저장 fisrt 맨뒤저장 last
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.addFirst(10);
		dq.offerFirst(20);
		
		dq.addLast(5); // add 메서드 실행과 동일
		dq.offerLast(11); // offer 메서드 실행과 동일
		
		// removefirst, pollfirst, removeLast, pollLast
		
		// dq를 스택으로 사용한다면
		// push, pop 메서드 사용가능
		dq.push(111);
		
		System.out.println( dq );
	}

}

// 큐 - 선입선출, FIFO( 처음들어온 값이 첫번째로 출력된다.)