package org.ravi.helloworld;

public class Hello {
	
	public String displayHelloMessage(String message){
		message = "hi";
		return message;
	}
	int target = -5;
	int num = 3;

	target =- num;  // Noncompliant; target = -3. Is that really what's meant?
	target =+ num;

}
