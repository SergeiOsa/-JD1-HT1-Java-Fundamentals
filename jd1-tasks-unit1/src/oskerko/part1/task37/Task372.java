package oskerko.part1.task37;

import oskerko.scans.*;

// Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.

public class Task372 {

	public static void main(String[] args) {
		
		int n;
		int lenght;
		do 
		{
			n = ScanInts.scanInts(" четырёхзнач число:");
			String str = Integer.toString(n);
		    lenght = str.length();
			if(lenght !=4) {
				System.out.println("не четырёхзнач число");
			}
		}
		while(lenght!=4);
		
		System.out.println((n % 10 + (n / 10 % 10)) == (n/100%10 + n/1000%10));
		
	}
}
