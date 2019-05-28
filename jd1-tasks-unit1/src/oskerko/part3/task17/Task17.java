package oskerko.part3.task17;

import oskerko.scans.ScanInts;

// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {

	public static void main(String[] args) {
		
		int a;
		int n;
		
		int sum = 0;
		
		a = ScanInts.scanInts("a");
		n = ScanInts.scanInts("n");

		long mul = a;
		
		for(int i = 1; i < n; i++) {
			sum = a + i;
			mul = mul * sum;
		}
		
		System.out.println("mul=" + mul);
		
	}

}
