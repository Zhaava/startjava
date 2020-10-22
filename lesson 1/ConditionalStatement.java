public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 24;
		boolean maleTrueWomanFalse = true;
		double height = 1.75;
		char firstLetterOfName = 'M';
		
		if (age > 20){
			System.out.println("Adult");
		}

		if (maleTrueWomanFalse){
			System.out.println("Male person");
		}

		if (!maleTrueWomanFalse){
			System.out.println("Female person");
		}

		if (height < 1.80){
			System.out.println("Middle");
		} else {
			System.out.println("High");
		}
		
		if (firstLetterOfName == 'M'){
			System.out.println("Mick");
		} else if (firstLetterOfName == 'I'){
			System.out.println("Ira");
		} else{
			System.out.println("Ivan");
		}
	}
}