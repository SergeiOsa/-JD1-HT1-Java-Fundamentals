package oskerko.part2.task01;

import oskerko.scans.*;

/*1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, 
в противном случае – цифру 8.*/

public class Task01 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = ScanInts.scanInts(" 1е число");
		y = ScanInts.scanInts(" 2е число");
		 if (x < y) {
			 System.out.println(7);
		 } else {
			 System.out.println(8);
		 }
	
	}

}
