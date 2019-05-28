package oskerko.part2.task17;

import oskerko.scans.ScanInts;

// 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом,
// равным большему из исходных,а если равны, то заменить числа нулями.


public class Task17 {

	public static void main(String[] args) {

		int m;
		int n;
		
		m = ScanInts.scanInts(" m");
		n = ScanInts.scanInts(" n");
		
		if (m != n) {
			if (m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		
	}

}
