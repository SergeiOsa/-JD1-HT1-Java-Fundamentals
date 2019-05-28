package oskerko.part3.task10;

// 10. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task10 {

	public static void main(String[] args) {

		long mul = 1L;
		
		for (int i = 1; i <=33; i++) {
			mul = mul * (i * i);
		}

		System.out.println(mul);
		// переполняется после 33!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}

}
