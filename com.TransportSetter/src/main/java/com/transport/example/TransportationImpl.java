package com.transport.example;

import java.util.Scanner;

public class TransportationImpl implements Transportation{
Scanner sc = new Scanner(System.in);

//Scanner input and switch case display
	public void TransportType() {
		System.out.println("Setter based Injection");
		System.out.println(" 1. for aeroplane \n 2. for Railways \n 3. for Bus");
		int inp = sc.nextInt();
		
		switch (inp) {
		case 1:
			System.out.println("aeroplane Selected");
			break;
			
		case 2:
			System.out.println("Railways Selected");
			break;
			
		case 3:
			System.out.println("Bus Selected");
			break;
			
		default:
			System.out.println("GoodBye");
			break;
		}
	}

}
