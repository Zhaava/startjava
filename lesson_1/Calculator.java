public class Calculator {
	public static void main(String[] args) {
		int firstNumb = 5, secondNumb = 2;
		double result = 0;
		char mathSign = '%';

		if (mathSign == '+') {
			result = firstNumb + secondNumb;
		} else if (mathSign == '-') {
			result = firstNumb - secondNumb;
		} else if (mathSign == '*') {
			result = firstNumb * secondNumb;
		} else if (mathSign == '/') {
			result = firstNumb / (double) secondNumb;
		} else if (mathSign == '^') {
			result = 1;
			for (int i = 0; i < secondNumb; i++) {
				result *= firstNumb;
			}
		} else if (mathSign == '%') {
			result = firstNumb % secondNumb;
		}

		System.out.println(firstNumb + " " + mathSign + 
							" " + secondNumb + " = " + result);
	}
}