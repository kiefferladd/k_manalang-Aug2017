// Kieffer Manalang
// September 5, 2017
// Pair Programming 
import java.util;
import java.util.Scanner;

public class PairProgramming{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("How many numbers do you want to add?");
		int totalNumber = scanner.nextInt();
		int sum = 0;
		int min = 0;
		int max = 0;
		boolean maxEven = 0;
		boolean minSet = false;
		boolean maxSet = false;
		for (int i = 0; i < totalNumber; i++) {
			System.out.print("#" + i + "?");
			int next = scanner.nextInt();
			
			if(next % 2 == 0) {
				sum += next;
				if (!maxSet || next > maxEven) {
					maxSet = true;
					maxEven = next;
				}
			}
				if (!minSet || next > min) {
				minSet = true;
				min = next;
		}
				if (!maxSet || next > max) {
					maxSet = true;
					max = next;
	}
}
		System.out.print("Smallest Number =");
		if (minSet) {
			System.out.println(min);
		} else {
			System.out.println("No min value");
		}
		System.out.print("Largest Number =");
		if (maxSet) {
			System.out.println(max);
		} else {
			System.out.println("No max value");
		}
		System.out.println("Sum of even numbers =" + sum);
		System.out.print("Largest even numner =");
		System.out.print("Smallest Number =");
		if (maxEven) {
			System.out.println(maxEven);
		} else {
			System.out.println("No max even value");
		}
}
}