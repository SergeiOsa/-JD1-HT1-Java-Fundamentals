package oskerko.part1.task37;

import oskerko.scans.*;

// • Сумма цифр данного трехзначного числа N является четным числом.

public class Task373 {

	public static void main(String[] args) {
	
		int n;
		int lenght;
		do 
		{
			n = ScanInts.scanInts("трёхзнач число:");
			String str = Integer.toString(n);
		    lenght = str.length();
			if(lenght !=3) {
				System.out.println("не трёхзнач число");
			}
		}
		while(lenght!=3);
		
		System.out.println((n%10 + n/10%10 + n/100%10) % 2 == 0);
		
	}

}
