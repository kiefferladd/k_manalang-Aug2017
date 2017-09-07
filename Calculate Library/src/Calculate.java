// Kieffer Manalang
// September 5, 2017
// This is our home grown library that will contain various mathematical methods. 
public class Calculate {
	
	/* This takes an integer and returns its square.*/

	public static int square (int operand) {
		return operand* operand;
		
}
	public static int cube (int operand2) {
		return operand2* operand2;
	
	}
	public static double average (double number1, double number2) {
		return (number1 + number2)/2;
}
	public static double average (double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
}
	public static double ToDegrees (double angleradians) {
		return  angleradians * (3.14159/180);
}
	public static double ToRadians (double angleradians) {
		return  angleradians * (180/3.14159);
}
}