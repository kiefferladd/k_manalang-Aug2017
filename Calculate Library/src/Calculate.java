// Kieffer Manalang
// September 5, 2017
// This is our home grown library that will contain various mathematical methods. 
public class Calculate {

	/* This takes an integer and returns its square.*/

	public static int square (int operand) {
		return operand* operand;

	}
	/* This takes an integer and returns its cube.*/
	public static int cube (int operand2) {
		return operand2* operand2;

	}
	/* This takes two integers and divides it by how many integers are there.*/
	public static double average (double number1, double number2) {
		return (number1 + number2)/2;
	}

	/* This takes two integers and divides it by how many integers are there.*/
	public static double average (double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	}

	/* (I don't really know how to explain this.*/
	public static double toDegrees (double angleradians) {
		return  angleradians * (180/3.14159);
	}

	/* (I don't really know how to explain this.*/
	public static double toRadians (double angledegrees) {
		return  angledegrees * (3.14159/180);
	}

	/* (I don't really know how to explain this.*/
	public static double discriminant (double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}

	/* Takes the whole number and multiply it to the sum of the numerator and denominator*/
	public static String toImproperFrac (int whole, int topnumber, int bottomnumber) {
		if (bottomnumber==0) {
			throw new IllegalArgumentException("can't divide by 0");
		}
		String answer = (whole*bottomnumber+topnumber + "/" + bottomnumber);
		return answer;
	}

	/* Takes the top number (numerator) divides it by the bottom number (denominator).*/
	public static String toMixedNumber (int topnumber, int bottomnumber) {
		if (bottomnumber==0) {
			throw new IllegalArgumentException("can't divide by 0");
		}
		int wholenumber = topnumber/bottomnumber;
		int fraction = bottomnumber%topnumber;
		String answer = (wholenumber+" "+fraction+"/"+bottomnumber);
		return answer;
	}

	/* (I don't really know how to explain this.*/
	public static String foil (int a, int b, int c, int d, String n) {
		String answer = (a*c) +n+"^2+" + ((a*d)+(b*c))+n+"+"+(b*d);
		return answer;
	}

	/* (I don't really know how to explain this.*/
	public static boolean isDivisibleBy (int divisor, int dividend) {
		if  (divisor==0) {
			throw new IllegalArgumentException("can't divide by 0");
		}
		if (dividend % divisor ==0) {
			return true;
		}
		else {
			return false;

		}
	}

	/* (I don't really know how to explain this.*/
	public static double absValue (double value) {
		if (value < 0) {
			double answer = -value;
			return answer;
		}
		else {
			double answer = value;
			return answer;

		}
	}

	/*Takes the maximum of the two integers*/
	public static int max (int num1, int num2){
		if(num1==num2){
			throw new IllegalArgumentException("can't be same number");
		}

		if (num1 > num2){
			int answer = num1;
			return answer;
		}
		else {
			int answer = num2;
			return answer;
		}
	}

	/*Takes the maximum of the three integers*/
	public static double max (double number1, double number2, double number3) {
		if (number1==number2 && number2==number3) {
			throw new IllegalArgumentException("can't be the same number");
		}
		if (number1>number2 && number1>number3) {
			double answer = number1;
			return answer;
		}
		if (number2>number1 && number2>number3) {
			double answer = number2;
			return answer;
		}
		else {
			double answer = number3;
			return answer;
		}
	}


	/*Takes the minimum of two numbers*/
	public static int min (int number1, int number2){
		if(number1==number2){
			throw new IllegalArgumentException("can't be same number");
		}
		if (number1 > number2){
			int answer = number2;
			return answer;							
		}
		else {
			int answer = number1;
			return answer;
		}
	}

	/* (I don't really know how to explain this.*/
	public static double round2 (double number){
		int firststep = ((int)(number * 100));
		if ((number * 100)-firststep >= .5){
			double roundup = ((int)(number*100)+1)/(double)100;
			return roundup;		
		}
		else {
			double rounddown = (int)(number*100)/((double)100);
			return rounddown;
		}
	}

	/* (I don't really know how to explain this.*/
	public static double exponent(double base, int exponent){
		if (exponent<0){
			throw new IllegalArgumentException("exponent must be positive");
		}
		if (exponent==0){
			return 1;
		}
		double answer = base;
		for (int i = 1; i < exponent; i++){
			answer *= base;	
		}
		return answer;				
	}

	/* (I don't really know how to explain this.*/
	public static int factorial(int number){
		if (number<0){
			throw new IllegalArgumentException("number must be positive");
		}
		int answer = number;
		if (number==0){
			answer = 1;
		}
		for (int i = number-1; i > 0 ; i--){
			answer = answer * i;	
		}
		return answer;
	}

	/* (I don't really know how to explain this.*/
	public static boolean isPrime (int number){
		if (number < 2){
			throw new IllegalArgumentException("n must 2 or greater");
		}
		boolean prime = true;
		for (int i = 2; i < number; i++){
			if (Calculate.isDivisibleBy(number,i)== true){
				prime = false;
			}
		}
		return prime;
	}

	/* (I don't really know how to explain this.*/
	public static int gcf (int number1, int number2){
		if (number1 < 1 || number2 < 1){
			throw new IllegalArgumentException("numbers must be greater than 1");
		}
		int smaller = Calculate.min(number1 , number2);
		int bigger = (int) Calculate.max(number1, number2);
		while (bigger != smaller && bigger > 0){
			bigger = bigger - smaller;
		}
		if (bigger < 0){
			bigger = -bigger;
		}
		return bigger;
	}
	public static double sqrt(double num) {
		if (num<0) {
			throw new IllegalArgumentException("n must be positive");
		}
		double root = 0;
		while (root * root > ( 
				{
			while ( root * root < num) {
				root = root + .001;
			}
			if ( root * root > num) {
				root = root - .001;
			}
				}
		root = Calculate.round2(root);
		return root;
	}
	/* uses the quadratic formula the approximate the real roots*/
	public static String quadForm(int a, int b, int c){

		if (Calculate.discriminant(a,b,c) < 0){
			throw new IllegalArgumentException("no real roots");
		}
		else if (Calculate.discriminant(a,b,c) == 0){
			String roots = Calculate.round2(-b /(2*a)) + " ";
			return roots;
		}
		else {
			double root1 =  Calculate.round2((-b + Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
			double root2 =  Calculate.round2((-b - Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
			if (root1 > root2){
				String roots = root2 + " and " + root1;
				return roots;
			}
			else {
				String roots = root1 + " and " + root2;
				return roots;
			}
		}		
	}

}




