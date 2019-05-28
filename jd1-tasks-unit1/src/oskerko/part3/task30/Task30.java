package oskerko.part3.task30;

import java.util.Scanner;

// 30. Написать программу, переводящую римские цифры в арабские.

public class Task30 {

	public static void main(String[] args) {
		/*	
			I = 1
			V = 5
			X = 10
			L = 50
			C = 100
			D = 500
			M = 1000
			*/
		String r;
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rome");
		r = sc.nextLine();
		
		if (r.equals("I")) {
			a = 1;
		}
		if (r.equals("V")) {
			a = 5;
		}
		if (r.equals("X")) {
			a = 10;
		}
		if (r.equals("L")) {
			a = 50;
		}
		if (r.equals("C")) {
			a = 100;
		}
		if (r.equals("D")) {
			a = 500;
		}
		if (r.equals("M")) {
			a = 1000;
		}
		
	}

}
