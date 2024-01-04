package javaSet;

import java.util.TreeSet;

public class set_study2 {
	
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		do {
			int num = (int)(Math.random()*50)+1;
			tree.add( num );
		}while( tree.size() < 10);
		System.out.println( tree );
		
		//검색
		
		System.out.println( tree.floor(1));
		// floor = 일치하는 데이터 검색 없을시 작은값들 중 제일 가까운 수 출력 그래도 없으면 null
		System.out.println(tree.headSet(25));
		// headSet - 지정한 값보다 작은 값 전체 출력
		System.out.println( tree.higher(40));
		// higher 지정한 값보다 큰 값중에 가장 가까운값 출력
		System.out.println( tree.lower(30));
		// lower 지정한 값보다 작은 값 중에서 가장 가까운값 출력 %floor와 lower의 차이 floor은 지정한 값과 일치하는 값을 출력하지만 lower는 지정한 값보다 작아야 함
		System.out.println( tree.subSet(10, 30));
		// subSet(x,t) x초과 y미만
		
	}
}
