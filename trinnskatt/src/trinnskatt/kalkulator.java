package trinnskatt;


public class kalkulator {
	
	public static void main(String[] args) {
		int income = 100000; 
		int taxes = 19;
		int tax2 = 42;
		int tax3 = 132;
		int tax4 = 162;
		
		if (income < 180800) {
			System.out.println("no taxes to be paid");
		} 
		
		else if (income < 254500) {
			int calculatedtax;
			calculatedtax = ((income * taxes)/1000);
			System.out.println("you will pay " + calculatedtax + "kr in taxes");
		}
		else if (income < 639750) {
			int calculatedtax2;
			calculatedtax2 =  ((income * tax2)/1000);
			System.out.println("you will pay " + calculatedtax2 + "kr in taxes");
		}
		else if (income < 999550) {
			int calculatedtax3;
			calculatedtax3 =  ((income * tax3)/1000);
			System.out.println("you will pay " + calculatedtax3 + "kr in taxes");
		}
		else if (999550 < income) {
			int calculatedtax4;
			calculatedtax4 =  ((income * tax4)/1000);
			System.out.println("you will pay " + calculatedtax4 + "kr in taxes");
		}
	
	}

}
