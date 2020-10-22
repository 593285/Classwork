package gradereader;

import static javax.swing.JOptionPane.*;

public class gradeclassifier {

	
	
	public static String lettergrade(int grade) {
	
	grade = 55;
	String result = "";
	
	if (grade < 0) {
		result = "ineligible value";
	}
	else if (100 < grade) {
		result = "ineligible value";
	}
	else if (grade < 40) {
		result = "F";
	}
	else if (grade < 50) {
		result = "E";
	}
	else if (grade < 60) {
		result = "D";
	}
	else if (grade < 80) {
		result = "C";
	}
	else if (grade < 90) {
		result = "B";
	}
	else if (grade < 101) {
		result = "A";
	}
	return result;
	
}
	public static void main(String[] args) {
		String numberscore = showInputDialog("Enter a number to classify: ");
		System.out.println("number score: " + numberscore);
		
		int numberscoreint = Integer.parseInt(numberscore);
		
		String result = lettergrade(numberscoreint);
		
		if(result.equals("ineligible value")) {
			String illegal = showInputDialog("ineligible value, please enter an eligible value: ");
			System.out.println("new value" + illegal);
			
			int illegalint = Integer.parseInt(illegal);
			result = lettergrade(illegalint);
		}
		showMessageDialog(null, result);
	}
	
	
}
