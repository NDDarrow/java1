package arraylist;

public class test {

	public static void main(String[] args) {
		box<orange> o =  new box<orange>();
	
		box<toy> t = new box<toy>();
		
		t.createBox(new toy());
		
	}

}


class orange{
	public String toString() {
		return "오렌지 박스";
	}
}
class toy{
	public String toString() {
		return "장난감 박스";
	}
}
class apple{
	public String toString() {
		return "사과 박스";
	}
}
