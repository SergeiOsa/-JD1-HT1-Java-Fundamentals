package oskerko.part1.task38;
import oskerko.scans.ScanInts;

//38. Для данных областей составить линейную программу, которая печатает true, 
//если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

public class Task382 {

	public static void main(String[] args) {

		int x;
		int y;
		
		x = ScanInts.scanInts("x");
		y = ScanInts.scanInts("y");
		
		System.out.println((((x >= -2) && (x <= 2)) && ((y >= 0) && (y <= 4))) || ((x >= -4) && (x <=4)) && ((y >= -3) && (y <= 0)));
		
	}
	
}
