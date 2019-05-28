package oskerko.part1.task01;

import oskerko.scans.*;

//1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.

public class Task01 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = ScanInts.scanInts("x");
		y = ScanInts.scanInts("y");
		
		
		System.out.println("x = " + x + ";");
		System.out.println("y = " + y + ";");
		
		int z = Math.addExact(x, y);
		System.out.println("Сумма: z = " + z + ";");
		
		int s = Math.subtractExact(x, y);
		System.out.println("Разность: s = " + s + ";");		
	
		int m = Math.multiplyExact(x, y);
		System.out.println("Произведение: m = " + m + ";");
		
		double d = Division.div(x, y);
		System.out.println("Частное: d = " + d + ";");
		
	}
}
