package org.week3.sample;

public class SmartPhone extends AndroidPhone	{
	
	public void connectWhatsApp()	{
		System.out.println("Whats app features");
	}

	public static void main(String[] args) {
		
		SmartPhone mobile = new SmartPhone();
		mobile.sendMsg();
		mobile.makeCall();
		mobile.saveContact();
		mobile.takeVideo();
		mobile.connectWhatsApp();
		
		
	}

}
