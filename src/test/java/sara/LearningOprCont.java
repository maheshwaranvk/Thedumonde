package sara;



public class LearningOprCont {
	
	public void divide(int a, int b) {
		
		if(a>b) {
			System.out.println(a/b);
		}
		
		else {
			System.out.println("Division is not possible");
		}
	}
	
	public void findLargerNumber(int a,int b, int c) {
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		
		else if(b>a && b>c) {
			System.out.println("B is greater");
		}
		
		else {
			System.out.println("C is greater");
		}
		
	}
	
	public void findCountry(int countryCode) {
		
		switch (countryCode) {
		case 91:System.out.println("India");
			break;
		case 1:System.out.println("USA");
		break;
		case 31:System.out.println("France");
		break;

		default:
		}
		
	}

	public static void main(String[] args) {
		LearningOprCont obj = new LearningOprCont();
		obj.divide(5, 10);
		obj.findLargerNumber(10, 20, 5);
		obj.findCountry(91);
		
	}
}
