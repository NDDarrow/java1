package Linked;

public class linkedList {

	static int cnt = 0;
	private node head = null; //링크드 리스트의 맨앞노드
	private node tail = null; //링크드 리스트의 맨뒤노드
	
	
	//데이터 추가
	public void add(String name) {
		node temp = new node(name);
		temp.index = cnt;
		cnt++;
		if( head == null) {
			head=temp;
			tail=temp;
		}else {
			tail.setNext( temp );
			tail = temp;
		}
	}
	
	//데이터 출력
	public node get(int index) {
		node find = head; //링크드리스트 첫번째노드부터 시작
		while(find != null) {
			if(find.index == index) {
				return find;
			}
			find = find.getNext(); //현재노드의 다음 노드로 이동
		}
		return null;
	}
	//데이터 삭제
	public boolean remove(int index) {
		node find = head; //첫번째 노드부터 시작;
		if(head.index == index) {//첫번째 노드 삭제
			head = head.getNext();
			reindex();
			cnt--;
		}else {
		while( find.getNext() != null ) {
			if( find.getNext().index == index) {
				node del = find.getNext(); //삭제할 노드 del에 저장
				find.setNext( del.getNext() ); // del의 next를 앞쪽 node next에 저장
				reindex();
				cnt--;
				return true;
			}
		find = find.getNext();
		}
	}
	return false;
}
		
	//데이터 삽입
	public void add(int index, String name) {
		
		node temp = new node(name);
		cnt++;
		
		node find = head; //첫번째 노드부터 시작
		if( index == 0) { //링크드리스트 맨앞에 추가삽입한다면
			temp.setNext(head);
			head = temp;
		}else {
			//4번째에 새 노드합입할때 설명
			while(find.getNext() != null) { //finde는 3번째 노드
				if( find.getNext().index == index) {
					temp.setNext(find.getNext());
					//새로운 node의 next에 3번째 노드의 next(4번째)를 저장
					find.setNext(temp);
					//3번째 노드의 next에 새노드의 주소를 저장
				}
				find = find.getNext();
			}
		}
		reindex();
	}
	private void reindex() {
		node location = head;
		// 첫번째 노드부터 시작해서 인덱스 0부터 재설정
		int i = 0;
		while(location != null) { //마지막 노드 까지
			location.index = i++;
			location = location.getNext(); //다음 노드 이동
		}
	}
	
	//링크드 리스트 전체 출력
	@Override
	public String toString() {
		String out = "[";
		node move = head; //링크드리스트의 첫번째노드
 		while(move != null) { // 마지막 노드의 next는 null 이기 때문에
 			out += move.getName()+"\n";
 			move = move.getNext();	///현재 노드에서 다음 노드로 이동
 		}
						
		out +="]";
		
		return out;
	}
}
