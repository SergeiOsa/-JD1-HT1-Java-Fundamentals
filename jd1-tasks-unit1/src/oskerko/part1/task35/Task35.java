package oskerko.part1.task35;

import oskerko.scans.*;

// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class Task35 {
	
	public static void main(String[] args) {
		
		int m;
		int n;
		
		double z;     // M/N
		double d;     // дробная часть
		int c;        //целая часть
		
		int max;
		int min;
		
		m = ScanInts.scanInts("m");
		n = ScanInts.scanInts("n");

		z = (double) m / n;
		c = (int)z;
		d = z - c;
		System.out.println("M/N = " + z);
		System.out.println("Целая часть: " + c);
		System.out.println("Дробная часть: " + d);

		String str1 = Integer.toString(c);
		int lenghtC = str1.length();
		System.out.println("Количество символов целой части " + lenghtC);
		
		String str2 = Double.toString(d);
		int lenghtD = str2.length() - 2;
		System.out.println("Количество символов дробной части " + lenghtD);
		
		// преобразуем целочисл часть в массив интов:
		int[] arrayC = new int [lenghtC];
		int c2 = c;
		for (int i = 0; i < lenghtC; i++) {
			arrayC [i] = (int) (c2 % 10);
			c2 = c2 / 10;
		}
		
		System.out.println("Массив интов целочисл части:");
		for (int i = 0; i < lenghtC; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();
		
		//выбираем мах знач из целочисл:
		max = 0;
		for(int i = 0; i < lenghtC; i++) {
			if (arrayC[i] > max) {
				max = arrayC[i];
			}
		}
		System.out.println("max=" + max);
		
		
		// преобразуем дробную часть в массив интов:
		
		int[] arrayD = new int[lenghtD];
		double d2 = d;
		int d3;
		for (int i = 0; i < lenghtD; i++) {
			arrayD[i] = (int) (d2 * 10);
			d2 = d2 * 10;
			d3 = (int)d2;
			d2 = d2 - d3; //убираем целую часть
		}
		
		System.out.println("Массив интов дробной части:");
		for (int i = 0; i < lenghtD; i++) {
			System.out.print(arrayD[i] + " ");
		}
		System.out.println();
		
		// выбираем min из дробной части:
		min = 9;
		for (int i = 0; i < lenghtD; i++) {
			if(arrayD[i] < min) {
				min = arrayD[i];
			}
		}
		System.out.println("min=" + min);
		
	}

}
