package gradereader;

public class gradeclassifier {

	public static void main(String[] args) {
	int grades[] = {12, 105, 95, 43, 50, 78, 66, 33, 82, 21};
	int i;
	
	for(i =0; i <= 9; i++) {
	
	if (grades[i] < 0) {
		throw new IllegalArgumentException("Error: ineligible value, please enter an eligible value");
	}
	else if (100 < grades[i]) {
		throw new IllegalArgumentException("Error: ineligible value, please enter an eligible value");
	}
	else if (grades[i] < 40) {
		System.out.println(grades[i] + " = F");
	}
	else if (grades[i] < 50) {
		System.out.println(grades[i] + " = E");
	}
	else if (grades[i] < 60) {
		System.out.println(grades[i] + " = D");
	}
	else if (grades[i] < 80) {
		System.out.println(grades[i] + " = C");
	}
	else if (grades[i]< 90) {
		System.out.println(grades[i] + " = B");
	}
	else if (grades[i] < 101) {
		System.out.println(grades[i] + " = A");
	}
	
	}

	}
}
