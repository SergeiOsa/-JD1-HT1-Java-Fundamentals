package oskerko.part3.task16;

// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {

	public static void main(String[] args) {
		
		long mul = 1;
		int sum = 1;
		
		for(int i = 2; i <=10; i++) {
			sum = sum + i;
			mul = mul * sum;
		}

		System.out.println("mul=" + mul);

		
	}

}
