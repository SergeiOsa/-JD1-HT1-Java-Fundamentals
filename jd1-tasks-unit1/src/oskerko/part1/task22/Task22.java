package oskerko.part1.task22;

import oskerko.scans.*;

/*22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

public class Task22 {

	public static void main(String[] args) {
		
		int t;
		int hh;
		int mm;
		int ss;
		
		t = ScanInts.scanInts("T");
		
		if (t >= 0  && t < 60) {
			String s = String.format("%02d", t);
			System.out.println("00ч 00мин " + s + "сек");
		}
				
		if (t >= 60 && t < 3600) {
			mm = t / 60;
			ss = t % 60;
			String m = String.format("%02d", mm);
			String s = String.format("%02d", ss);
			System.out.println("00ч " + m + "мин " + s + "сек");
			}
		
		if(t >=3600 && t < 360000) {
			hh = t / 3600;
			mm = (t - (hh * 3600)) / 60;
			ss = (t - (hh * 3600 + mm * 60)) % 60;
			String h = String.format("%02d", hh);
			String m = String.format("%02d", mm);
			String s = String.format("%02d", ss);
			System.out.println(h + "ч " + m + "мин " + s + "сек");
		}
		
		if (0 > t || t >= 360000) {
			System.out.println("введённое число должно быть от 0 до 359999");
		}
			
	}

}
