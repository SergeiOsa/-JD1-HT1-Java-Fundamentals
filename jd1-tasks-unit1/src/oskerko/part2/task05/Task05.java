package oskerko.part2.task05;

import oskerko.scans.*;

 // 5. Составить программу: определения наименьшего из двух чисел а и b.

public class Task05 {

	public static void main(String[] args) {
	
		int a;
		int b;
		
		int min;
		
		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		
		 if (a <= b) {
			 if(a < b) {
			 min = a;
			 System.out.println(min);
			 } else {
				 System.out.println("a = b");
			 }
			 
		 }  else {
			 min = b;
			 System.out.println(min);
		 }
		
	}

}
