package oskerko.part2.task16;

import oskerko.scans.*;

// 16. На плоскости ХОY задана своими координатами точка А. 
// Указать, где она расположена (на какой оси или в каком координатном угле).

public class Task16 {

	public static void main(String[] args) {

		int x;
		int y;
		
		x = ScanInts.scanInts(" x");
		y = ScanInts.scanInts(" y");
		
		if ((x == 0) && (y == 0)) {
			System.out.println("Точка лежит в начале координат");
		}
		
		if ((x == 0) && (y != 0)) {
			System.out.println("Точка лежит на оси OY");
		} 
		
		if ((y == 0) && (x != 0)) {
			System.out.println("Точка лежит на оси OX");
		}  
		
		if ((x > 0) && (y > 0)) {
			System.out.println("Точка лежит в 1ой четверти");
		} 
		
		if ((x < 0) && (y > 0)) {
			System.out.println("Точка лежит во 2ой четверти");
		} 
		
		if ((x < 0) && (y < 0)) {
			System.out.println("Точка лежит в 3ей четверти");
		} 
		
		if ((x > 0) && (y < 0)) {
			System.out.println("Точка лежит в 4ой четверти");
		} 
		
	}

}
