package org.sample;

public class Mobile1 {

	public void sendSms()	{
		System.out.println("From oppo");
	}

	public void makeCall()	{
		System.out.println("Calling my friend");
	}

	public static void main(String[] args) {

		Mobile1 calling = new Mobile1();
		calling.sendSms();
		calling.makeCall();

	}

}
