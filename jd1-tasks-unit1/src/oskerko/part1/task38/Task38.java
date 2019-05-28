package oskerko.part1.task38;

import oskerko.scans.*;

//38. Для данных областей составить линейную программу, которая печатает true, 
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

public class Task38 {

	public static void main(String[] args) {

		int x;
		int y;
		
		x = ScanInts.scanInts("x");
		y = ScanInts.scanInts("y");
		
		System.out.println((y>=0) && (y<=x+4) && (y <= (-1*(x-4))));
	}

}
