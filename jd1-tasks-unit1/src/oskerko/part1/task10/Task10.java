package oskerko.part1.task10;

import oskerko.scans.*;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// ((sin x + cos y)/(cos x - sin y))*tg xy

public class Task10 {

	public static void main(String[] args) {
		
		int x;
		int y;
		int n;
		double z;
		
		x = ScanInts.scanInts("x");
		y = ScanInts.scanInts("y");
		
		n = x * y;
		
		z = ( ( Math.sin(x) + Math.cos(y) ) / (Math.cos(x) + Math.sin(y) ) ) * Math.tan(n);
		
		System.out.println("Значение выражения: z = " + z);

	}

}
