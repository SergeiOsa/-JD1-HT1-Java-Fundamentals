package oskerko.part1.task38;

import oskerko.scans.ScanInts;

//38. Для данных областей составить линейную программу, которая печатает true, 
//если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

public class Task383 {

	public static void main(String[] args) {

		int x;
		int y;
		int r1 = 4;
		int r2 = 5;
		
		x = ScanInts.scanInts("x");
		y = ScanInts.scanInts("y");
		
		System.out.println(((r1 * r1) >=((x*x)+(y*y))&&(y>=0)&&(x>=0)) || ((r2 * r2) >=((x*x)+(y*y))&&(y<=0)&&(x>=0)));
		
	}
	
}
