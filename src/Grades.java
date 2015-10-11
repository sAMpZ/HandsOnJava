import java.util.ArrayList;
import java.util.Scanner;


public class Grades {
	
	public static void main(String[] args) {
		
		//array to contain all subjects
		ArrayList<Subjects> subjectList = new ArrayList<>();
		int totalMarks = 0;
		
		//new subject object for each subject
		Subjects math = new Subjects();
		Subjects english = new Subjects();
		Subjects hindi = new Subjects();
		Subjects science = new Subjects();
		Subjects socialScience = new Subjects();
		
		//set name and max marks for ach subject
		math.setSubject("math");
		math.setMarks(100);
		subjectList.add(math);
		
		english.setSubject("english");
		english.setMarks(100);
		subjectList.add(english);

		hindi.setSubject("hindi");
	    hindi.setMarks(100);
	    subjectList.add(hindi);
	    
	    science.setSubject("science");
		science.setMarks(100);
		subjectList.add(science);
		
		socialScience.setSubject("socialScience");
		socialScience.setMarks(100);
		subjectList.add(socialScience);
		
		//calculate max marks overall
		for(Subjects subject : subjectList){
			
			totalMarks += subject.getMarks();
		}
		
		
		boolean pupils = true;
		Scanner scanner = new Scanner(System.in);
		
		//calculate marks for each pupil until told to end
		while(pupils == true){
		
		Pupil pupil = new Pupil();
		
		// create scanner object
		

		// get the marks for each subject
		int pupilMark = 0;
		for(Subjects subject : subjectList){
			
			String sub = subject.getSubject();
			int maxMark = subject.getMarks();
			pupilMark += pupil.getMark(sub, scanner, maxMark);
			
		}
		

		// total marks overall subjects
		System.out.println(pupilMark);
		System.out.println(totalMarks);

		// calculate percentage
		float gradePercentage = ((float)pupilMark / (float)totalMarks) * 100;
		System.out.println(gradePercentage);

		// grade category
		if (gradePercentage < 40) {

			System.out.println("Grade is poor");
		}
		if (gradePercentage >= 40 && gradePercentage <= 59) {

			System.out.println("Grade is average");
		}

		if (gradePercentage >= 60 && gradePercentage <= 79) {

			System.out.println("Grade is Good");
		}

		if (gradePercentage >= 80 && gradePercentage <= 89) {

			System.out.println("Grade is very good");
		}

		if (gradePercentage >= 90) {

			System.out.println("Grade is excellent");
		}

		
		//determine if want to calulate marks of any more pupils
		System.out.println("Would you like to calulate more grades? Enter Y for yes or N for no");
		
		while(true){
		String moreGrades =scanner.next();	
		
		if(moreGrades.equals("Y")){
			
			pupils = true;
			break;
		}
		else if(moreGrades.equals("N")){
			
			
			System.out.println("End of program");
			pupils = false;
			break;
		}
		else{
			
			System.out.println("Please enter a valid response");
			//scanner.next();
		}
		}
		
		}
		
		scanner.close();
		
	}

}
