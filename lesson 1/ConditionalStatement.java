public class ConditionalStatement {
	public static void main(String[] args) {
		
		int age = 24;
		
		if (age > 20) {
			System.out.println("Adult");
		}
		
		boolean maleGender = true;
		
		if (maleGender) {
			System.out.println("Male person");
		}

		if (!maleGender) {
			System.out.println("Female person");
		}
		
		double height = 1.75;
		
		if (height < 1.80) {
			System.out.println("Middle");
		} else {
			System.out.println("High");
		}
		
		char firstLetterOfName = 'M';
		
		if (firstLetterOfName == 'M') {
			System.out.println("Mick");
		} else if (firstLetterOfName == 'I') {
			System.out.println("Ira");
		} else {
			System.out.println("Ivan");
		}
	}
}