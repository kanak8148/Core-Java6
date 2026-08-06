package corejavapracticals;

import java.util.Scanner;

public class OnlineCalculater {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pls Inter first digit");
		int a = sc.nextInt();
		
		System.out.println("Pls Inter Second digit");
		int b =sc.nextInt();
		
		System.out.println("Select You oprater + , - , * , /");
		
	String opr = sc.next();
	
	switch (opr) {
	case "+":
		System.out.println("result: " + (a + b));
		break;
	case "-":
		System.out.println("result: " + (a - b));
		break;
	case "*":
		System.out.println("result: " + (a * b));
		break;
	case "/":
		System.out.println("result: " + (b / a));
		break;
	case "%":
		System.out.println("result: " + (b % a));
		break;
	}
	
	sc.close();

}

	
		
	}


