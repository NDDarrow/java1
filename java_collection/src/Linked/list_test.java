package Linked;

public class list_test {
	
	public static void main(String[] args) {
		
		linkedList list = new linkedList();
		list.add("이순신");
		list.add("김유신");
		list.add("오펜하이머");
		list.add("폴 피닉스");
		list.add("리처드 파인만");
		
		System.out.println( list );
		System.out.println( list.get(2));
		
		list.remove(1);
		System.out.println( list );
		
		list.add(4,"강감찬");
		System.out.println( list );
		
	}
}
