package week1.day1;

public class Mobile {
	
	//Question no. 2

	public void makeCall()	{

		String mobileModel = "OPPO";
		float mobileWeight = 188f;
		System.out.println("Mobile Name : "+mobileModel + '\n' + "Mobile weight : "+mobileWeight);
		//System.out.println("Mobile weight : "+mobileWeight);
	}

	public void sendMsg()	{

		boolean isFullCharged = true;
		int mobileCost = 15000;
		System.out.println("Is mobile fully charged : "+isFullCharged + '\n' +"Mobile cost : "+mobileCost);
		//System.out.println("Mobile cost : "+mobileCost);
	}

	public static void main(String[] args) {

		Mobile info = new Mobile();
		info.makeCall();
		info.sendMsg();
		System.out.println("This is my mobile");

	}

}
