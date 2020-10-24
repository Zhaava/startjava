public class Calculator {
	public static void main(String[] args) {
		int firstNumb = 5, secondNumb = 2;
		double result = 1;
		char calcOperation = '*';

		if (calcOperation == '+') {
			result = firstNumb + secondNumb;
		} else if (calcOperation == '-') {
			result = firstNumb - secondNumb;
		} else if (calcOperation == '*') {
			result = firstNumb * secondNumb;
		} else if (calcOperation == '/') {
			result = firstNumb / (double) secondNumb;
		} else if (calcOperation == '^') {
			for (int i = 0; i < secondNumb; i++) {
				result *= firstNumb;
			}
		} else if (calcOperation == '%') {
			result = firstNumb % secondNumb;
		}

		System.out.println(firstNumb + " " + calcOperation + 
							" " + secondNumb + " = " + result);
	}
}