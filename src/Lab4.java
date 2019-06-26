import java.util.Formatter;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char userDecision = 'y';

		do {

			System.out.println("Enter An Integer");
			int userInput = scnr.nextInt();

			Formatter fmt;

			for (int i = 1; i <= userInput; i++) {
				fmt = new Formatter();

				fmt.format("%4d %4d %4d", i, i * i, i * i * i);
				System.out.println(fmt);
			}
			System.out.println("continue (y/n)?");
			userDecision = scnr.next().charAt(0);

		} while (userDecision == 'y');

		System.out.println("Goodbye");

		scnr.close();

	}
}


      /*public boolean nearHundred(int n) {
          int num1 = 100-n;
          int num2 = 200-n;
          return (Math.abs(num1) <= 10 || Math.abs(num2) <=10);
        }*/