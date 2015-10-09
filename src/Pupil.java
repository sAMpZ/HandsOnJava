import java.util.InputMismatchException;
import java.util.Scanner;

public class Pupil {

	// total marks for each subject
	final int math_total_marks = 20;
	final int english_total_marks = 20;
	final int science_total_marks = 20;
	final int hindi_total_marks = 20;
	final int social_science_total_marks = 20;

	// total marks available overall
	final int total_marks = (math_total_marks + english_total_marks
			+ science_total_marks + hindi_total_marks + social_science_total_marks);

	// get the mark from sys in
	public int getMark(String s, Scanner scanner) {
		int input = 0;

		System.out.println("Enter the " + s + " mark : ");
		input = scanner.nextInt();
		if (rangeCheck(input) == false) {
			System.out.println("Out of range, try again");
			input = getMark(s, scanner);
		}

		return input;

	}

	// checks if the score entered is in the correct range
	public boolean rangeCheck(int x) {

		if (x < 0 || x > 20) {

			return false;
		} else {

			return true;
		}

	}

}

class Grades {

	public static void main(String[] args) {

		Pupil pupil = new Pupil();

		// create scanner object
		Scanner scanner = new Scanner(System.in);

		// get the marks for each subject
		int mathmark = pupil.getMark("math", scanner);
		int englishmark = pupil.getMark("english", scanner);
		int sciencemark = pupil.getMark("science", scanner);
		int hindimark = pupil.getMark("hindi", scanner);
		int socialsciencemark = pupil.getMark("social science", scanner);

		scanner.close();

		// total marks overall subjects
		int pupil_mark = mathmark + englishmark + sciencemark + hindimark
				+ socialsciencemark;
		System.out.println(pupil_mark);

		// calculate percentage
		float grade_in_percentage = ((float) pupil_mark / (float) pupil.total_marks) * 100;
		System.out.println(pupil.total_marks);
		System.out.println(grade_in_percentage);

		// grade category
		if (grade_in_percentage < 40) {

			System.out.println("Grade is poor");
		}
		if (grade_in_percentage >= 40 && grade_in_percentage <= 59) {

			System.out.println("Grade is average");
		}

		if (grade_in_percentage >= 60 && grade_in_percentage <= 79) {

			System.out.println("Grade is Good");
		}

		if (grade_in_percentage >= 80 && grade_in_percentage <= 99) {

			System.out.println("Grade is very good");
		}

		if (grade_in_percentage >= 90) {

			System.out.println("Grade is excellent");
		}

	}

}
