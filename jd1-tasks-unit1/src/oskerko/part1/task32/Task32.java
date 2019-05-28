package oskerko.part1.task32;

import oskerko.scans.ScanInts;

/* 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
Какое время будут показывать часы через р ч q мин r с?*/

public class Task32 {

	public static void main(String[] args) {
 
		int h1;
		int m1;
		int s1;
		
		int h2;
		int m2;
		int s2;
		
		int h;
		int m;
		int s;
		
		h1 = ScanInts.scanInts(" текущее зеачение (час) (0 ≤ h1 ≤23)");
		while (h1 < 0 || h1 > 23 ) {
			System.out.println("неверное значение");
			h1 = ScanInts.scanInts(" текущее зеачение (час) (0 ≤ h1 ≤23)");
		}
		
		m1 = ScanInts.scanInts(" текущее зеачение (мин) (0 ≤ m1 ≤59)");
		while (m1 < 0 || m1 > 59 ) {
			System.out.println("неверное значение");
			m1 = ScanInts.scanInts(" текущее зеачение (мин) (0 ≤ m1 ≤59)");
		}
		
		s1 = ScanInts.scanInts(" текущее зеачение (сек) (0 ≤ s1 ≤59)");
		while (s1 < 0 || s1 > 59 ) {
			System.out.println("неверное значение");
			s1 = ScanInts.scanInts(" текущее зеачение (сек) (0 ≤ s1 ≤59)");
		}
		
		
		
		h2 = ScanInts.scanInts(" значение, которое нужно добавить (час) (0 ≤ h2 ≤23)");
		while (h2 < 0 || h2 > 23 ) {
			System.out.println("неверное значение");
			h2 = ScanInts.scanInts(" значение, которое нужно добавить (час) (0 ≤ h2 ≤23)");
		}
		
		m2 = ScanInts.scanInts(" значение, которое нужно добавить (мин) (0 ≤ m2 ≤59)");
		while (m2 < 0 || m2 > 59 ) {
			System.out.println("неверное значение");
			m2 = ScanInts.scanInts(" значение, которое нужно добавить (мин) (0 ≤ m2 ≤59)");
		}
		
		s2 = ScanInts.scanInts(" текущее зеачениезначение, которое нужно добавить (сек) (0 ≤ s2 ≤59)");
		while (s2 < 0 || s2 > 59 ) {
			System.out.println("неверное значение");
			s2 = ScanInts.scanInts(" значение, которое нужно добавить (сек) (0 ≤ s2 ≤59)");
		}
		
		
		s = s1 + s2;
		m = m1 + m2;
		h = h1 + h2;
		
		if (s > 59) {
			m++ ;
			s = s % 60;
		}
		
		if (m > 59) {
			h++;
			m = m % 60;
		}
		
		if (h > 23) {
			h = h % 24;
		}
		
		String hh = String.format("%02d", h);
		String mm = String.format("%02d", m);
		String ss = String.format("%02d", s);
		System.out.println(hh + "ч " + mm + "мин " + ss + "сек");
		
	}

}
