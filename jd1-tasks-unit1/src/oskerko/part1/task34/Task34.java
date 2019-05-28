package oskerko.part1.task34;

import java.util.Scanner;



public class Task34 {
	
	public static void main(String[] args) {
		
		byte b;
		
		int x;
		long l;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите значение A в byte");

		
		while(!sc.hasNextByte()) {
			System.out.println("A not byte, введите A");
			sc.nextLine();

		}
		
		b = sc.nextByte();
		System.out.println("A = " + b);
		
		x = b;
		l = b;
		
		System.out.println("A in int: " + x);
		System.out.println("A in long: " + l);
	}

}
