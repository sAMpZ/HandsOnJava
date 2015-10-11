import java.util.InputMismatchException;
import java.util.Scanner;

public class Pupil {

	// get the mark from sys in
	public int getMark(String s, Scanner scanner, int allMarks) {
		int input = 0;

<<<<<<< Updated upstream
		System.out.println("Enter the " + s + " mark : ");
		input = scanner.nextInt();
		if (rangeCheck(input) == false) {
			System.out.println("Out of range, try again");
			input = getMark(s, scanner);
=======
		// trying to handle input error !!breaks if string entered!!
		try {
			System.out.println("Enter the " + s + " mark : ");
			input = scanner.nextInt();
			if (rangeCheck(input, allMarks) == false) {
				System.out.println("Out of range, try again");
				input = getMark(s, scanner, allMarks);
			}
		} catch (InputMismatchException e) {

			System.out.println("Can only be integers, try again");
			scanner.next();
			getMark(s, scanner, allMarks);
>>>>>>> Stashed changes
		}

		return input;

	}

	// checks if the score entered is in the correct range
	public boolean rangeCheck(int x, int y) {

		if (x < 0 || x > y) {

			return false;
		} else {

			return true;
		}

	}

}

