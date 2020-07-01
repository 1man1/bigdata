package JC;

public class BrandTV extends TV{
	
	String brand;
	
	public BrandTV(int intValue, String StrValue) {
		super.channel = intValue;
		this.brand= strValue;
	}

	public static void main(String args[]) {
		BrandTV objTV = new BrandTV(11, "samsung TV");
		objTV.channelUp();
		System.out.println(objTV.brand + " 현재 채널은 " +objTV.channel + "번입니다.");
	}
}
