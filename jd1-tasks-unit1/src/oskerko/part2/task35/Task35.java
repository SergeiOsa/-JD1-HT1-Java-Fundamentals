package oskerko.part2.task35;

import oskerko.scans.ScanInts;

// 35. Вычислить число и месяц в невисокосном году по номеру дня.

public class Task35 {

	public static void main(String[] args) {

		int a;

		do {
			a = ScanInts.scanInts("N дня от 1 до 365");
		} while ((a < 1) || (a > 365));

		if(a <= 31) {
			System.out.printf("%02d.%02d.", a, 1);
		}
		
		if((a > 31) && (a <= 59)) {
			a = a - 31;
			System.out.printf("%02d.%02d.", a, 2);
		}
		
		if((a > 59) && (a <= 90)) {
			a = a - 59;
			System.out.printf("%02d.%02d.", a, 3);
		}
		
		if((a > 90) && (a <= 120)) {
			a = a - 90;
			System.out.printf("%02d.%02d.", a, 4);
		}
		
		if((a > 120) && (a <= 151)) {
			a = a - 120;
			System.out.printf("%02d.%02d.", a, 5);
		}
		
		if((a > 151) && (a <= 181)) {
			a = a - 151;
			System.out.printf("%02d.%02d.", a, 6);
		}
		
		if((a > 181) && (a <= 212)) {
			a = a - 181;
			System.out.printf("%02d.%02d.", a, 7);
		}
		
		if((a > 212) && (a <= 243)) {
			a = a - 212;
			System.out.printf("%02d.%02d.", a, 8);
		}
		
		if((a > 243) && (a <= 273)) {
			a = a - 243;
			System.out.printf("%02d.%02d.", a, 9);
		}

		if((a > 273) && (a <= 304)) {
			a = a - 273;
			System.out.printf("%02d.%02d.", a, 10);
		}
	
		if((a > 304) && (a <= 334)) {
			a = a - 304;
			System.out.printf("%02d.%02d.", a, 11);
		}
		
		if(a > 334) {
			a = a - 334;
			System.out.printf("%02d.%02d.", a, 12);
		}
		
	}

}
