package 과제;

public class sedan extends car{
	boolean gear_type = true;
	String gear;
	
	@Override
	public String toString() {
		if( gear_type ) { this.gear = "수동";}
		return "배기량: " + displacement + "cc 차중량: " + weight + "kg \n색상 : " + 
				color + " 브랜드 : " + brand + " 기어는 : " + this.gear;
	}
}

