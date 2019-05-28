package oskerko.part1.task06;

import oskerko.scans.*;

/* 6. Написать код для решения задачи. В n малых бидонах 80 л молока.
 Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
*/

public class Task06 {
	

	public static void main(String[] args) {
		
		int n;
		int m;
		double z;
		
		n = ScanInts.scanInts("n");
		m = ScanInts.scanInts("m");
		
		double x = n; // doble x вводим для того, чтобы в след выражении 80/x не было целочисл
		
		z = (( 80 / x ) + 12 ) * m;
		System.out.println("Количество литров молока в m бидоннах " + z);
	}

}
