package 과제;

public class car {
	int displacement = 3000;
	int weight = 1000;
	String color = "blue";
	String brand = "현대";
	
	@Override
	public String toString() {
		return "배기량: " + displacement + "cc 차중량: " + weight + "kg \n색상 : " + 
				color + " 브랜드 : " + brand;
	}
}
