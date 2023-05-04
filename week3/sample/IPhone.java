package org.week3.sample;

public class IPhone extends Android1 implements Mobile1	{

	public static void main(String[] args) {
		
		IPhone obj = new IPhone();
		obj.sendSMS();
		obj.dialNumber();
		obj.switchOn();
		obj.makeCall();
		obj.touchPad();

	}

	@Override
	public void sendSMS() {
		System.out.println("Text message services");
		
	}

	@Override
	public void dialNumber() {
		System.out.println("Dialing number 9042631080");
		
	}

	@Override
	public void switchOn() {
		System.out.println("Switching on");
		
	}

	@Override
	public void touchPad() {
		System.out.println("Toouch pad feature");
		
	}

}
