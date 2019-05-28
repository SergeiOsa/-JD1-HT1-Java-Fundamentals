package oskerko.part1.task37;

import oskerko.scans.ScanInts;

// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

public class Task375 {

	public static void main(String[] args) {

		int n;
		int kv;
		int kub;
		
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
		
		kv = n * n;
		int temp = (n%10 + n/10%10 + n/100%10);
		kub = (int) (Math.pow(temp, 3));
		
		System.out.println(kv == kub);
		
	}

}
