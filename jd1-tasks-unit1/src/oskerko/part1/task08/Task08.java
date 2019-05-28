package oskerko.part1.task08;

import oskerko.scans.*;

// 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

// ( ( b + sqrt( b * b + 4 * a * c ) ) / ( 2 * a ) ) - ( a * a * a * c) + 1 / (b * b) 
// ((b+m)/(2*a))-(a*a*a*c)+1/(b*b)

public class Task08 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		double n;
		double m;
		double z;
		
		
		a = ScanInts.scanInts("a");
		b = ScanInts.scanInts("b");
		c = ScanInts.scanInts("c");
		
		n = Math.pow(b, 2) + 4 * a * c;
		m = Math.sqrt(n);
		z = ( ( b + m ) / ( 2 * a ) ) - ( Math.pow(a, 3) * c ) + ( Math.pow(b, -2) );
		
		System.out.println("Значение выражения: z = " + z);

	}

}
