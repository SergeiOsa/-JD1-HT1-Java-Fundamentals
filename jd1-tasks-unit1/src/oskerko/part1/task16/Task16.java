package oskerko.part1.task16;

import oskerko.scans.*;

// 16. Найти произведение цифр заданного четырехзначного числа.

public class Task16 {

	public static void main(String[] args) {
		int sum = 0;
		int x;
		
		x = ScanInts.scanInts("четырёхзначное целое число");
		while(String.valueOf(Math.abs(x)).length()!=4) {
			System.out.println(x + " - не четерёхзначное число");
			x = ScanInts.scanInts("четырёхзначное целое число");
		}
		
		while(x!=0) {
			sum = sum + x % 10;
			x = x / 10;
		}

		System.out.println("сумма четырёхзначного числа равна " + sum);
	
	}

}
