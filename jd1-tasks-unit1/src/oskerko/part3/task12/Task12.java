package oskerko.part3.task12;

// 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте 
//       программу нахождения произведения первых 10 членов этой последовательности.

public class Task12 {

	public static void main(String[] args) {
		int a1 = 1;
		int an;
		long mul = 1L;
		
		for (int i = 2; i < 11; i++) {
			an = 6 + a1;
			a1 = an;
			mul = mul * an;
			System.out.println(mul);
		}
		
		System.out.println("mul="+mul);
		
	}

}
