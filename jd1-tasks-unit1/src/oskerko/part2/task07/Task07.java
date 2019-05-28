package oskerko.part2.task07;
 
import oskerko.scans.*;

// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

public class Task07 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int x;			
			
		double z;
			
		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		c = ScanInts.scanInts(" c");
		x = ScanInts.scanInts(" x");
		
		z = a*x*x + b*x + c;
		
		if(z < 0) {
			z = z * (-1);
		}
		
		System.out.println(z);
		
	}

}
