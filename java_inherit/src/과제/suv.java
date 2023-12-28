package 과제;

public class suv extends car{
	String WD;
	
	suv(int WD){
		this.WD = WD + "WD";
	}
	
	@Override
	public String toString() {
		return "배기량: " + displacement + "cc 차중량: " + weight + "kg 구동 : " + WD +"\n색상 : " + 
				color + " 브랜드 : " + brand;
	}
	
}
