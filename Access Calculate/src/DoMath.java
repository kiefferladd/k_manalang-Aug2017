// Kieffer Manalang
// September 5, 2017 
// This is the runner class for my Calculate Library methods

public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(6));
		System.out.println(Calculate.average(5, 10));
		System.out.println(Calculate.average(6, 4, 20));
		System.out.println(Calculate.ToDegrees(40));
		System.out.println(Calculate.ToRadians(40));
		System.out.println(Calculate.discriminant(5, 10, 20));
		System.out.println(Calculate.ToImproperFrac(3, 1, 2));
		System.out.println(Calculate.ToMixedNumber(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n" ));
		System.out.println(Calculate.isDivisibleBy(2, 4));
		System.out.println(Calculate.absValue(4));
		System.out.println(Calculate.max(7, 35));
		System.out.println(Calculate.max(35, 19, 2));
		System.out.println(Calculate.min(70, 31));
		System.out.println(Calculate.round2(7));
		System.out.println(Calculate.exponent(8, 9));
		System.out.println(Calculate.factorial(9));
		System.out.println(Calculate.isPrime(5));
		System.out.println(Calculate.gcf(21, 11));
	}

}
