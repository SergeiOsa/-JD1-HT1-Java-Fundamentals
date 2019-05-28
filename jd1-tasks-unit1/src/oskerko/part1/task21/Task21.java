package oskerko.part1.task21;

import oskerko.scans.*;

/* 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class Task21 {

	public static void main(String[] args) {
		
		//Первый вариант:
		
		  
		  int n; 
		  int d; 
		  double x;
		  
		  n = ScanInts.scanInts("nnn"); 
		  d = ScanInts.scanInts("ddd");
		  
		  x = (double) d / 1000 + n;
		  
		  System.out.println("nnn.ddd = " + x + ";");
		  
		  x = d + (double) n / 1000;
		  
		  System.out.println("ddd.nnn = " + x + ";");
		 
		
		// Второй вариант (не проходит если число заканчивается на ноль)

		/*
		 * double y;
		 * 
		 * y = ScanDoubles.scanDoubles("число формата nnn.ddd");
		 * while(Double.toString(y).length() != 7 || y <= 100 || y > 1000 ) {
		 * System.out.println("неверный формат"); y =
		 * ScanDoubles.scanDoubles("число формата nnn.ddd"); }
		 * System.out.println("есть");
		 */
		

	}

}
