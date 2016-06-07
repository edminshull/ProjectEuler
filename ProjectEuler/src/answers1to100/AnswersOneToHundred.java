package answers1to100;

public class AnswersOneToHundred {

	public static void main(String[] args) {
		long count = 0;
		// Question One 
		System.out.println("Question One");
		sumMultiples(3, 5, 1000);

		System.out.println("Question Two");
		// Question Two
		// will loop through the sequence but need to 
		// break out before count is greater than 4 million
		for (int i = 1; i <= 4000000; i++) {
			if (fibonacciEven(i) % 2 == 0) {
				count += fibonacciEven(i);
				if (count >= 4000000) {
					break;
				}
			}

		}
		System.out.println(count);

		System.out.println("Question Three");
		// Question Three
		largestPrimeFactors(600851475143l);

		System.out.println("Question Four");
		// Question Four
		System.out.println(palindromeBuilder(999, 100));

		System.out.println("Question Five");
		// Question Five
		smallestNum(2);

	}

	/**
	 * Answer method for question one
	 * Here we need to find the natural numbers below (num3)
	 * that are mutilples of (num1) and (num2)
	 * 
	 * @param num1 - first multiple that will be used
	 * @param num2 - second multiple that will be used
	 * @param num3 - The number that the problem goes up to
	 */
	public static void sumMultiples(int num1, int num2, int num3) {
		int count = 0;

		for (int i = 1; i < num3; i++) {
			if (i % num1 == 0 || i % num2 == 0) {
				count += i;
			}
		}

		System.out.println(count);

	}

	/**
	 * Fibonacci sequence for question two using recursion for the sequence
	 * 
	 * @param num - the number given to the sequence
	 * @return
	 */
	public static long fibonacciEven(long num) {
		if ((num == 0) || (num == 1)) { // base cases
			return num;
			// recursive step
		} else {
			return fibonacciEven(num - 1) + fibonacciEven(num - 2);
		}

	}

	/**
	 * Answer method for question three
	 * we are given a number (num) and must work out
	 * the largest prime factor for it
	 * 
	 * @param num
	 */
	public static void largestPrimeFactors(long num) {
		long count;

		for (long i = 2; i <= num; i++) {
			count = 0;
			while (num % i == 0) {
				num /= i;
				count++;
			}
			if (count == 0)
				continue;
			System.out.println(i);
		}
	}

	/**
	 * Answer method for question four
	 * We must find the largest palindrome number
	 * from the product of two 3-digit numbers
	 * 
	 * @param num1 - upper boundry of problem (i.e in this case 999)
	 * @param num2 - lower boundry of problem (i.e in this case 100)
	 * @return
	 */
	public static int palindromeBuilder(int num1, int num2) {
		int value = 0;

		for (int i = num1; i >= num2; i--) {
			for (int j = i; j >= num2; j--) {

				int value1 = i * j;
				StringBuilder sb1 = new StringBuilder("" + value1);
				String sb2 = "" + value1;
				sb1.reverse();
				if (sb2.equals(sb1.toString()) && value < value1) {
					value = value1;
					System.out.println("I equals : " + i + " J equals : " + j);
				}

			}
		}

		return value;
	}

	/**
	 * Answer method for question five
	 * We must find the smallest positive number that is 
	 * evenly divisble by all the numbers from 1 to 20
	 * 
	 * @param num1 - the number we want to stop the loop at
	 */
	public static void smallestNum(int num1) {
		int value = 0;
		for (int i = 320000000; i >= num1; i--) {
			if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0
					&& i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0
					&& i % 10 == 0 && i % 11 == 0 && i % 12 == 0 && i % 13 == 0
					&& i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0
					&& i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
				value = i;
			}

		}
		System.out.println(value);
	}
}
