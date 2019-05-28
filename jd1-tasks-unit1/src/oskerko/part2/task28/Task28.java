package oskerko.part2.task28;

import java.util.Random;
import oskerko.scans.ScanInts;

// 28. Даны три числа a, b, с. Определить, какое из них равно d. 
// Если ни одно не равно d, то найти max(d — a, d — b, d —c).

public class Task28 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		
		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		c = ScanInts.scanInts(" c");
		
		Random rand = new Random();
		d = rand.nextInt(10);
		System.out.println("d=" + d);

		if((a == d) || (b == d) || (c ==d)) {
			if(a == d) {
				System.out.println(a + "=" + d + " (a=d)");
			}
			if(b == d) {
				System.out.println(b + "=" + d + " (b=d)");
			}
			if(c == d) {
				System.out.println(c + "=" + d + " (c=d)");
			}
		} else {
			if((a <= b) && (a <= c)) {
				System.out.println("max=" + (d - a));
			}
			if ((b <= a) && (b <= c)) {
				System.out.println("max=" + (d - b));
			}
			if ((c <= a) && (c <= b)) {
				System.out.println("max=" + (d - c));
			}
		}
		
	}
}
